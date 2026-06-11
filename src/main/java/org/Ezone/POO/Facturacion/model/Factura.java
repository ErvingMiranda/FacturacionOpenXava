package org.Ezone.POO.Facturacion.model;

import lombok.Getter;
import lombok.Setter;
import org.Ezone.POO.Facturacion.calculator.CalculatorNumeroFactura;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.ZerosFilled;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "factura")
@Getter @Setter
public class Factura extends Identifiable {
    @ZerosFilled
    @Column(length = 5)
    @DefaultValueCalculator(CalculatorNumeroFactura.class)
    private Integer numeroFactura;

    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Cliente cliente;
}
