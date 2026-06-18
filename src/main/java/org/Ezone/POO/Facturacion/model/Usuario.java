package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario extends Identifiable {
    private String usuario;
    private String password;
}
