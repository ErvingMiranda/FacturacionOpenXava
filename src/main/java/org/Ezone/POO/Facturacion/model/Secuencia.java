package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "Secuencia")
public class Secuencia extends Identifiable {
    private String nombre;
    private Integer valorInicial;
    private Integer valorActual;
}
