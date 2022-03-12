package dataAccess.concretes;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao {
    @Override
    public void add(Gamer gamer) {
        System.out.println("oyuncu kaydı yapıldı : "+gamer.getFirstName() );
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("oyuncu kaydı silindi : "+gamer.getFirstName() );
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("oyuncu kaydı güncellendi : "+gamer.getFirstName() );
    }
}
