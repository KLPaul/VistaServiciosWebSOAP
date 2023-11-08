
package main;

import control.control;
import sw.Transaccion;
import sw.Usuario;
import vista.Interfaz;

public class Iniciar {
    
    public static void main(String[] args) {
        
        Interfaz inter = new Interfaz();
        Usuario usuSW = new Usuario();
        Transaccion traSW = new Transaccion();
        control cnt = new control(inter,usuSW,traSW);
        
        cnt.iniciarControl();
    }
    
}
