package Ej3.Clases;

import Ej3.CargadorContexto.CargadorContexto;

public class Main {
    public static void main(String[] args) {
        System.out.println("TAREAS PENDIENTES:");
        System.out.println(CargadorContexto.cargaContextoTareas());
    }
}