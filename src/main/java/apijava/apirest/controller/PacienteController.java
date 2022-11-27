//package apijava.apirest.controller;

//import apijava.apirest.model.PacienteModel;
//import apijava.apirest.repository.PacienteRepository;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//@RestController
//public class PacienteController {

//    @Autowired
//    private PacienteRepository repository;

//    @GetMapping(path = "api/usuario/{codigo}")
//    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {

//        return repository.findById(codigo)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//    }
//    @PostMapping(path = "api/usuario/salvar")
//    public PacienteModel salvar(@RequestBody PacienteModel usuario) {
//        return repository.save(usuario);
//    }
//}
