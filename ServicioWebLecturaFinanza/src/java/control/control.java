
package control;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import sw.Operaciones;
import sw.Operaciones_Service;
import sw.Transaccion;
import sw.Usuario;
import vista.Interfaz;

public class control {
    
    private Interfaz vIn;
    
    private Operaciones_Service servicio = new Operaciones_Service (); 
    private Operaciones ope = servicio.getOperacionesPort();
    private Usuario usuSW;
    private Transaccion traSW;

    public control(Interfaz vIn, Usuario usuSW, Transaccion traSW) {
        this.vIn = vIn;
        this.usuSW = usuSW;
        this.traSW = traSW;
        vIn.setLocationRelativeTo(null);
        vIn.setVisible(true);   
    }
    
    public void iniciarControl(){
        vIn.getBtnRegUsu().addActionListener(l -> irPanelRegistro());
        vIn.getBtn_ValiRegUsu().addActionListener(l -> verificarRegistro());
        vIn.getBtnIngre().addActionListener(l -> login());
        vIn.getBtnRegOpe().addActionListener(l -> registrarOperaciones());
        vIn.getBtnSalir().addActionListener(l->irPanelInicio());
    }
    
    private void referenciarObjetos() {
        vIn.getPnlRegistro().setVisible(false);
        vIn.getPnlOperaciones().setVisible(false);
        vIn.getLblAlertInic().setVisible(false);
    }

    private void irPanelRegistro() {
        vIn.getPnlRegistro().setVisible(true);
        vIn.getPnlInicio().setVisible(false);
        vIn.getTxtPass2Reg().setText("");
        vIn.getTxtPassReg().setText("");
        vIn.getTxtUserReg().setText("");
        vIn.getLblAlerReg().setVisible(false);

    }

    private void irPanelInicio() {
        vIn.getPnlRegistro().setVisible(false);
        vIn.getPnlOperaciones().setVisible(false);
        vIn.getPnlInicio().setVisible(true);
        vIn.getTxtUser().setText("");
        vIn.getTxtPass().setText("");
        vIn.getLblAlertInic().setVisible(false);

    }

    private void irPanelOperaciones() {
        vIn.getLblAlertOpera().setText("");
        vIn.getPnlRegistro().setVisible(false);
        vIn.getPnlOperaciones().setVisible(true);
        vIn.getPnlInicio().setVisible(false);
        vIn.getLblAlertOpeUsu().setText(usuSW.getNombre());
        vIn.getLblAlertOpeSal().setText(usuSW.getSldo()+ "");

    }
    
    

    private void verificarRegistro() {
        String usuario = "";
        String pass = "";
        String pass2 = "";

        usuario = vIn.getTxtUserReg().getText().trim();
        pass = vIn.getTxtPassReg().getText().trim();
        pass2 = vIn.getTxtPass2Reg().getText().trim();

        if (usuario.equals("") || pass.equals("") || pass2.equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");

        } else {
            if (pass.equals(pass2)) {
                usuSW.setNombre(usuario);
                usuSW.setClave(pass2);
                usuSW.setSldo(100);

                if (ope.registrar(usuSW)) {

                    vIn.getLblAlerReg().setVisible(true);

                    //crear un timertask para mostrar que fue registrado exitosamente
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {

                            irPanelInicio();
                        }
                    }, 1500);

                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }

        }

    }

    private void login() {
        vIn.getLblAlertInic().setVisible(false);
        String user = "";

        user = vIn.getTxtUser().getText().trim();
        char clave[] = vIn.getTxtPass().getPassword();
        String clavedef = new String(clave);
        usuSW.setNombre(user);
        usuSW.setClave(clavedef);

        usuSW = ope.login(usuSW);

        if (usuSW.getNombre() == null) {

            vIn.getLblAlertInic().setVisible(true);
        } else {

            irPanelOperaciones();
        }
    }

    private void registrarOperaciones() {
        int saldo = Integer.parseInt(vIn.getSpnCantidad().getValue().toString());
        
        //realizar retiros
        if (vIn.getRdbRetiro().isSelected()) {
            traSW.setSaldo(saldo);
            traSW.setUsuario(usuSW.getNombre());

            traSW = ope.retirar(traSW);
      

            if (traSW.isExito()) {
                vIn.getLblAlertOpera().setText("Operación exitosa");
                vIn.getLblAlertOpera().setForeground(Color.GREEN);
                vIn.getLblAlertOpeSal().setText(traSW.getSaldo() + "");
            } else {
                vIn.getLblAlertOpera().setText("Saldo insuficiente");
                vIn.getLblAlertOpera().setForeground(Color.RED);
            }
        } else {
            //realizar depositos
            traSW.setSaldo(saldo);
            traSW.setUsuario(usuSW.getNombre());
            traSW=ope.depositar(traSW);
             System.out.println(traSW.getSaldo()+"Depo");
            if(traSW.isExito()){
                vIn.getLblAlertOpera().setText("Operación exitosa");
                vIn.getLblAlertOpera().setForeground(Color.GREEN);
                vIn.getLblAlertOpeSal().setText(traSW.getSaldo() + "");
            }else{
                
                JOptionPane.showMessageDialog(null, "erro al depositar");
            }
        }

    }
    
    
    
    
}
