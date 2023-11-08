
package modelo;

public class Usuario {
    private int sldo;
    private String nombre;
    private String clave;

    public Usuario() {
    }

    public Usuario(int sldo, String nombre, String clave) {
        this.sldo = sldo;
        this.nombre = nombre;
        this.clave = clave;
    }

    public int getSldo() {
        return sldo;
    }

    public void setSldo(int sldo) {
        this.sldo = sldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
