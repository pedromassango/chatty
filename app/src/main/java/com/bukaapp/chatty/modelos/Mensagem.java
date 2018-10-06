package com.bukaapp.chatty.modelos;

public class Mensagem {

    private String id;
    private String mensagem;
    private String data;
    private String author;
    private String destinatario;

    public Mensagem(){ }

    public Mensagem(String id, String mensagem, String data, String author, String destinatario) {
        this.id = id;
        this.mensagem = mensagem;
        this.data = data;
        this.author = author;
        this.destinatario = destinatario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
