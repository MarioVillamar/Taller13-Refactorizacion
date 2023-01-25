package poo.evento;

public class Cliente {
    private String apellidoCliente;
    private String nombrecliente;
    private int contactoCliente;

    public Cliente(String nombrecliente, String apellidoCliente,int contactoCliente) {
        this.apellidoCliente = apellidoCliente;
        this.nombrecliente = nombrecliente;
        this.contactoCliente = contactoCliente;
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

    public int getContactoCliente() {
        return contactoCliente;
    }

    public void setContactoCliente(int contactoCliente) {
        this.contactoCliente = contactoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "apellidoCliente='" + apellidoCliente + '\'' +
                ", nombrecliente='" + nombrecliente + '\'' +
                ", contactoCliente=" + contactoCliente +
                '}';
    }
}
