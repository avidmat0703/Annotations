package Ej2.Estructura;

import Ej2.CargadorContexto.CargadorContexto;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println ("BIENVENIDO A LA EMPRESA");
        System.out.println ("CARGANDO EMPLEADOS...");
        List<Ej2.Estructura.Empleado> empleados = CargadorContexto.cargaContextoEmpresa ();
        for(Ej2.Estructura.Empleado empleado : empleados){
            System.out.println (empleado);
        }
    }
}