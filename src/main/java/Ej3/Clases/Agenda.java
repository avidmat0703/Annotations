package Ej3.Clases;

import Ej3.Anotaciones.Tarea;
import java.util.ArrayList;
import java.util.List;

@Tarea(titulo = "Clases", descripcion = "Asistir a clases", diaSemana = "lunes", hora = "8:15")
@Tarea(titulo = "Academia", descripcion = "Clases de Inglés", diaSemana = "Jueves", hora = "18:00")
@Tarea(titulo = "Fútbol", descripcion = "Partido de fútbol con los colegas", diaSemana = "Sábado", hora = "10:30")

public class Agenda {
    List<Ej3.Clases.Tarea> tareas = new ArrayList<>();
}