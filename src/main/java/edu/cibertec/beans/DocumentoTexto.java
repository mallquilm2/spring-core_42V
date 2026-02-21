package edu.cibertec.beans;

import org.springframework.stereotype.Controller;

@Controller
public class DocumentoTexto implements Imprimible{

    private void iniciar(){
        System.out.println("iniciando la creación de la instancia del bean TEXTO.");
    }

    private void destruir(){
        System.out.println("destruyendo instancia creada de TEXTO");
    }

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo de texto.";
    }
}
