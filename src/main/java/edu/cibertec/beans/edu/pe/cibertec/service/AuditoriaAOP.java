package edu.cibertec.beans.edu.pe.cibertec.service;

import org.springframework.stereotype.Service;

@Service
public class AuditoriaAOP {

    public void alertartAntes(){
        System.out.println("Auditoria antes del metodo");
    }

    public void alertarDespues(){
        System.out.println("Auditoria despues del método");
    }

    public void alertarException(){
        System.out.println("Auditoria en la excepcion del metodo");
    }

}
