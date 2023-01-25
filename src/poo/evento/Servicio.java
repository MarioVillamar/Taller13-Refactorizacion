package poo.evento;

public enum Servicio {
    ANIMACION("Animación"), COCTELERIA("Coctelería"), MENAJE_PREMIUM("Menaje Premium"),
    EQUIPO_SONIDO("Equipo de sonido");
    private String nombre;
    private Servicio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
