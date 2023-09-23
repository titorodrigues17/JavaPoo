package org.uts;


import org.uts.entity.Medico;
import static org.uts.entity.UiMenu.*; //Importamos todas las funciones estaticas de la clase UiMenu



public class Main {
    public static void main(String[] args) {

    /* Para nosotros comunicar de una clase a otra en este
    caso de la clase Main a la clase Doctor entonces debemos
     instanciar el objeto o en este caso la clase
     Doctor doctor = new Doctor();
    */

        //---------------------------------------------
    //Como instanciar un objeto( Nombre de la clase + nombre del objeto = new + nombre de la clase)
    Doctor doctor = new Doctor();
    doctor.name = "Carlos Santos";
    doctor.showName();

    Doctor doctorr = new Doctor("Carlitos");

    //---------------------------------------------
        /*Como notamos la clase Calculadora tiene una funcion estatica
        por lo tanto no es necesario instanciar un objeto para poder
        utilizarla*/

        int resultado = Calculadora.sumar(1,2);

        System.out.println(resultado);
        //System.out.println(Calculadora.sumar(1,2)   );


        //---------------------------------------------

        //Como notamos la clase Medico tiene una funcion estatica
        Medico carlos = new Medico();
        carlos.name = "Carlos";
        carlos.showId();

        Medico camilo = new Medico();
        camilo.name = "Camilo";
        camilo.showId();

        Medico sara = new Medico();
        camilo.name = "Sara";
        camilo.showId();

        //---------------------------------------------

        showMenu();



    }
}