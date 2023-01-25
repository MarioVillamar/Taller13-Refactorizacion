package poo.evento;

public enum TipoEvento {
    NOCTURNO("Nocturno"),DIURNO("Diurno");
    private String nombre;

    TipoEvento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
