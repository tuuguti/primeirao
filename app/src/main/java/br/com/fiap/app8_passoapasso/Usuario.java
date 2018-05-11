package br.com.fiap.app8_passoapasso;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome;
    private String endereco;

    public Usuario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
