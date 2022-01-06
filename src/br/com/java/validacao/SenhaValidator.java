package br.com.java.validacao;

public class SenhaValidator implements Validator<String>{

    @Override
    public void valida(String senha) throws ValidatorException {
        if (senha == null || senha.length() < 8) {
            throw new ValidatorException("A senha deve conter entre 8 e 32 caracteres.");
        }
        
    }
}
