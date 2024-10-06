package Ejer4;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona ( "Alex", 20 );
        //p1.setNombre("Bartolo"); Este método sólo se puede ejecutar cuando la clase "Persona" no tiene la notación @Value; de otro modo dará error.
        Persona p2 = Persona.builder().nombre ( "Carlos" ).build();
        //Persona p3 = Persona.builder().nombre ( null ).build(); Esta línea da error, ya que con la notación @NonNull he declarado que la clase Persona no puede ser instanciada con un nombre nulo.
        System.out.println (p1);
        System.out.println (p2);
        System.out.println (p1.equals ( p2 ));//Métodos como equals o el constructor han sido generados por @Data
        System.out.println (p1.getEdad () + " , " + p2.getEdad ());
    }
}