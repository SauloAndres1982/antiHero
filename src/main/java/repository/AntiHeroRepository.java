package repository;

import entity.AntiHeroEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;
public interface AntiHeroRepository extends CrudRepository<AntiHeroEntity, UUID> {


}
