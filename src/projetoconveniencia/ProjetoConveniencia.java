/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconveniencia;
import br.com.frames.F11CadastroUsuario;
import br.com.frames.F12CadastroAdministrador;
import br.com.frames.Login;
import br.com.frames.Menu;
import br.com.frames.TelaPrincipal;
import br.com.frames.TelaPrincipalAdm1;
import static br.com.frames.TelaPrincipal.redimensionarFrameTotal;
import br.com.hibernate.mapping.CadastroAdministrador;
import javax.swing.JFrame;


/**
 *
 * @author tinho
 */
public class ProjetoConveniencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new TelaPrincipal().setVisible(true);
     
        
        new Login().setVisible(true);
    }
    
}
