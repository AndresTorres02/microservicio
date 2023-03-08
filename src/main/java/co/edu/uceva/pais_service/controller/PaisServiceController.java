package co.edu.uceva.pais_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais-service")
public class PaisServiceController {
    /**
     *Este metodo solo saluda al navegador
     * @return El saludo
     */
    @GetMapping("/pais")
    public String imprimir(){//TODO Hacer un saludo personalizado con el nombre
        return "Pais=Colombia";
    }
}
