package dataAccess.abstracts;

import entities.concretes.Campaign;

public interface CampaignDao {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
}
