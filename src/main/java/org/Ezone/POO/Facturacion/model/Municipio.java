package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Municipio extends Identifiable {
    private String nombre;
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Departamento departamento;
}