package br.com.java.modelo;

public class Usuario {
    
    private String email;
    private String senha;
    private int idade;
    
    public Usuario(String email, String senha, int idade) {
        this.email = email;
        this.senha = senha;
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
