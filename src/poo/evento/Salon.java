package poo.evento;

public enum Salon {
    PLATINO("Platino", 350), ESMERALDA("Esmeralda", 425),
    DIAMANTE("Diamante", 500);
    private String nombre;
    private int precio;

    Salon(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
