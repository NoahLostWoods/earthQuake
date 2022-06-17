package com.terremoti.terremoti.assembler;

import com.terremoti.terremoti.models.SismaModel;
import com.terremoti.terremoti.resources.SismaResources;

public class SismaAssembler {

    public SismaResources getResource(SismaModel sm){

        return new SismaResources()
                .setId(sm.getId())
                .setMagnitudo(sm.getMagnitudo())
                .setBradisismo(sm.getBradisismo())
                .setLatitudine(sm.getLatitudine())
                .setLongitudine(sm.getLongitudine())
                .setProfondita(sm.getProfondita())
                .setEpicentro(sm.getEpicentro());
    }
}
