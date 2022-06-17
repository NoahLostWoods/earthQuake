package com.terremoti.terremoti.Controller;

import com.terremoti.terremoti.assembler.AllSismaAssembler;
import com.terremoti.terremoti.assembler.SismaAssembler;
import com.terremoti.terremoti.dto.SismaDto;
import com.terremoti.terremoti.factory.SismaFactory;
import com.terremoti.terremoti.models.SismaModel;
import com.terremoti.terremoti.resources.SismaResources;
import com.terremoti.terremoti.service.SismaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sisma", produces = MediaType.APPLICATION_JSON_VALUE)
public class SismaController {

    @Autowired
    private SismaService sismaService;

    @GetMapping("/dataResponse/{id}")
    public ResponseEntity<SismaResources> getData(
            @PathVariable("id") Integer id
    ){
        SismaAssembler sa = new SismaAssembler();
        return ResponseEntity.ok(sa.getResource(sismaService.getOne(id)));
    }

    @PostMapping("/dataResponse")
    public ResponseEntity<Boolean> postData(
            @RequestBody SismaDto dto
    ){
        SismaModel sm;
        SismaFactory sf = new SismaFactory();
        sm = sf.fromDto(dto);

        return ResponseEntity.ok(sismaService.saveQuake(sm));
    }

    @GetMapping("/dataResponse")
    public ResponseEntity<List<SismaResources>> getAllDatas(){

        AllSismaAssembler allSismaAssembler = new AllSismaAssembler();

        List<SismaResources> resource = allSismaAssembler.fromCoreIntoList(sismaService.getAll());
        return ResponseEntity.ok(resource);
    }

    @DeleteMapping("/dataResponse")
    public ResponseEntity<Boolean> deleteAllDatas(){
        Boolean bool = false;

        List<SismaModel> ids = sismaService.getAll();
        if(!CollectionUtils.isEmpty(ids)) {
            for (SismaModel sm : ids) {
                bool = sismaService.delete(sm.getId());
            }
        }
        return ResponseEntity.ok(bool);
    }

    @DeleteMapping("/dataResponseFromId")
    public ResponseEntity<Boolean> deleteData(
            @RequestParam("id") Integer id
    ){
        Boolean bool = false;
        bool = sismaService.delete(id);

        return ResponseEntity.ok(bool);
    }
}
