
import Controler.ConexionControler;
import Modelos.Coneccion;
import Modelos.PersonaModel;
import Vistas.frmLogIn;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;

public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogIn VistaLogin = new frmLogIn(VistaPrincipal, true);
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal, true);
        Coneccion nuevaConexion = new Coneccion();
        PersonaModel ModeloPersona = new PersonaModel();
        
        ConexionControler ControladorConexion = new ConexionControler(VistaLogin, 
        VistaPrincipal, VistaPersonas,ModeloPersona ,nuevaConexion);
    }
    
}
