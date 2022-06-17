package com.terremoti.terremoti.factory;

import com.terremoti.terremoti.dto.SismaDto;
import com.terremoti.terremoti.models.SismaModel;

import java.time.LocalDateTime;

public class SismaFactory {

    public SismaModel fromDto(SismaDto dto){
        return new SismaModel()
                .setBradisismo(dto.getBradisismo())
                .setEpicentro(dto.getEpicentro())
                .setLatitudine(dto.getLatitudine())
                .setLongitudine(dto.getLongitudine())
                .setMagnitudo(dto.getMagnitudo())
                .setProfondita(dto.getProfondita())
                .setTms_write_db(LocalDateTime.now());
    }
}
