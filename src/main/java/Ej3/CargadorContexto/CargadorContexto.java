package Ej3.CargadorContexto;

import Ej3.Clases.Agenda;
import Ej3.Clases.Tarea;
import java.util.ArrayList;
import java.util.List;

public class CargadorContexto {

    public static String cargaContextoTareas() {
        Ej3.Anotaciones.Tarea[] tareaAnnotations = Agenda.class.getAnnotationsByType(Ej3.Anotaciones.Tarea.class);
        List<Tarea> tareas = new ArrayList<>();

        for (Ej3.Anotaciones.Tarea tareaAnnotation : tareaAnnotations) {
            tareas.add(Tarea.builder().titulo(tareaAnnotation.titulo()).descripcion(tareaAnnotation.descripcion()).hora(tareaAnnotation.hora()).diaSemana(tareaAnnotation.diaSemana()).build());
        }

        StringBuilder resultado = new StringBuilder();
        for (Tarea tarea : tareas) {
            resultado.append(tarea).append("\n");
        }

        return resultado.toString();
    }
}