package com.terremoti.terremoti.resources;

public class SismaResources {
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

    public SismaResources setId(Integer id) {
        this.id = id;
        return this;
    }

    public Double getMagnitudo() {
        return magnitudo;
    }

    public SismaResources setMagnitudo(Double magnitudo) {
        this.magnitudo = magnitudo;
        return this;
    }

    public Double getEpicentro() {
        return epicentro;
    }

    public SismaResources setEpicentro(Double epicentro) {
        this.epicentro = epicentro;
        return this;
    }

    public Double getLatitudine() {
        return latitudine;
    }

    public SismaResources setLatitudine(Double latitudine) {
        this.latitudine = latitudine;
        return this;
    }

    public Double getLongitudine() {
        return longitudine;
    }

    public SismaResources setLongitudine(Double longitudine) {
        this.longitudine = longitudine;
        return this;
    }

    public Double getProfondita() {
        return profondita;
    }

    public SismaResources setProfondita(Double profondita) {
        this.profondita = profondita;
        return this;
    }

    public Boolean getBradisismo() {
        return bradisismo;
    }

    public SismaResources setBradisismo(Boolean bradisismo) {
        this.bradisismo = bradisismo;
        return this;
    }
}
