package com.unifor.br.cadastro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unifor.br.cadastro.entity.Usuario;
import com.unifor.br.cadastro.services.UsuarioService;

@RestController("cadastrar")
public class UsuarioController {

    private UsuarioService service;

    @PostMapping("/criar")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario){

        return ResponseEntity.ok(service.criarUsuario(usuario));

    }

    @GetMapping("/buscar")
    public ResponseEntity<Usuario> getUsuario(@RequestParam("id") long id){

        return ResponseEntity.ok(service.getUsuario(id));
    }


    @PutMapping("/atualizar")
    public ResponseEntity<Usuario> atualizarUsuario(@RequestParam("id") long id, @RequestBody Usuario usuario) {
        // Passamos o ID e o corpo com os novos dados para o service
        Usuario usuarioAtualizado = service.atualizarUsuario(id, usuario);
        return ResponseEntity.ok(usuarioAtualizado);
    }

    @DeleteMapping("/deletar")
    public ResponseEntity<Void> deletarUsuario(@RequestParam("id") long id) {
        service.deletarUsuario(id);
        // Retornamos 204 No Content, pois o objeto não existe mais
        return ResponseEntity.noContent().build();
    }


}
