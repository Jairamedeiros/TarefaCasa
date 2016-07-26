
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Usuario;

public class UsuarioEditarGUI {
    private JLabel lbNome, lbLogin, lbSenha1, lbSenha2;
    private JTextField tfNome, tfLogin;
    private JPasswordField pfSenha1, pfSenha2;
    private JButton btEditar, btLimpar;
    
    
 public UsuarioEditarGUI() {
        loadComponents();
        setEvents();
    }

    private void loadComponents() {
        setLayout(null);
    
        lbNome = new JLabel("Nome:");
        lbLogin = new JLabel("Login:");
        lbSenha1 = new JLabel("Senha:");
        lbSenha2 = new JLabel("Confirma:");
        tfNome = new JTextField();
        tfLogin = new JTextField();
        pfSenha1 = new JPasswordField();
        pfSenha2 = new JPasswordField();
        btEditar = new JButton("Editar");
        btLimpar = new JButton("Limpar");
        
        lbNome.setBounds(30, 30, 80, 25);
        tfNome.setBounds(100, 30, 200, 25);
        lbLogin.setBounds(30, 75, 80, 25);
        tfLogin.setBounds(100, 75, 200, 25);
        lbSenha1.setBounds(30, 120, 80, 25);
        pfSenha1.setBounds(100, 120, 200, 25);
        lbSenha2.setBounds(30, 165, 80, 25);
        pfSenha2.setBounds(100, 165, 200, 25);
        btEditar.setBounds(30, 210, 100, 25);
        btLimpar.setBounds(135, 210, 100, 25);
       
        
        
        
        
        
        
       
    }
        
   
    private void setEvents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

        
        
}   
        
        
 

