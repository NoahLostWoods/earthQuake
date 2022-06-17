package com.terremoti.terremoti.interfaces;

import com.terremoti.terremoti.models.SismaModel;
import java.util.List;

public interface SismaRepos {
    Boolean saveQuake(SismaModel nota);

    List<SismaModel> getAll();

    SismaModel getOne(Integer id);

    Boolean delete(Integer id);
}
