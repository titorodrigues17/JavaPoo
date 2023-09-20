package org.uts;

public class Main {
    public static void main(String[] args) {

    /* Para nosotros comunicar de una clase a otra en este
    caso de la clase Main a la clase Doctor entonces debemos
     instanciar el objeto o en este caso la clase
     Doctor doctor = new Doctor();
    */

    //Como instanciar un objeto( Nombre de la clase + nombre del objeto = new + nombre de la clase)
    Doctor doctor = new Doctor();
    doctor.name = "Carlos Santos";
    doctor.showName();

    Doctor doctorr = new Doctor("Carlitos");


    }
}