public class Efecto {
    private String nombre;
    private boolean activo;
    private boolean tipo;
    private int duracion;

    public Efecto(String nombre, boolean activo, boolean tipo, int duracion) {
        this.nombre = nombre;
        this.activo = false;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public void activarEfecto(boolean activo){
        activo = true;
    }





}
