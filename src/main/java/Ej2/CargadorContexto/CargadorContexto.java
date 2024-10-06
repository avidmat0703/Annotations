package Ej2.CargadorContexto;

import java.util.ArrayList;
import java.util.List;

public class CargadorContexto {
    public static List<Ej2.Clases.Empleado> cargaContextoEmpresa(){
        Ej2.Anotaciones.Directivo[] directivosAnnotation = Ej2.Clases.Empresa.class.getAnnotationsByType ( Ej2.Anotaciones.Directivo.class );
        List<Ej2.Clases.Empleado> empleados = new ArrayList<>();

        for (Ej2.Anotaciones.Directivo directivoAnnotation : directivosAnnotation) {
            empleados.add (new Ej2.Clases.Directivo ( directivoAnnotation.nombre (), directivoAnnotation.apellidos (), directivoAnnotation.dni (), directivoAnnotation.direccion (), directivoAnnotation.telefono (), directivoAnnotation.codigoDespacho ()));
        }

        Ej2.Anotaciones.Oficial[] OficialesAnnotation = Ej2.Clases.Empresa.class.getAnnotationsByType ( Ej2.Anotaciones.Oficial.class );

        for (Ej2.Anotaciones.Oficial oficialAnnotation : OficialesAnnotation) {
            empleados.add (new Ej2.Clases.Oficial ( oficialAnnotation.nombre (), oficialAnnotation.apellidos (), oficialAnnotation.dni (), oficialAnnotation.direccion (), oficialAnnotation.telefono (), oficialAnnotation.codigoTaller (), oficialAnnotation.categoria ()));
        }

        Ej2.Anotaciones.Técnico[] tecnicosAnnotation = Ej2.Clases.Empresa.class.getAnnotationsByType ( Ej2.Anotaciones.Técnico.class );

        for (Ej2.Anotaciones.Técnico tecnicoAnnotation : tecnicosAnnotation) {
            empleados.add (new Ej2.Clases.Técnico ( tecnicoAnnotation.nombre (), tecnicoAnnotation.apellidos (), tecnicoAnnotation.dni (), tecnicoAnnotation.direccion (), tecnicoAnnotation.telefono (), tecnicoAnnotation.codigoTaller (), tecnicoAnnotation.perfil ()));
        }

        return empleados;
    }
}