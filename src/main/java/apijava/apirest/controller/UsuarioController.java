package apijava.apirest.controller;
//onde fica as APIs Rest (com os metodos)

import apijava.apirest.model.UsuarioModel;
import apijava.apirest.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioRepository repository;
    private final PasswordEncoder encoder;

    public UsuarioController(UsuarioRepository repository, PasswordEncoder encoder){
        this.repository = repository;
        this.encoder = encoder;
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<UsuarioModel>> listarTodos() {

        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salva")
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario){
            usuario.setPassword(encoder.encode(usuario.getPassword()));

            return ResponseEntity.ok(repository.save(usuario));
        }

    }

