package Ejer2.Anotacion;

import java.lang.annotation.*;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.TYPE)
@Repeatable (Técnicos.class)
public @interface Técnico {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String codigoTaller();
    String perfil();
}