# La Programación Orientada a Objetos (POO)
nos ayuda a analizar y entender todos estos problemas para resolverlos de la forma más sostenible en el futuro. Java surgió con este paradigma y es uno de los lenguajes que define en gran manera el rumbo que sigue la POO.

Este paradigma se compone de 4 elementos (que analizaremos a fondo más adelante):

* Clases
* Propiedades
* Métodos
* Objetos

Además, se basa en los siguientes 4 pilares:

* Encapsulamiento
* Abstracción
* Herencia
* Polimorfismo
# 

#### Los Objetos 
son todas las cosas físicas o conceptuales que tienen propiedades y comportamientos. Por ejemplo: usuario, sesión, auto, etc.

#### Las Propiedades
o atributos son las características de nuestros objetos. Estos atributos siempre serán sustantivos y pueden tener diferentes valores que harán referencia a nombres, tamaños, formas y estados.

#### Los Comportamientos o métodos
serán todas las operaciones de nuestros objetos que solemos llamar usando verbos o sustantivos y verbos. Por ejemplo: los métodos del objeto sesión pueden ser login(), logout(), makeReport(), etc.

``Recuerda que las propiedades tambien pueden llamarse atributos, seran sustantivos, como por ejemplo el nombre, tamaño, forma, estado de un elemento, en un ejemplo mas realista en este caso seria por ejemplo mucha gente pensaria que decir el color de un automovil es verde y tomar la palabra verde como propiedad pero no en los objetos realmente la propiedad seria el color y ya decir verde seria la respuesta a esa propiedad ``

* un ejemplo pequeño :

public class Camisa{

private String color; // Como notamos el atributo es una propiedad y es color mas no verde 

}

#

#### La Abstracción 

se trata de analizar objetos de forma independiente, sus propiedades, características y comportamientos, para abstraer su composición y generar un modelo, lo que traducimos a código como clases.

#### Las Clases

son los modelos sobre los cuales construimos nuestros objetos, es decir, las clases son los “moldes” que nos permiten generar objetos. Cada clase debe tener identidad (con un nombre de clase único usando Upper Camel Case), estado (con sus atributos) y comportamiento (con sus métodos y operaciones).

#

#### Metodo Constructor

El Método Constructor es el primer método que se ejecuta por defecto cuando creamos una clase, nos permite crear nuevas instancias de una clase. Lo invocamos con la palabra reservada new seguida del nombre con el que inicializamos la clase y paréntesis.

// nombreDeLaInstancia = new MétodoConstructor();
myDoctor = new Doctor();

#

#### Metodos Estaticos

Los métodos y variables estáticos nos ayudan a ejecutar o conseguir algún código desde clases no han sido instanciadas, ya que sus valores se guardan en la memoria de nuestro programa, no en diferentes objetos instanciados a través de una clase.

ejemplo 

public class Calculadora {

    public static int sumar(int a, int b){
        return a + b; }
    }


public class Main {
    public static void main(String[] args) {

            /*Como notamos la clase Calculadora tiene una funcion estatica
        por lo tanto no es necesario instanciar un objeto para poder
        utilizarla*/

        int resultado = Calculadora.sumar(1,2);

        System.out.println(resultado);

        }
        }

#
