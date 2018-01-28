package controller;

import model.Fatigue;
import model.GiantModel;
import model.Health;
import model.Norishment;
import view.GiamtView;

import java.util.List;

public class GiantController {

    private List<GiantModel> giantModel;
    private GiamtView giantView;

    public GiantController (List<GiantModel> giantModel, GiamtView giantView){
        this.giantModel=giantModel;
        this.giantView=giantView;
    }

    public Health getHealth(int k){
        return giantModel.get(k).getHealth();
    }

    public void setHealth(Health health, int k){
        this.giantModel.get(k).setHealth(health);
    }

    public Fatigue getFatigue(int k){
        return giantModel.get(k).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int k){
        this.giantModel.get(k).setFatigue(fatigue);
    }

    public Norishment getNorishment(int k){
        return giantModel.get(k).getNorishment();
    }

    public void setNorishment(Norishment norishment, int k){
        this.giantModel.get(k).setNorishment(norishment);
    }

    public void updateView(int k){
        this.giantView.displayGiant(giantModel.get(k), k);
    }

    public void updateViewList(){
        this.giantView.displayGiantList(giantModel);
    }
}
