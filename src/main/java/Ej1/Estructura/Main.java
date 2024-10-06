package Ej1.Estructura;

import Ej1.CargadorContexto.CargadorContexto;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println ("BIENVENIDO A LA EMPRESA");
        System.out.println ("CARGANDO EMPLEADOS...");

        List<Ej1.Estructura.Empleado> empleados = CargadorContexto.cargaContextoEmpresa ();

        for(Ej1.Estructura.Empleado empleado : empleados) {
            System.out.println (empleado);
        }
    }
}