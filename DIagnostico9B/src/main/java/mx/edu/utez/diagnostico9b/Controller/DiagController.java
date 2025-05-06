package mx.edu.utez.diagnostico9b.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class DiagController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde mi backend";
    }
}

