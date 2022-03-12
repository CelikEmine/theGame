package api;

import business.abstracts.GamerService;
import business.abstracts.SaleService;
import business.concretes.GamerManager;
import business.concretes.SaleManager;
import core.concretes.MernisValidator;
import dataAccess.concretes.HibernateGamerDao;
import dataAccess.concretes.HibernateSaleDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

    public static void main(String[] args) {

        Gamer gamer1=new Gamer(1,"3131585474","emine","çelik",1995);
        Game game1=new Game(1,"pubg");
        Campaign campaign1=new Campaign(1,"yılbaşı kampanyası");

        GamerService gamerService=new GamerManager(new HibernateGamerDao(),new MernisValidator());

        gamerService.add(gamer1);

        SaleService saleService=new SaleManager(new HibernateSaleDao());
        saleService.sell(gamer1,game1,campaign1);



    }
}
