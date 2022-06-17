package com.terremoti.terremoti.assembler;

import com.terremoti.terremoti.models.SismaModel;
import com.terremoti.terremoti.resources.SismaResources;

import java.util.ArrayList;
import java.util.List;

public class AllSismaAssembler {

    public List<SismaResources> fromCoreIntoList(List<SismaModel> sismaModels){
        List<SismaResources> list = new ArrayList<>();

        for(SismaModel sm : sismaModels){
            SismaResources sr = new SismaResources()
                    .setId(sm.getId())
                    .setProfondita(sm.getProfondita())
                    .setBradisismo(sm.getBradisismo())
                    .setEpicentro(sm.getEpicentro())
                    .setLatitudine(sm.getLatitudine())
                    .setLongitudine(sm.getLongitudine())
                    .setMagnitudo(sm.getMagnitudo());
            list.add(sr);
        }
        return list;
    }
}
