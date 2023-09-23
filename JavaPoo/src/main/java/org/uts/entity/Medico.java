package org.uts.entity;

public class Medico {
    static int id = 0;  // Vemos que la letra se puso Italica eso es que es una variable statica
    public String name;
    public String speciality;

     public Medico() {
        System.out.println("Construyendo el Objeto Medico");
        id++;
    }


    public Medico(String name) {
        System.out.println("El nombre del medico asignado es: " + name);

    }


    public void showId() {
        System.out.println("Id Medico: " + id);
    }

    public void showName() {
        System.out.println(name);
    }

}
