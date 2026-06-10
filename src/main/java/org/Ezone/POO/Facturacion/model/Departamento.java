package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "departamento")
public class Departamento extends Identifiable {
    private String nombre;
    private String descripcion;
}