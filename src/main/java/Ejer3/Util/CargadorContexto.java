package Ejer3.Util;

import Ejer3.Clases.Agenda;
import Ejer3.Clases.Tarea;
import java.util.ArrayList;
import java.util.List;

public class CargadorContexto {
    public static List<Tarea> cargaContextoTareas(){
        Ejer3.Anotaciones.Tarea[] tareaAnnotations = Agenda.class.getAnnotationsByType(Ejer3.Anotaciones.Tarea.class);
        List<Tarea> tareas = new ArrayList<Tarea>();

        for (Ejer3.Anotaciones.Tarea tareaAnnotation : tareaAnnotations){
            tareas.add(Tarea.builder().titulo(tareaAnnotation.titulo()).descripcion(tareaAnnotation.descripcion()).hora(tareaAnnotation.hora()).diaSemana(tareaAnnotation.diaSemana()).build());
        }
        return tareas;
    }
}