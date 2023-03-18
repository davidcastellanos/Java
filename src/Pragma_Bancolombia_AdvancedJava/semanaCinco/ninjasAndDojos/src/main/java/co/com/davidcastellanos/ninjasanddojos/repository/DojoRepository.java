package co.com.davidcastellanos.ninjasanddojos.repository;

import co.com.davidcastellanos.ninjasanddojos.model.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
}
