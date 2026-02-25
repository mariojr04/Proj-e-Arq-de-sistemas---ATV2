package com.unifor.br.cadastro.entity;

public class Usuario {

    private int id;
    private String userName;
    private String email;
    private boolean status;
    private String senha;

    public Usuario() {
    }

    public Usuario(int id, String userName, String email, boolean status, String senha) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.status = status;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() { // Para boolean, o padrão é "is" em vez de "get"
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}