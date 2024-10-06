package Ej2.Clases;

import Ej1.Anotaciones.Empleado;
import Ej2.Anotaciones.Directivo;
import Ej2.Anotaciones.Oficial;
import Ej2.Anotaciones.Técnico;
import java.util.ArrayList;
import java.util.List;

@Directivo(nombre = "Alex", apellidos = "Vidal", dni = "80270323H", direccion = "Calle Mario 5", telefono = "612206027", codigoDespacho = "A-111")
@Oficial(nombre = "Antonio", apellidos = "Martín", dni = "93960443F", direccion = "Calle Larga 3", telefono = "617122556", codigoTaller = "2-543", categoria = "categoria")
@Técnico(nombre = "Manu", apellidos = "Ruiz", dni = "10793993L", direccion = "Calle Rosa 2", telefono = "654756482", codigoTaller = "Q-876", perfil = "perfil")

public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}