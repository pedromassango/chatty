package com.bukaapp.chatty.modelos;

public class Usuario {

    private String id;
    private String nome;
    private String status;
    private String imagemPerfil;

    public Usuario(){

    }

    public Usuario(String id, String nome, String status, String imagemPerfil) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.imagemPerfil = imagemPerfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String staus) {
        this.status = status;
    }

    public String getImagemPerfil() {
        return imagemPerfil;
    }

    public void setImagemPerfil(String imagemPerfil) {
        this.imagemPerfil = imagemPerfil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
