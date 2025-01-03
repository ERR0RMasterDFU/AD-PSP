package com.salesianostriana.dam.api_03_ejercicio_ultima_hora.apartado1.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Direccion {
    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private int cp;
    private int poblacion;
    private String provincia;
}
