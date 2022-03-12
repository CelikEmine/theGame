package business.concretes;

import business.abstracts.GamerService;
import core.abstracts.IdValidator;
import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {

    private GamerDao gamerDao;
    private IdValidator validator;

    public GamerManager(GamerDao gamerDao,IdValidator validator) {
        this.gamerDao = gamerDao;
        this.validator=validator;
    }

    @Override
    public void add(Gamer gamer) {

        if(validator.validate(gamer.getIdentityNumber(),gamer.getFirstName(),gamer.getLastName(),gamer.getYearOfBirth())){
            gamerDao.add(gamer);
        }

    }

    @Override
    public void delete(Gamer gamer) {
        gamerDao.delete(gamer);
    }

    @Override
    public void update(Gamer gamer) {
        gamerDao.update(gamer);
    }
}
