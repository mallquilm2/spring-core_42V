package edu.cibertec.beans.edu.pe.cibertec.config;

import edu.cibertec.beans.DocumentoExcel;
import edu.cibertec.beans.DocumentoTexto;
import edu.cibertec.beans.HolaMundo;
import edu.cibertec.beans.edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HolaMundo holaMundo(){
        return new HolaMundo();
    }

    @Bean
    public ImpresoraService impresoraService(){
        return new ImpresoraService();
    }

    @Bean
    public DocumentoExcel documentoExcel(){
        return new DocumentoExcel();
    }

    @Bean
    public DocumentoTexto documentoTexto(){
        return new DocumentoTexto();
    }

}
