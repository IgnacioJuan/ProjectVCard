package com.guachi.projectvcard.models.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Redes {
    public Redes(String nombre, String icono, String enlace) {
        this.nombre = nombre;
        this.icono = icono;
        this.enlace=enlace;
    }

    private String nombre;
    private String icono;
    private String enlace;
}
