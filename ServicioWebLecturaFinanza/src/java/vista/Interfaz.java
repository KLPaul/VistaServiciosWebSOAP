
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    public JSpinner getSpnCantidad() {
        return spnCantidad;
    }

    public void setSpnCantidad(JSpinner spnCantidad) {
        this.spnCantidad = spnCantidad;
    }
    
    

    public JButton getBtnIngre() {
        return btnIngre;
    }

    public void setBtnIngre(JButton btnIngre) {
        this.btnIngre = btnIngre;
    }

    public JButton getBtnRegOpe() {
        return btnRegOpe;
    }

    public void setBtnRegOpe(JButton btnRegOpe) {
        this.btnRegOpe = btnRegOpe;
    }

    public JButton getBtnRegUsu() {
        return btnRegUsu;
    }

    public void setBtnRegUsu(JButton btnRegUsu) {
        this.btnRegUsu = btnRegUsu;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtn_ValiRegUsu() {
        return btn_ValiRegUsu;
    }

    public void setBtn_ValiRegUsu(JButton btn_ValiRegUsu) {
        this.btn_ValiRegUsu = btn_ValiRegUsu;
    }

    public JLabel getLblAlerReg() {
        return lblAlerReg;
    }

    public void setLblAlerReg(JLabel lblAlerReg) {
        this.lblAlerReg = lblAlerReg;
    }

    public JLabel getLblAlertInic() {
        return lblAlertInic;
    }

    public void setLblAlertInic(JLabel lblAlertInic) {
        this.lblAlertInic = lblAlertInic;
    }

    public JLabel getLblAlertOpeSal() {
        return lblAlertOpeSal;
    }

    public void setLblAlertOpeSal(JLabel lblAlertOpeSal) {
        this.lblAlertOpeSal = lblAlertOpeSal;
    }

    public JLabel getLblAlertOpeUsu() {
        return lblAlertOpeUsu;
    }

    public void setLblAlertOpeUsu(JLabel lblAlertOpeUsu) {
        this.lblAlertOpeUsu = lblAlertOpeUsu;
    }

    public JLabel getLblAlertOpera() {
        return lblAlertOpera;
    }

    public void setLblAlertOpera(JLabel lblAlertOpera) {
        this.lblAlertOpera = lblAlertOpera;
    }

    public JPanel getPnlInicio() {
        return pnlInicio;
    }

    public void setPnlInicio(JPanel pnlInicio) {
        this.pnlInicio = pnlInicio;
    }

    public JPanel getPnlOperaciones() {
        return pnlOperaciones;
    }

    public void setPnlOperaciones(JPanel pnlOperaciones) {
        this.pnlOperaciones = pnlOperaciones;
    }

    public JPanel getPnlRegistro() {
        return pnlRegistro;
    }

    public void setPnlRegistro(JPanel pnlRegistro) {
        this.pnlRegistro = pnlRegistro;
    }

    public JRadioButton getRdbDeposito() {
        return rdbDeposito;
    }

    public void setRdbDeposito(JRadioButton rdbDeposito) {
        this.rdbDeposito = rdbDeposito;
    }

    public JRadioButton getRdbRetiro() {
        return rdbRetiro;
    }

    public void setRdbRetiro(JRadioButton rdbRetiro) {
        this.rdbRetiro = rdbRetiro;
    }

    public JPasswordField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(JPasswordField txtPass) {
        this.txtPass = txtPass;
    }

    public JTextField getTxtPass2Reg() {
        return txtPass2Reg;
    }

    public void setTxtPass2Reg(JTextField txtPass2Reg) {
        this.txtPass2Reg = txtPass2Reg;
    }

    public JTextField getTxtPassReg() {
        return txtPassReg;
    }

    public void setTxtPassReg(JTextField txtPassReg) {
        this.txtPassReg = txtPassReg;
    }

    public JTextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(JTextField txtUser) {
        this.txtUser = txtUser;
    }

    public JTextField getTxtUserReg() {
        return txtUserReg;
    }

    public void setTxtUserReg(JTextField txtUserReg) {
        this.txtUserReg = txtUserReg;
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOperaciones = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblAlertOpeUsu = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnRegOpe = new javax.swing.JButton();
        lblAlertOpera = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        spnCantidad = new javax.swing.JSpinner();
        rdbDeposito = new javax.swing.JRadioButton();
        rdbRetiro = new javax.swing.JRadioButton();
        lblAlertOpeSal = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        pnlRegistro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_ValiRegUsu = new javax.swing.JButton();
        lblAlerReg = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        txtUserReg = new javax.swing.JTextField();
        txtPassReg = new javax.swing.JTextField();
        txtPass2Reg = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        pnlInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnRegUsu = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngre = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblAlertInic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Cuenta de Usuario:");
        pnlOperaciones.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblAlertOpeUsu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlOperaciones.add(lblAlertOpeUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 130, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Seleccione");
        pnlOperaciones.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("opción:");
        pnlOperaciones.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        btnRegOpe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegOpe.setText("Registrar");
        pnlOperaciones.add(btnRegOpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        lblAlertOpera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pnlOperaciones.add(lblAlertOpera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 260, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Valor:");
        pnlOperaciones.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("Saldo:");
        pnlOperaciones.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
        pnlOperaciones.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 170, 10));
        pnlOperaciones.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 460, 10));
        pnlOperaciones.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 170, 10));

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        pnlOperaciones.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 160, -1));

        rdbDeposito.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdbDeposito.setSelected(true);
        rdbDeposito.setText("Deposito");
        pnlOperaciones.add(rdbDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        rdbRetiro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdbRetiro.setText("Retiro");
        pnlOperaciones.add(rdbRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        lblAlertOpeSal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlOperaciones.add(lblAlertOpeSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 150, 30));
        pnlOperaciones.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, 10));
        pnlOperaciones.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 460, 10));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSalir.setText("Salir");
        pnlOperaciones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        getContentPane().add(pnlOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 520));

        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Registro de Usuario");
        pnlRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Ingrese Usuario:");
        pnlRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Ingrese Clave:");
        pnlRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Repetir Clave:");
        pnlRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Saldo Inicial:");
        pnlRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("100");
        pnlRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        btn_ValiRegUsu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_ValiRegUsu.setText("Registrar");
        pnlRegistro.add(btn_ValiRegUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        lblAlerReg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAlerReg.setForeground(new java.awt.Color(0, 153, 0));
        lblAlerReg.setText("Usuario registrado con éxito");
        pnlRegistro.add(lblAlerReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));
        pnlRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 470, 20));
        pnlRegistro.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, 20));
        pnlRegistro.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 170, 20));

        txtUserReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlRegistro.add(txtUserReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 170, -1));

        txtPassReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlRegistro.add(txtPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 170, -1));

        txtPass2Reg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlRegistro.add(txtPass2Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, -1));
        pnlRegistro.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 170, 20));
        pnlRegistro.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 470, 20));

        getContentPane().add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 510));

        pnlInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de acceso");
        pnlInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));
        pnlInicio.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 460, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Usuario:");
        pnlInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlInicio.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Clave:");
        pnlInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlInicio.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 230, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Si eres nuevo regístrate aquí");
        pnlInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        btnRegUsu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegUsu.setText("Registrar");
        pnlInicio.add(btnRegUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));
        pnlInicio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 10));

        btnIngre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIngre.setText("Ingresar");
        pnlInicio.add(btnIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));
        pnlInicio.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 10));
        pnlInicio.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 230, 10));
        pnlInicio.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 230, 10));
        pnlInicio.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 460, 10));

        lblAlertInic.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblAlertInic.setForeground(new java.awt.Color(255, 102, 51));
        lblAlertInic.setText("Usuario no existe o las credenciales erronenas ");
        pnlInicio.add(lblAlertInic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        getContentPane().add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngre;
    private javax.swing.JButton btnRegOpe;
    private javax.swing.JButton btnRegUsu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_ValiRegUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAlerReg;
    private javax.swing.JLabel lblAlertInic;
    private javax.swing.JLabel lblAlertOpeSal;
    private javax.swing.JLabel lblAlertOpeUsu;
    private javax.swing.JLabel lblAlertOpera;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlOperaciones;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JRadioButton rdbDeposito;
    private javax.swing.JRadioButton rdbRetiro;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPass2Reg;
    private javax.swing.JTextField txtPassReg;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUserReg;
    // End of variables declaration//GEN-END:variables
}
