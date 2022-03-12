package dataAccess.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public interface SaleDao {
    void sell(Gamer gamer, Game game, Campaign campaign);
}
