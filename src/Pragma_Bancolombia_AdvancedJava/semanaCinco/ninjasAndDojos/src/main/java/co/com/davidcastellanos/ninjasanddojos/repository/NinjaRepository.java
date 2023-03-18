package co.com.davidcastellanos.ninjasanddojos.repository;

import co.com.davidcastellanos.ninjasanddojos.model.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
    List<Ninja> findByFirstName(String firstName);
    List<Ninja> findById(long id);


}
