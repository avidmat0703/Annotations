package Ejer3.Clases;

import Ejer3.Anotaciones.Tarea;
import java.util.ArrayList;
import java.util.List;

@Tarea(descripcion = "limpiar", titulo = "tarea de hoy", diaSemana = "jueves", hora = "10:30")

@Tarea(descripcion = "deberes", titulo = "tarea de mañana", diaSemana = "viernes", hora = "16:30")

@Tarea(descripcion = "trabajo", titulo = "tarea del sábado", diaSemana = "sábado", hora = "8:00")

public class Agenda {
    List<Ejer3.Clases.Tarea> tareas = new ArrayList<>();
}