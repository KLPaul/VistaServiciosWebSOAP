
package sw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Operaciones", targetNamespace = "http://sw/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Operaciones {


    /**
     * 
     * @param usuario
     * @return
     *     returns sw.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://sw/", className = "sw.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://sw/", className = "sw.LoginResponse")
    @Action(input = "http://sw/Operaciones/loginRequest", output = "http://sw/Operaciones/loginResponse")
    public Usuario login(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrar", targetNamespace = "http://sw/", className = "sw.Registrar")
    @ResponseWrapper(localName = "registrarResponse", targetNamespace = "http://sw/", className = "sw.RegistrarResponse")
    @Action(input = "http://sw/Operaciones/registrarRequest", output = "http://sw/Operaciones/registrarResponse")
    public boolean registrar(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param cantidad
     * @return
     *     returns sw.Transaccion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "depositar", targetNamespace = "http://sw/", className = "sw.Depositar")
    @ResponseWrapper(localName = "depositarResponse", targetNamespace = "http://sw/", className = "sw.DepositarResponse")
    @Action(input = "http://sw/Operaciones/depositarRequest", output = "http://sw/Operaciones/depositarResponse")
    public Transaccion depositar(
        @WebParam(name = "cantidad", targetNamespace = "")
        Transaccion cantidad);

    /**
     * 
     * @param cantidad
     * @return
     *     returns sw.Transaccion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retirar", targetNamespace = "http://sw/", className = "sw.Retirar")
    @ResponseWrapper(localName = "retirarResponse", targetNamespace = "http://sw/", className = "sw.RetirarResponse")
    @Action(input = "http://sw/Operaciones/retirarRequest", output = "http://sw/Operaciones/retirarResponse")
    public Transaccion retirar(
        @WebParam(name = "cantidad", targetNamespace = "")
        Transaccion cantidad);

}