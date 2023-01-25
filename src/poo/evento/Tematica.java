package poo.evento;

public enum Tematica {
    INFORMAL("Informal"),FORMAL("Formal");
    private String nombre;

    Tematica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
