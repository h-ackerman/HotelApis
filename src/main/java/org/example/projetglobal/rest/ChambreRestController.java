package org.example.projetglobal.rest;

import org.example.projetglobal.entities.Chambre;
import org.example.projetglobal.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chambres")
public class ChambreRestController {

    @Autowired
    private ChambreRepository chambreRepository;

    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable Long id) {
        return chambreRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Chambre> deleteChambre(@PathVariable Long id) {
        if (chambreRepository.existsById(id)) {
            chambreRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}

