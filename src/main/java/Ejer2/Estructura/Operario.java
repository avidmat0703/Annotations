package Ejer2.Estructura;

public class Operario extends Empleado{
    private String codigoTaller;

    public Operario(String nombre, String apellidos, String dni, String direccion, String telefono, String codigoTaller) {
        super (nombre, apellidos, dni, direccion, telefono);
        this.codigoTaller = codigoTaller;
    }

    public String getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(String codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}