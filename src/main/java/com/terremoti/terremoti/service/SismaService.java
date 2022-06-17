package com.terremoti.terremoti.service;

import com.terremoti.terremoti.interfaces.SismaReposFromJpa;
import com.terremoti.terremoti.interfaces.SismaRepos;
import com.terremoti.terremoti.models.SismaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SismaService implements SismaRepos {

    @Autowired
    private SismaReposFromJpa sismaReposFromJpa;

    @Override
    public Boolean saveQuake(SismaModel sm) {
        try {
            sismaReposFromJpa.save(sm);
            return Boolean.TRUE;
        }catch (Exception ex){
            ex.printStackTrace();
            return Boolean.FALSE;
        }
    }

    @Override
    public List<SismaModel> getAll() {
        return sismaReposFromJpa.findAll();
    }

    @Override
    public SismaModel getOne(Integer id) {
        return sismaReposFromJpa.findById(id).get();
    }

    @Override
    public Boolean delete(Integer id) {
        try {
            sismaReposFromJpa.deleteById(id);
            return Boolean.TRUE;
        }catch (Exception ex){
            ex.printStackTrace();
            return Boolean.FALSE;
        }
    }
}
