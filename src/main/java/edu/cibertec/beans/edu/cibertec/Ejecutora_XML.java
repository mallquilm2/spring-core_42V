package edu.cibertec.beans.edu.cibertec;

import edu.cibertec.beans.HolaMundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutora_XML {

    public static void main(String[] args) {
        //Aperturamos el contexto de spring con la configuración XML
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");

        //Obtenemos el bean 'holaMundo'
        HolaMundo h1 = (HolaMundo) contexto.getBean("holaMundo");

        //Utilizamos el  meétodo saludar
        h1.saludar();

        //Cerramos el contexto
        ((ConfigurableApplicationContext) contexto).close();

    }

}
