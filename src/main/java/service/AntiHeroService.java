package service;

import repository.AntiHeroRepository;
import entity.AntiHeroEntity;
import exception.NotFoundException;

import java.util.UUID;

public class AntiHeroService {
    private final AntiHeroRepository repo;

    public AntiHeroService(AntiHeroRepository repo) {
        this.repo = repo;
    }

    public  Iterable<AntiHeroEntity> findAllAntiHeroes() {
        return repo.findAll();
    }

    public AntiHeroEntity findAntiHeroById(UUID id) {
        return findOrThrow(id);
    }

    public void removeAntiHeroById(UUID id) {
        repo.deleteById(id);
    }

    public AntiHeroEntity addAntiHero(
            AntiHeroEntity antiHero) {
        return repo.save(antiHero);
    }

    public void updateAntiHero(UUID id, AntiHeroEntity antiHero){
        repo.save(antiHero);
    }

    private AntiHeroEntity findOrThrow (final UUID id) {
        return repo.findById(id).orElseThrow(
                () -> new NotFoundException("Anti-hero by id" + id + "no fue hallado"));
    }
}