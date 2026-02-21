package edu.cibertec.beans;

import org.springframework.stereotype.Repository;

@Repository
public class DocumentoExcel implements Imprimible{

    private void iniciar(){
        System.out.println("Iniciando la creación de la instancia del bean");
    }

    private void destruir(){
        System.out.println("Destruyendo instancia creada");
    }

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo excel.";
    }
}
