/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.evento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LabP4107
 */
public class Evento {

    private String responsable;
    private TipoEvento tipoEvento;
    private int niños;
    private int adultos;
    private Tematica tematica;
    private Salon salon;
    private double precioEvento;
    private Cliente cliente;
    private List<Servicio> serviciosSeleccionados;
    private double precioComida;


    public Evento(String responsable, int niños, int adultos, Cliente cliente) {
        this.responsable = responsable;
        this.niños = niños;
        this.adultos = adultos;
        this.cliente = cliente;
        this.serviciosSeleccionados = new ArrayList<>();

    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
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


    public int calcularAsistentesTotales() {
        return this.niños + this.adultos;
    }

    public List<Servicio> getServiciosSeleccionados() {
        return serviciosSeleccionados;
    }

    public String presentarServicios() {

        String resultado = "";

        for (Servicio s : serviciosSeleccionados) {
            resultado += s.getNombre() + " - ";
        }
        return resultado;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }


    public Salon getSalon() {
        return salon;
    }

    public double getPrecio() {
        return precioEvento;
    }

    public void asignarSalon() {
        int asistentesTotales = calcularAsistentesTotales();
        if (asistentesTotales >= 15 && asistentesTotales <= 25) {
            this.salon = Salon.PLATINO;
        }
        if (asistentesTotales >= 26 && asistentesTotales <= 45) {
            this.salon = Salon.ESMERALDA;
        }
        if (asistentesTotales > 45) {
            this.salon = Salon.DIAMANTE;
        }
    }

    public void calcularPrecioComida() {
        this.precioComida = 12 * this.niños + 25 * this.adultos;
    }

    public void calculaPrecio() {
        this.precioEvento = 150 + this.salon.getPrecio() + this.serviciosSeleccionados.size() * 4.5
                + this.precioComida;
    }

    public void generarEvento() {
        asignarSalon();
        calcularPrecioComida();
        calculaPrecio();
    }

    @Override
    public String toString() {
        return "Evento{" + "responsable=" + this.responsable + ", tipoEvento=" + this.tipoEvento
                + ", ni\u00f1os=" + this.niños + ", adultos=" + this.adultos + ", asistentesTotales="
                + calcularAsistentesTotales() + ", tematica=" + this.tematica + ", salon=" + this.salon.getNombre()
                + ", valorSalon=" + this.salon.getPrecio() + ", precioEvento=" + this.precioEvento
                + ", apellidoCliente=" + this.cliente.getApellidoCliente() + ", nombrecliente="
                + this.cliente.getNombrecliente() + ", contactoCliente=" + this.cliente.getContactoCliente()
                + ", servicios=" + this.presentarServicios() + ", numeroServicios=" + this.serviciosSeleccionados.size()
                + ", precioComida=" + this.precioComida + '}';
    }

    public void seleccionarServicio(Servicio servicio) {
        this.serviciosSeleccionados.add(servicio);
    }
}
