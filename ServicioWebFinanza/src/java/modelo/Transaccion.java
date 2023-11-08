
package modelo;

public class Transaccion {
    private int saldo;
    private boolean exito;
    private String usuario;

    public Transaccion() {
    }

    public Transaccion(int saldo, boolean exito, String usuario) {
        this.saldo = saldo;
        this.exito = exito;
        this.usuario = usuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
