package Ej2.Clases;

public final class Técnico extends Operario{
    private String perfil;

    public Técnico(String nombre, String apellidos, String dni, String direccion, String telefono, String codigoTaller, String perfil) {
        super (nombre, apellidos, dni, direccion, telefono, codigoTaller);
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}