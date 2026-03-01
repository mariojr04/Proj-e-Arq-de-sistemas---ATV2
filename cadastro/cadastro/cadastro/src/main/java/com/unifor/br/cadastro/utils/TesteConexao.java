package com.unifor.br.cadastro.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.unifor.br.cadastro.entity.Usuario;
import com.unifor.br.cadastro.repository.UsuarioRepository; 


@Configuration
public class TesteConexao implements CommandLineRunner {



    @Autowired
    private UsuarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- TESTE DE INSERÇÃO NO SUPABASE ---");

        Usuario user = new Usuario();
        user.setUserName("Mario Teste"); 
        user.setEmail("mario@teste.com");
        user.setSenha("123456");
        user.setStatus(true);

        repository.save(user);

        System.out.println("--- USUÁRIO SALVO COM SUCESSO NO SUPABASE! ---");
    }
}