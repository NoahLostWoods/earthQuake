package com.terremoti.terremoti.dto;

public class SismaDto {
    
    private Integer id;
    private Double magnitudo;
    private Double epicentro;
    private Double latitudine;
    private Double longitudine;
    private Double profondita;
    private Boolean bradisismo;

    public Integer getId() {
        return id;
    }

    public SismaDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public Double getMagnitudo() {
        return magnitudo;
    }

    public SismaDto setMagnitudo(Double magnitudo) {
        this.magnitudo = magnitudo;
        return this;
    }

    public Double getEpicentro() {
        return epicentro;
    }

    public SismaDto setEpicentro(Double epicentro) {
        this.epicentro = epicentro;
        return this;
    }

    public Double getLatitudine() {
        return latitudine;
    }

    public SismaDto setLatitudine(Double latitudine) {
        this.latitudine = latitudine;
        return this;
    }

    public Double getLongitudine() {
        return longitudine;
    }

    public SismaDto setLongitudine(Double longitudine) {
        this.longitudine = longitudine;
        return this;
    }

    public Double getProfondita() {
        return profondita;
    }

    public SismaDto setProfondita(Double profondita) {
        this.profondita = profondita;
        return this;
    }

    public Boolean getBradisismo() {
        return bradisismo;
    }

    public SismaDto setBradisismo(Boolean bradisismo) {
        this.bradisismo = bradisismo;
        return this;
    }
}
