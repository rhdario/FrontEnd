public class Ejercicios_tema8 {

/*
Para practicar la encapsulación:
- Crear clase Persona.
- Crear variables las privadas edad, nombre y telefono de la clase Persona.
- Crear gets y sets de cada propiedad.
- Crear un objeto persona en el main.
- Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
por último muéstralas por consola.
 */

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setEdad(25);
        persona.setTelefono(123456789);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());


    }
     static class Persona {
         private String nombre;
         private int edad;
         private int telefono;

         public void setNombre (String nombre){
             this.nombre = nombre;
         }
         public void setEdad (int edad){
             this.edad = edad;
         }
         public void setTelefono (int telefono){
             this.telefono = telefono;
         }
         public String getNombre(){
             return this.nombre;
         }
         public int getEdad(){
             return this.edad;
         }
         public int getTelefono(){
             return this.telefono;
         }

    }

}
