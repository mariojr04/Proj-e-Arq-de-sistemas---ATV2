package com.unifor.br.cadastro.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.unifor.br.cadastro.entity.Usuario;
import com.unifor.br.cadastro.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private UsuarioRepository repository;
    public Usuario criarUsuario(Usuario usuario){

        Optional<Usuario> user = Optional.of(repository.save(usuario));
        if (user.isPresent()){
            return user.get();
        }else {
            throw new NullPointerException();
        }
    }

    public Usuario getUsuario(long id){
        return  repository.getById(id);
    }

    public Usuario atualizarUsuario(long id, Usuario novosDados) {
    // 1. Busca o usuário existente
    Usuario usuarioExistente = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

    // 2. Atualiza os campos necessários
    usuarioExistente.setUserName(novosDados.getUserName());
    usuarioExistente.setEmail(novosDados.getEmail());

    // 3. Salva a versão atualizada
    return repository.save(usuarioExistente);
}

public void deletarUsuario(long id) {
    // Verifica se existe antes de deletar para evitar erros
    if (!repository.existsById(id)) {
        throw new RuntimeException("Usuário não encontrado");
    }
    repository.deleteById(id);
}
}
