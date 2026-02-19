package edu.cibertec.beans;

public class DocumentoExcel implements Imprimible{

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo excel.";
    }
}
