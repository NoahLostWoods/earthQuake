package com.terremoti.terremoti.interfaces;

import com.terremoti.terremoti.models.SismaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SismaReposFromJpa extends JpaRepository<SismaModel, Integer> {
}
