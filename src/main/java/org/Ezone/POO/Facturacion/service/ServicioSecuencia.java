package org.Ezone.POO.Facturacion.service;

import org.openxava.jpa.XPersistence;

import javax.persistence.LockModeType;

public class ServicioSecuencia {
    public static Integer getNumeroSecuencia(String nombreSecuencia){
        Integer numeroSecuencia = null;

        try{
            numeroSecuencia = (Integer) XPersistence.getManager()
                    .createQuery("select e.valorActual from Secuencia e " +
                            "where upper(e.nombre) = :nombre")
                    .setParameter("nombre", nombreSecuencia.toUpperCase())
                    .setLockMode(LockModeType.PESSIMISTIC_WRITE)
                    .getSingleResult();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return (numeroSecuencia == null) ? 1 : numeroSecuencia + 1;
    }
}
