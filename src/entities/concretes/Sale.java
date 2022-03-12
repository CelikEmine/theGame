package entities.concretes;

import entities.abstracts.Entity;

public class Sale implements Entity {

    private int id;
    private int gamerId;
    private int gameId;
    private int campaignId;


    public Sale(){

    }

    public Sale(int id, int gamerId, int gameId, int campaignId) {
        this.id = id;
        this.gamerId = gamerId;
        this.gameId = gameId;
        this.campaignId = campaignId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }
}
