
package view;

import controller.UsuarioController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Usuario;

public class UsuarioEditarGUI extends JPanel {
    
    private JLabel lbId, lbNome, lbLogin, lbSenha1;
    private JTextField tfId, tfNome, tfLogin;
    private JPasswordField pfSenha1;
    private JButton btEditar, btLimpar;
    
    public UsuarioEditarGUI() {
        loadComponents();
        setEvents();
    }
    
    private void loadComponents() {
        setLayout(null);
        lbId = new JLabel("Id:");
        lbNome = new JLabel("Nome:");
        lbLogin = new JLabel("Login:");
        lbSenha1 = new JLabel("Senha:");
        tfId = new JTextField();
        tfNome = new JTextField();
        tfLogin = new JTextField();
        pfSenha1 = new JPasswordField();
        btEditar = new JButton("Alterar");
        btLimpar = new JButton("Limpar");
        
        lbId.setBounds(30, 30, 80, 25);
        tfId.setBounds(100, 30, 200, 25);
        tfNome.setBounds(100, 30, 200, 25);
        lbNome.setBounds(30, 75, 80, 25);
        tfNome.setBounds(100, 75, 200, 25);
        lbLogin.setBounds(30, 120, 80, 25);
        tfLogin.setBounds(100, 120, 200, 25);
        lbSenha1.setBounds(30, 165, 80, 25);
        pfSenha1.setBounds(100, 165, 200, 25);
        btEditar.setBounds(30, 210, 100, 25);
        btLimpar.setBounds(135, 210, 100, 25);
        
        add(lbId);
        add(tfId);
        add(lbNome);
        add(tfNome);
        add(lbLogin);
        add(tfLogin);
        add(lbSenha1);
        add(pfSenha1);
        add(btEditar);
        add(btLimpar);
    }

    private void setEvents() {
        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        btEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuarioController controller = new UsuarioController();
                if (controller.editar(new Usuario(tfLogin.getText(), String.valueOf(pfSenha1.getPassword()), tfNome.getText()))) {
                    JOptionPane.showMessageDialog(null, "Usuario atualizado!");
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario não atualizado!");
                }
                
            }
        });
        
    }
    
    private void limpar() {
        tfId.setText("");
        tfNome.setText("");
        tfLogin.setText("");
        pfSenha1.setText("");
        tfNome.requestFocus();
    }
    
}
