package controller;

import model.Fatigue;
import model.GiantModel;
import model.Health;
import model.Norishment;
import view.GiamtView;

public class GiantController {

    private GiantModel giantModel;
    private GiamtView giantView;

    public GiantController (GiantModel giantModel, GiamtView giantView){
        this.giantModel=giantModel;
        this.giantView=giantView;
    }

    public Health getHealth(){
        return giantModel.getHealth();
    }

    public void setHealth(Health health){
        this.giantModel.setHealth(health);
    }

    public Fatigue getFatigue(){
        return giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue){
        this.giantModel.setFatigue(fatigue);
    }

    public Norishment getNorishment(){
        return giantModel.getNorishment();
    }

    public void setNorishment(Norishment norishment){
        this.giantModel.setNorishment(norishment);
    }

    public void updateView(){
        this.giantView.displayGiant(giantModel);
    }
}
