package edu.cibertec.beans.edu.pe.cibertec.service;

import org.aspectj.lang.JoinPoint;

public class AuditoriaAOP {

    public void alertarAntes(JoinPoint jp){
        System.out.println("Auditoria antes del metodo "+jp.getSignature());
    }

    public void alertarDespues(JoinPoint jp){
        System.out.println("Auditoria despues del método "+jp.getSignature());
    }

    public void alertarException(JoinPoint jp){
        System.out.println("Auditoria en la excepcion del metodo "+ jp.getSignature());
    }

}
