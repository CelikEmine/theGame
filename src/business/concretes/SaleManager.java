package business.concretes;

import business.abstracts.SaleService;
import dataAccess.abstracts.SaleDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class SaleManager implements SaleService {

    SaleDao saleDao;

    public SaleManager(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    @Override
    public void sell(Gamer gamer, Game game, Campaign campaign) {

        saleDao.sell(gamer,game,campaign);

    }
}
