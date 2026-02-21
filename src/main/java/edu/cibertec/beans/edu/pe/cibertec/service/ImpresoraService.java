package edu.cibertec.beans.edu.pe.cibertec.service;

import edu.cibertec.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ImpresoraService {

    public ImpresoraService(Imprimible documento) {
        this.documento = documento;
    }

    public ImpresoraService() {
    }

    @Autowired
    @Qualifier("documentoTexto")
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
