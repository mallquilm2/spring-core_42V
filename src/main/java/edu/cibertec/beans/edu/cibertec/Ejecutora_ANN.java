package edu.cibertec.beans.edu.cibertec;

import edu.cibertec.beans.HolaMundo;
import edu.cibertec.beans.edu.pe.cibertec.config.AppConfig;
import edu.cibertec.beans.edu.pe.cibertec.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutora_ANN {

    public static void main(String[] args) {
        //Aperturamos el contexto de spring con la configuración por annotacion
        ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
        //Obtenemos el bean 'holaMundo'
        HolaMundo h1 = (HolaMundo) contexto.getBean("holaMundo");
        //Utilizamos el  meétodo saludar
        h1.saludar();

        ImpresoraService impresoraService = (ImpresoraService) contexto.getBean("impresoraService");
        impresoraService.imprimirDocumento();

        //Cerramos el contexto
        ((ConfigurableApplicationContext) contexto).close();

    }

}
