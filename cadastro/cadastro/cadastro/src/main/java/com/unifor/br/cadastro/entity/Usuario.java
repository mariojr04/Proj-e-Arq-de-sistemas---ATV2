package com.unifor.br.cadastro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
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
    public String getUserName() {
        return userName;
    }
    public String getEmail() {
        return email;
    }
    public boolean isStatus() { 
        return status;
    }
    public String getSenha() {
        return senha;
    }


    public void setUserName(String userName) { 
        this.userName = userName; }
    public void setEmail(String email) { 
        this.email = email; }
    public void setSenha(String senha) { 
        this.senha = senha; }
    public void setStatus(boolean status) { 
        this.status = status; }
    public void setId(int id) {
        this.id = id;
    }
}