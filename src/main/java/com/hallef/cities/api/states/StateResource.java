package com.hallef.cities.api.states;


import com.hallef.cities.api.countries.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/states") //Rota estados
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping //Busca todos os estados
    public List<State> states() {
        return repository.findAll();
    }

    @GetMapping("/{id}") //Busca estados por ID
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<State> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}