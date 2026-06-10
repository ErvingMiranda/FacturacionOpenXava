package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
@Getter
@Setter
public class Direccion {
    private String direccion;
    private String indicaciones;
    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Departamento departamento;
    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList(
            depends = "this.departamento",
            condition = "${departamento.id} = ?"
    )
    private Municipio municipio;
}
