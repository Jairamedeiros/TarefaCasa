
package controller;

import dao.UsuarioDao;
import model.Usuario;


public class UsuarioController {
    private final UsuarioDao dao;
    
    public UsuarioController() {
        dao = new UsuarioDao();
    }
    
    public boolean cadastrar(Usuario usuario) {
        if (dao.findByLogin(usuario.getLogin()) == null) {
            if (dao.create(usuario)) {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean editar(Usuario usuario){
         if (dao.findById(usuario.getId()) == null) {
            if (dao.update(usuario)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean excluir(Usuario usuario){
         if (dao.findById(usuario.getId()) == null) {
            if (dao.delete(usuario)){
                return true;
            }
        }
         return false;
    }
     
  
    
    public boolean login(String login, String senha) {
        Usuario usuario = dao.findByLogin(login);
        if (usuario != null && usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
            return true;
        }
        return false;
    } 
    
}
    
    
    
    
    
    
    
    
    
    

