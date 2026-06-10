package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Files;
import org.openxava.annotations.Money;
import org.openxava.annotations.TextArea;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "producto")
@Getter @Setter
public class Producto extends Identifiable {
    private String nombre;
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Categoria categoria;

    @Money
    private BigDecimal precio;

    @Files
    @Column(length=32)
    private String foto;

    @TextArea
    private String observaciones;
}
