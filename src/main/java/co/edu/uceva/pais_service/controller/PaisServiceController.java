package co.edu.uceva.pais_service.controller;

import co.edu.uceva.pais_service.model.entities.Pais;
import co.edu.uceva.pais_service.model.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pais-service")
public class PaisServiceController {
    @Autowired
    IPaisService paisService;

    /**
     * End Point para recibir un saludo
     * @param nombre Es el nombre que envian desde la url
     * @return Un saludo
     */
    @GetMapping("/pais/{nombre}")
    public String imprimir(@PathVariable("nombre") String nombre){
        return "Pais=Colombia=" + nombre;
    }

    @GetMapping("/paises")
    public List<Pais> listar(){
        List <Pais> paises = new ArrayList<>();

        Pais pais1 = new Pais(1L,"Colombia");
        Pais pais2 = new Pais(2L,"Ecuador");
        paises.add(pais1);
        paises.add(pais2);
        return paises;
    }

    @GetMapping
    public Pais buscarPais(@PathVariable("id") Long id){
        return paisService.findById(id);
    }

    @PostMapping("/paises")
    //Cuerpo del navegador-RequestBody
    public Pais crearPais(@RequestBody Pais pais){
        return paisService.save(pais);
    }

    @DeleteMapping("/paises/{id}")
    public void borrarPais(@PathVariable("id") Long id){
        Pais pais;
        pais = paisService.findById(id);
        paisService.delete(pais);
    }

    @PutMapping("/paises")
    public Pais actualizarPais(@RequestBody Pais pais){
        return paisService.update(pais);
    }

}
