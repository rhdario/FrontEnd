public class Ejercicios_tema4 {
    /*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

1- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

2- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
sea inferior a 3, el bloque de código que tendrá el bucle deberá:

- Incrementar el valor de la variable en uno cada vez que se ejecute.
- Mostrarlo por pantalla cada vez que se ejecute.

3- Para el bucle Do While, deberás crear la misma estructura que en el While,
pero solo se debe ejecutar una vez.

4- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
y su condición será que la variable sea igual o menor que 3,
se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

5- Por último, para el Switch, deberás crear la variable estacion,
y distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
informando de la estación en la que está.
También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */


    public static void main(String[] args) {
        int numeroIf = -8;
        int numeroWhile = 0;
        int numeroDoWhile = 3;
        int numeroFor = 2;
        String estacion = "OTOÑO";

        System.out.println("SOLUCION EJERCICIO 1 - IF"); //Me parecio conveniente poner titulos en todos los ejercicios para que se entienda la respuesta
        if (numeroIf > 0) {
            System.out.println("El Valor es POSITIVO");
        } else if (numeroIf < 0){
            System.out.println("El Valor es NEGATIVO");
        } else{
            System.out.println("El Valor es 0");
        }

        System.out.println("SOLUCION EJERCICIO 2 - WHILE");
        if (numeroWhile >= 3){ //Me parecio conveniente poner un if anterior para que muestre un mensaje si no entra al bucle
            System.out.println("Ha ingresado un numero mayor o igual a 3 por lo tanto no ha entrado al Bucle");
        }else {
            while (numeroWhile < 3) {
                numeroWhile = numeroWhile + 1;
                System.out.println("La variable While ahora es: " + numeroWhile);
            }
        }

        System.out.println("SOLUCION EJERCICIO 3 - DO WHILE");
        do{
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println("La Variable DoWhile ahora es: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        System.out.println("SOLUCION EJERCICIO 4 - FOR");

        if (numeroFor <= 3){ //Me parecio conveniente poner un if anterior para que muestre un mensaje si no entra al bucle

            for (;numeroFor <= 3; numeroFor++) {
                System.out.println("La variable For ahora es: " + numeroFor);
            }

        } else{
            System.out.println("Ha ingresado un numero mayor a 3 por lo tanto no ha entrado al Bucle");
        }

        switch(estacion) {

            case "VERANO":
                System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
                System.out.println("Es VERANO");
            break;

            case "INVIERNO":
                System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
                System.out.println("Es INVIERNO");
            break;

            case "PRIMAVERA":
                System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
                System.out.println("Es PRIMAVERA");
            break;

            case "OTOÑO":
                System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
                System.out.println("Es OTOÑO");
                break;

            default:
                System.out.println("SOLUCION EJERCICIO 5 - SWITCH");
                System.out.println("NO HA INGRESADO UNA ESTACION O INGRESO EN MINUSCULAS");

        }

    }

}