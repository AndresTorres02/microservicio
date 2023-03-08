package co.edu.uceva.pais_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais-service")
public class PaisServiceController {
    /**
     * End Point para recibir un saludo
     * @param nombre Es el nombre que envian desde la url
     * @return Un saludo
     */
    @GetMapping("/pais/{nombre}")
    public String imprimir(@PathVariable("nombre") String nombre){
        return "Pais=Colombia=" + nombre;
    }
}
