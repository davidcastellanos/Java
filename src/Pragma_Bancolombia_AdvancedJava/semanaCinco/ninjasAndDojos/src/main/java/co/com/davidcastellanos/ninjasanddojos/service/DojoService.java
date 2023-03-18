package co.com.davidcastellanos.ninjasanddojos.service;

import co.com.davidcastellanos.ninjasanddojos.model.Dojo;
import co.com.davidcastellanos.ninjasanddojos.repository.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DojoService {
    @Autowired
    private DojoRepository dojoRepository;

    //Retorna una lista de todos los Dojos
    public List<Dojo> findAndReturnAllDojos() {
        return dojoRepository.findAll();
    }

    // Retorna un Dojo en base a su ID
    public Dojo findAndReturnDojoUsingID(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }

    // Guarda un Dojo en la DB usando CrudRepository
    public Dojo saveNewDojo(Dojo nuevoDojo) {
        return dojoRepository.save(nuevoDojo);
    }

}
