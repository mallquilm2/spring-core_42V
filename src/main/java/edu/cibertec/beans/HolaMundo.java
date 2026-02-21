package edu.cibertec.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HolaMundo {

    @Value("Alumnos backend desde anotaciones Configuración")
    private String nombre;

    public HolaMundo() {
    }

    public void saludar(){
        System.out.println("Saludando desde Spring " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
