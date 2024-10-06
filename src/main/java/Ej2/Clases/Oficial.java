package Ej2.Clases;

public final class Oficial extends Operario{
    private String categoria;

    public Oficial(String nombre, String apellidos, String dni, String direccion, String telefono, String codigoTaller, String categoria) {
        super (nombre, apellidos, dni, direccion, telefono, codigoTaller);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}