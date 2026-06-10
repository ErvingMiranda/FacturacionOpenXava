package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ListProperties;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="cliente")
@Getter
@Setter
public class Cliente extends org.openxava.model.Identifiable{
    private String nombre;
    private String apellido;
    @ElementCollection
    @ListProperties("direccion, indicaciones, departamento.nombre, municipio.nombre")
    private Collection<Direccion> direcciones;
    private String telefono;
}
