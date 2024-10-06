package Ejer1.CargadorContexto;

import Ejer1.Anotacion.Empleado;
import Ejer1.Estructura.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CargadorContexto {
    public static List<Ejer1.Estructura.Empleado> cargaContextoEmpresa(){
        Empleado[] empleadosAnnotation = Empresa.class.getAnnotationsByType ( Empleado.class );
        List<Ejer1.Estructura.Empleado> empleados = new ArrayList<>();
        for (Empleado empleadoAnnotation : empleadosAnnotation) {
            String clase = empleadoAnnotation.clase ();
            switch(clase) {
                case "Directivo": empleados.add (new Directivo (empleadoAnnotation.nombre (), empleadoAnnotation.apellidos (), empleadoAnnotation.dni (), empleadoAnnotation.direccion (), empleadoAnnotation.telefono (), "Directivo", "D-X") );
                break;
                case "Técnico": empleados.add (new Técnico (empleadoAnnotation.nombre (), empleadoAnnotation.apellidos (), empleadoAnnotation.dni (), empleadoAnnotation.direccion (), empleadoAnnotation.telefono (), "Técnico", "T-X", "perfil") );
                break;
                case "Oficial": empleados.add (new Oficial (empleadoAnnotation.nombre (), empleadoAnnotation.apellidos (), empleadoAnnotation.dni (), empleadoAnnotation.direccion (), empleadoAnnotation.telefono (), "Oficial", "O-X","categoría") );
            }
        }
        return empleados;
    }
    Map<String, Empleado> integerClaseMap = new HashMap<> ();
}