package com.terremoti.terremoti.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "SISMA_DATA_STORAGE"
)
public class SismaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Double magnitudo;
    @Column
    private Double epicentro;
    @Column
    private Double latitudine;
    @Column
    private Double longitudine;
    @Column
    private Double profondita;
    @Column
    private Boolean bradisismo;
    @Column
    private LocalDateTime tms_write_db;

    public Integer getId() {
        return id;
    }

    public SismaModel setId(Integer id) {
        this.id = id;
        return this;
    }

    public Double getMagnitudo() {
        return magnitudo;
    }

    public SismaModel setMagnitudo(Double magnitudo) {
        this.magnitudo = magnitudo;
        return this;
    }

    public Double getEpicentro() {
        return epicentro;
    }

    public SismaModel setEpicentro(Double epicentro) {
        this.epicentro = epicentro;
        return this;
    }

    public Double getLatitudine() {
        return latitudine;
    }

    public SismaModel setLatitudine(Double latitudine) {
        this.latitudine = latitudine;
        return this;
    }

    public Double getLongitudine() {
        return longitudine;
    }

    public SismaModel setLongitudine(Double longitudine) {
        this.longitudine = longitudine;
        return this;
    }

    public Double getProfondita() {
        return profondita;
    }

    public SismaModel setProfondita(Double profondita) {
        this.profondita = profondita;
        return this;
    }

    public Boolean getBradisismo() {
        return bradisismo;
    }

    public SismaModel setBradisismo(Boolean bradisismo) {
        this.bradisismo = bradisismo;
        return this;
    }

    public LocalDateTime getTms_write_db() {
        return tms_write_db;
    }

    public SismaModel setTms_write_db(LocalDateTime tms_write_db) {
        this.tms_write_db = tms_write_db;
        return this;
    }
}
