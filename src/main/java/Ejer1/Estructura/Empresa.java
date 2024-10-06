package Ejer1.Estructura;

import Ejer1.Anotacion.Empleado;
import java.util.ArrayList;
import java.util.List;

@Empleado(nombre = "Alex", apellidos = "Vidal", dni = "80270323H", direccion = "Calle Mario 5", telefono = "612206027", clase = "Directivo", codigoDespacho = "A-111")

@Empleado(nombre = "Antoñito", apellidos = "Martín", dni = "93960443F", direccion = "Calle Antonio 3", telefono = "617122556", clase = "Oficial", codigoDespacho = "B-112")

@Empleado (nombre = "Manu", apellidos = "Navarro", dni = "10793993L", direccion = "Calle Bartolo 2", telefono = "654756482", clase = "Técnico", codigoDespacho = "C-113")

public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}