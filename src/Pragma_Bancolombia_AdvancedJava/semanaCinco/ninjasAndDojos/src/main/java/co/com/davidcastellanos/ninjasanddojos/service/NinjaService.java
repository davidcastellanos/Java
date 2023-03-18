package co.com.davidcastellanos.ninjasanddojos.service;

import co.com.davidcastellanos.ninjasanddojos.model.Ninja;
import co.com.davidcastellanos.ninjasanddojos.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    //Retorna una lista de todos los ninjas
    public List<Ninja> findAllNinjas() {
        return ninjaRepository.findAll();
    }

    // Guarda un ninja en la DB usando CrudRepository
    public Ninja saveNewNinja(Ninja nuevoNinja) {
        return ninjaRepository.save(nuevoNinja);
    }

    // Retorna un ninja en base a su ID
    public Ninja findAndReturnNinjaUsingID(Long id) {
        return ninjaRepository.findById(id).orElse(null);
    }

    //Borrar ninja en base a su ID
    public void deleteNinjaUsingID(Long id) {
        ninjaRepository.deleteById(id);
    }


}
