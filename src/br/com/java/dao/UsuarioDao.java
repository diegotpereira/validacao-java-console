package br.com.java.dao;

import br.com.java.modelo.Usuario;
import br.com.java.validacao.EmailValidator;
import br.com.java.validacao.SenhaValidator;
import br.com.java.validacao.Validator;

public class UsuarioDao {
    
    public void salvar(Usuario usuario) {
        valida(new SenhaValidator(), usuario.getSenha());
        valida(new EmailValidator(), usuario.getEmail());
        
        System.out.println("Usuário salvo com suceso.");
    }

    private <T> void valida(Validator<T> validator, T objeto) {

        try {
            validator.valida(objeto);

        } catch (Exception e) {
            String message = "Não foi possível salvar o usuário: " + e.getMessage();

            System.err.println(message);

            throw new RuntimeException(message);
        }
    }
}
