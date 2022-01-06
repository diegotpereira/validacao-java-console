package br.com.java.validacao;

public interface Validator<T> {
    
    void valida(T objeto) throws ValidatorException;
}
