package Ej2.Estructura;

public class Directivo extends Empleado{
    private String codigoDespacho;

    public Directivo(String nombre, String apellidos, String dni, String direccion, String telefono, String codigoDespacho) {
        super (nombre, apellidos, dni, direccion, telefono);
        this.codigoDespacho = codigoDespacho;
    }

    public String getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(String codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}