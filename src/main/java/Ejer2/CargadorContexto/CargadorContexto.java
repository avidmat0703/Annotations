package Ejer2.CargadorContexto;

import java.util.ArrayList;
import java.util.List;

public class CargadorContexto {
    public static List<Ejer2.Estructura.Empleado> cargaContextoEmpresa(){
        Ejer2.Anotacion.Directivo[] directivosAnnotation = Ejer2.Estructura.Empresa.class.getAnnotationsByType ( Ejer2.Anotacion.Directivo.class );
        List<Ejer2.Estructura.Empleado> empleados = new ArrayList<>();

        for (Ejer2.Anotacion.Directivo directivoAnnotation : directivosAnnotation) {
            empleados.add (new Ejer2.Estructura.Directivo ( directivoAnnotation.nombre (), directivoAnnotation.apellidos (), directivoAnnotation.dni (), directivoAnnotation.direccion (), directivoAnnotation.telefono (), directivoAnnotation.codigoDespacho ()));
        }

        Ejer2.Anotacion.Oficial[] OficialesAnnotation = Ejer2.Estructura.Empresa.class.getAnnotationsByType ( Ejer2.Anotacion.Oficial.class );

        for (Ejer2.Anotacion.Oficial oficialAnnotation : OficialesAnnotation) {
            empleados.add (new Ejer2.Estructura.Oficial ( oficialAnnotation.nombre (), oficialAnnotation.apellidos (), oficialAnnotation.dni (), oficialAnnotation.direccion (), oficialAnnotation.telefono (), oficialAnnotation.codigoTaller (), oficialAnnotation.categoria ()));
        }

        Ejer2.Anotacion.Técnico[] tecnicosAnnotation = Ejer2.Estructura.Empresa.class.getAnnotationsByType ( Ejer2.Anotacion.Técnico.class );

        for (Ejer2.Anotacion.Técnico tecnicoAnnotation : tecnicosAnnotation) {
            empleados.add (new Ejer2.Estructura.Técnico ( tecnicoAnnotation.nombre (), tecnicoAnnotation.apellidos (), tecnicoAnnotation.dni (), tecnicoAnnotation.direccion (), tecnicoAnnotation.telefono (), tecnicoAnnotation.codigoTaller (), tecnicoAnnotation.perfil ()));
        }

        return empleados;
    }
}