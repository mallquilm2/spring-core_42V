package edu.cibertec.beans.edu.pe.cibertec.service;

import edu.cibertec.beans.Imprimible;

public class ImpresoraService {

    private Imprimible documento;

    public void imprimirDocumento(){
        System.out.println("Imprimendo documento -->"+getDocumento().imprimir());
    }

    public Imprimible getDocumento() {
        return documento;
    }

    public void setDocumento(Imprimible documento) {
        this.documento = documento;
    }
}
