package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.DescriptionsList;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "factura")
@Getter @Setter
public class Factura extends Identifiable {
    private String numeroFactura;

    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Cliente cliente;
}
