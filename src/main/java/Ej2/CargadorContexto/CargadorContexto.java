package Ej2.CargadorContexto;

import java.util.ArrayList;
import java.util.List;

public class CargadorContexto {
    public static List<Ej2.Estructura.Empleado> cargaContextoEmpresa(){
        Ej2.Anotacion.Directivo[] directivosAnnotation = Ej2.Estructura.Empresa.class.getAnnotationsByType ( Ej2.Anotacion.Directivo.class );
        List<Ej2.Estructura.Empleado> empleados = new ArrayList<>();

        for (Ej2.Anotacion.Directivo directivoAnnotation : directivosAnnotation) {
            empleados.add (new Ej2.Estructura.Directivo ( directivoAnnotation.nombre (), directivoAnnotation.apellidos (), directivoAnnotation.dni (), directivoAnnotation.direccion (), directivoAnnotation.telefono (), directivoAnnotation.codigoDespacho ()));
        }

        Ej2.Anotacion.Oficial[] OficialesAnnotation = Ej2.Estructura.Empresa.class.getAnnotationsByType ( Ej2.Anotacion.Oficial.class );

        for (Ej2.Anotacion.Oficial oficialAnnotation : OficialesAnnotation) {
            empleados.add (new Ej2.Estructura.Oficial ( oficialAnnotation.nombre (), oficialAnnotation.apellidos (), oficialAnnotation.dni (), oficialAnnotation.direccion (), oficialAnnotation.telefono (), oficialAnnotation.codigoTaller (), oficialAnnotation.categoria ()));
        }

        Ej2.Anotacion.Técnico[] tecnicosAnnotation = Ej2.Estructura.Empresa.class.getAnnotationsByType ( Ej2.Anotacion.Técnico.class );

        for (Ej2.Anotacion.Técnico tecnicoAnnotation : tecnicosAnnotation) {
            empleados.add (new Ej2.Estructura.Técnico ( tecnicoAnnotation.nombre (), tecnicoAnnotation.apellidos (), tecnicoAnnotation.dni (), tecnicoAnnotation.direccion (), tecnicoAnnotation.telefono (), tecnicoAnnotation.codigoTaller (), tecnicoAnnotation.perfil ()));
        }

        return empleados;
    }
}