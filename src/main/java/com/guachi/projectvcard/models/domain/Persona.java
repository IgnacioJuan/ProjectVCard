package com.guachi.projectvcard.models.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class Persona {
    @Value("${persona.nombre}")
    private String nombre;
    @Value("${persona.cargo}")

    private String cargo;
    @Value("${persona.direccion}")

    private String direccion;
    @Value("${persona.empresa}")

    private String empresa;
    @Value("${persona.horarios}")

    private String horarios;
    @Value("${persona.correo}")

    private String correo;
    @Value("${persona.celular}")

    private String celular;
    @Value("${persona.paginaweb}")

    private String paginaWeb;
    @Value("${persona.foto}")

    private String foto;


    @Autowired
    private List<Redes> redesList;
}
