package br.com.java;

import br.com.java.dao.UsuarioDao;
import br.com.java.modelo.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario("teste@teste.com", "123", 30);

        new UsuarioDao().salvar(usuario);
        
        System.out.println(usuario.getEmail());
    }
}
