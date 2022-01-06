package br.com.java.validacao;

public class EmailValidator implements Validator<String>{

    private static final String REGEX_EMAIL = 
                            "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)" +
                            " |(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    @Override
    public void valida(String email) throws ValidatorException {
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(REGEX_EMAIL);

        if (email == null || !p.matcher(email).matches()) {
            throw new ValidatorException("O e-mail não é valido.");
        }
        
    }

    
}
