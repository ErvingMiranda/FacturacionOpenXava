package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
@Getter @Setter
public class Categoria extends Identifiable {
    private String nombre;
    private String descripcion;
}
