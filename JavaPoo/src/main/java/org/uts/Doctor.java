package org.uts;

public class Doctor {
    private int id;
    public String name;
    private String specialty;

    //Comportamientos (Metodos)

    //El void es por que no tendre algo de retorno
    public void showName(){
        System.out.println(name);
    }

    //Constructor
     Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
}
