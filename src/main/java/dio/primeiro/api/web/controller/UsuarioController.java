 package dio.primeiro.api.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import dio.primeiro.api.web.model.Usuario;
import dio.primeiro.api.web.repository.UserRepository;
import java.util.List;
@RestController
public class UsuarioController {

@Autowired 
private UserRepository repository;
@GetMapping("/users")
public List<Usuario> getUsers(){

return	repository.findAll();
}
}
