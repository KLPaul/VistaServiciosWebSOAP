
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Depositar_QNAME = new QName("http://sw/", "depositar");
    private final static QName _DepositarResponse_QNAME = new QName("http://sw/", "depositarResponse");
    private final static QName _Login_QNAME = new QName("http://sw/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://sw/", "loginResponse");
    private final static QName _Registrar_QNAME = new QName("http://sw/", "registrar");
    private final static QName _RegistrarResponse_QNAME = new QName("http://sw/", "registrarResponse");
    private final static QName _Retirar_QNAME = new QName("http://sw/", "retirar");
    private final static QName _RetirarResponse_QNAME = new QName("http://sw/", "retirarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Depositar }
     * 
     */
    public Depositar createDepositar() {
        return new Depositar();
    }

    /**
     * Create an instance of {@link DepositarResponse }
     * 
     */
    public DepositarResponse createDepositarResponse() {
        return new DepositarResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Registrar }
     * 
     */
    public Registrar createRegistrar() {
        return new Registrar();
    }

    /**
     * Create an instance of {@link RegistrarResponse }
     * 
     */
    public RegistrarResponse createRegistrarResponse() {
        return new RegistrarResponse();
    }

    /**
     * Create an instance of {@link Retirar }
     * 
     */
    public Retirar createRetirar() {
        return new Retirar();
    }

    /**
     * Create an instance of {@link RetirarResponse }
     * 
     */
    public RetirarResponse createRetirarResponse() {
        return new RetirarResponse();
    }

    /**
     * Create an instance of {@link Transaccion }
     * 
     */
    public Transaccion createTransaccion() {
        return new Transaccion();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Depositar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Depositar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "depositar")
    public JAXBElement<Depositar> createDepositar(Depositar value) {
        return new JAXBElement<Depositar>(_Depositar_QNAME, Depositar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "depositarResponse")
    public JAXBElement<DepositarResponse> createDepositarResponse(DepositarResponse value) {
        return new JAXBElement<DepositarResponse>(_DepositarResponse_QNAME, DepositarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registrar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "registrar")
    public JAXBElement<Registrar> createRegistrar(Registrar value) {
        return new JAXBElement<Registrar>(_Registrar_QNAME, Registrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "registrarResponse")
    public JAXBElement<RegistrarResponse> createRegistrarResponse(RegistrarResponse value) {
        return new JAXBElement<RegistrarResponse>(_RegistrarResponse_QNAME, RegistrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Retirar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "retirar")
    public JAXBElement<Retirar> createRetirar(Retirar value) {
        return new JAXBElement<Retirar>(_Retirar_QNAME, Retirar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetirarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "retirarResponse")
    public JAXBElement<RetirarResponse> createRetirarResponse(RetirarResponse value) {
        return new JAXBElement<RetirarResponse>(_RetirarResponse_QNAME, RetirarResponse.class, null, value);
    }

}
