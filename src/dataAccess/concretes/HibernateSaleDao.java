package dataAccess.concretes;

import dataAccess.abstracts.SaleDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class HibernateSaleDao implements SaleDao {
    @Override
    public void sell(Gamer gamer, Game game, Campaign campaign) {

        System.out.println(gamer.getId()+" id li müşteriye "+game.getName()+" oyunu satılmıştır. kampanya :"+ campaign.getName());

    }
}
