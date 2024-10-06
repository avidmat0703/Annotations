package Ej1.Clases;

import Ej1.CargadorContexto.CargadorContexto;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println ("BIENVENIDO A LA EMPRESA");
        System.out.println ("CARGANDO EMPLEADOS...");

        List<Ej1.Clases.Empleado> empleados = CargadorContexto.cargaContextoEmpresa ();

        for(Ej1.Clases.Empleado empleado : empleados) {
            System.out.println (empleado);
        }
    }
}