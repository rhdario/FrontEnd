public class Main {
    /* Primera parte:
      Crear una función con tres parámetros que sean números que se suman entre sí.
      Llamar a la función en el main y darle valores.

      Segunda parte:
      Crear una clase coche.
      Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
      Una función que incremente el número de puertas que tiene el coche.
      Crear un objeto miCoche en el main y añadirle una puerta.
      Mostrar el número de puertas que tiene el objeto.
*/
    public static void main(String[] args) {
       suma(1,2,3);
        

       Coche miCoche = new Coche(); //Funcion que crea el objeto
       miCoche.IncrementarPuertas(); //Llamado a la funcion que incrementa puertas
       miCoche.IncrementarPuertas();
       System.out.println("La cantidad de puertas que tiene el coche ahora es: "+miCoche.puertas); // Muestra en pantalla la cantidad de puertas
    }

    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de la suma es: "+resultado);
        return resultado;
    }
}

class Coche {
    public int puertas = 1;
    public void IncrementarPuertas() {
        this.puertas++;
    }
}