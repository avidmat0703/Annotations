package Ejer3.Clases;

import Ejer3.Anotaciones.Tarea;
import java.util.ArrayList;
import java.util.List;

@Tarea(descripcion = "Clases", titulo = "Asistir a clases", diaSemana = "lunes", hora = "8:15")

@Tarea(descripcion = "Academia", titulo = "Clases de Inglés", diaSemana = "Jueves", hora = "18:00")

@Tarea(descripcion = "Fútbol", titulo = "Partido de fútbol con los colegas", diaSemana = "Sábado", hora = "10:30")

public class Agenda {
    List<Ejer3.Clases.Tarea> tareas = new ArrayList<>();
}