package de.webApp.WebApp2.repository;

import de.webApp.WebApp2.model.GiftTshirt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftTshirtRepository extends CrudRepository<GiftTshirt, Integer> {

}
