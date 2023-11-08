
package sw;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Transaccion;
import modelo.Usuario;


@WebService(serviceName = "Operaciones")
public class Operaciones {

    private ArrayList<Usuario> arrUsu = new ArrayList<>();

    /**
     * REGISTRAR
     */
    @WebMethod(operationName = "registrar")
    public boolean registrar(@WebParam(name = "usuario") Usuario usuario) {
        //TODO write your implementation code here:
        return arrUsu.add(usuario);
    }

    /**
     * INGRESAR
     */
    @WebMethod(operationName = "login")
    public Usuario login(@WebParam(name = "usuario") Usuario usuario) {
        
        Usuario user = new Usuario();
        
        for (int i = 0; i < arrUsu.size(); i++) {
            if (arrUsu.get(i).getNombre().equals(usuario.getNombre()) && arrUsu.get(i).getClave().equals(usuario.getClave())) {
                
                user = arrUsu.get(i);
                break;
            }
        }
        return user;
    }

    /**
     * DEPOSITAR
     */
    @WebMethod(operationName = "depositar")
    public Transaccion depositar(@WebParam(name = "cantidad") Transaccion tra) {
        
        Transaccion depo = new Transaccion();
        for (int i = 0; i < arrUsu.size(); i++) {
            
            if(arrUsu.get(i).getNombre().equals(tra.getUsuario())){
                depo.setExito(true);
                arrUsu.get(i).setSldo(arrUsu.get(i).getSldo() + tra.getSaldo());
                depo.setSaldo(arrUsu.get(i).getSldo());
                depo.setUsuario(arrUsu.get(i).getNombre());
                break;
            }
        }
        return depo;
    }

    /**
     * RETIRAR
     */
    @WebMethod(operationName = "retirar")
    public Transaccion retirar(@WebParam(name = "cantidad") Transaccion tra) {
        
        Transaccion ret = new Transaccion();
        for (int i = 0; i < arrUsu.size(); i++) {
            
            if(arrUsu.get(i).getNombre().equals(tra.getUsuario())){
                
                if(arrUsu.get(i).getSldo() > tra.getSaldo()){
                    ret.setExito(true);
                    arrUsu.get(i).setSldo(arrUsu.get(i).getSldo() - tra.getSaldo());
                    ret.setSaldo(arrUsu.get(i).getSldo());
                    ret.setUsuario(arrUsu.get(i).getNombre());
                    break;
                }else{
                    ret.setExito(false);
                    ret.setSaldo(arrUsu.get(i).getSldo());
                    ret.setUsuario(tra.getUsuario());
                }
                
            }
        }
        return ret;
    }
    
    
    
    
    
    

    
    
    
}
