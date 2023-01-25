/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.iccr.Evento;

/**
 *
 * @author LabP4107
 */
public class Evento {

    private String responsable;
    private String tipoEvento;
    private int niños;
    private int adultos;
    private int asistentesTotales;
    //private String servicios;
    private String tematica;
    private String salon;
    private double valorSalon;
    private double precioEvento;
    private String apellidoCliente;
    private String nombrecliente;
    private int contactoCliente;

    private String[] servicios = new String[5];
    private int numeroServicios;
    private double precioComida;

    public Evento(String responsable, int niños, int adultos, String apellidoCliente, String nombrecliente, int contactoCliente) {
        this.responsable = responsable;
        this.niños = niños;
        this.adultos = adultos;
        this.apellidoCliente = apellidoCliente;
        this.nombrecliente = nombrecliente;
        this.contactoCliente = contactoCliente;
        this.asistentesTotales = this.niños + this.adultos;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNiños() {
        return niños;
    }

    public void setNiños(int niños) {
        this.niños = niños;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getAsistentesTotales() {
        return asistentesTotales;
    }

    public void setAsistentesTotales(int asistentesTotales) {
        this.asistentesTotales = asistentesTotales;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String[] getServicios() {
        return servicios;
    }

    public void setServicios(String[] servicios) {
        this.servicios = servicios;
    }

    public String presentarServicios() {

        String resultado = "";

        for (String s : servicios) {
            if (s != null) {
                resultado += s + " - ";
            }
        }
        return resultado;
    }

    public void numeroServicios() {
        int contador = 0;
        for (String s : servicios) {
            if (s != null) {
                contador += 1;
            }

        }
        this.numeroServicios = contador;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public double getPrecio() {
        return precioEvento;
    }

    public void setPrecio(double precio) {
        this.precioEvento = precio;
    }

    public int getContactoCliente() {
        return contactoCliente;
    }

    /**
     * Metodo que permite asignar un valor a la variable de instancia
     * contactoCliente
     *
     * @param contatoCliente numero telefonico que se va a guardar
     */
    public void setContactoCliente(int contactoCliente) {
        this.contactoCliente = contactoCliente;
    }

    public void salonAsignado() {
        if (this.asistentesTotales >= 15 && this.asistentesTotales <= 25) {
            this.salon = "platino";
            this.valorSalon = 350;
        }
        if (this.asistentesTotales >= 26 && this.asistentesTotales <= 45) {
            this.salon = "Esmeralda";
            this.valorSalon = 425;
        }
        if (this.asistentesTotales > 45) {
            this.salon = "Diamante";
            this.valorSalon = 500;
        }
    }

    public void Comida() {
        this.precioComida = 12 * this.niños + 25 * this.adultos;
    }

    public void calculaPrecio() {
        this.precioEvento = 150 + this.valorSalon + this.numeroServicios * 4.5
                + this.precioComida;
    }

    @Override
    public String toString() {
        return "Evento{" + "responsable=" + this.responsable + ", tipoEvento=" + this.tipoEvento
                + ", ni\u00f1os=" + this.niños + ", adultos=" + this.adultos + ", asistentesTotales="
                + this.asistentesTotales + ", tematica=" + this.tematica + ", salon=" + this.salon
                + ", valorSalon=" + this.valorSalon + ", precioEvento=" + this.precioEvento
                + ", apellidoCliente=" + this.apellidoCliente + ", nombrecliente="
                + this.nombrecliente + ", contactoCliente=" + this.contactoCliente
                + ", servicios=" + this.presentarServicios() + ", numeroServicios=" + this.numeroServicios
                + ", precioComida=" + this.precioComida + '}';
    }

}
