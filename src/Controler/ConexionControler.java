

package Controler;

import Modelos.Coneccion;
import Modelos.PersonaModel;
import Vistas.frmLogIn;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConexionControler implements ActionListener {
    
    frmLogIn VistaLogin;
    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersonas;
    PersonaModel ModeloPersona;
    Coneccion ModeloConexion;

    public ConexionControler(frmLogIn VistaLogin, frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, PersonaModel ModeloPersona, Coneccion ModeloConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.ModeloPersona = ModeloPersona;
        this.ModeloConexion = ModeloConexion;
        
             //LEVANTAR FORMULARIO PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        //Proner a la escucha boton principal
        this.VistaLogin.btnAceptar.addActionListener(this);
        
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == this.VistaLogin.btnAceptar)
       
       this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(),
               this.VistaLogin.txtPass.getText());
        
        if(ModeloConexion != null){
            this.VistaLogin.dispose();
            this.VistaPersonas.btnGuardar.addActionListener(this);
            this.VistaPersonas.setLocationRelativeTo(null);
            this.VistaPersonas.setVisible(true);
        }
       /*if(arg0.getSource() ==this.VistaPersonas.btnGuardar){
           //MANDAR A GUARDAR EL REGISTRO
           this.ModeloPersona.GuardarPersona(this.VistaPersonas.txtApellidos.getText(),
                   this.VistaPersonas.txtNombre.getText(),
                   this.VistaPersonas.txtTelefono.getText());
           
       }*/
    }
    
    
    
}
