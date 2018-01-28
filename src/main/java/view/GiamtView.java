package view;

import model.GiantModel;

import java.util.List;

public class GiamtView {

    public GiamtView() {
    }

    public void displayGiant(GiantModel giantModel, int k){
        System.out.println("\n"+(k+1)+" "+giantModel.toString());
    }

    public void displayGiantList(List<GiantModel> giantList){
        if (giantList.size()>0)
            for (int i=0; i<giantList.size(); i++)
                this.displayGiant(giantList.get(i),i);
        else System.out.println("brak stworów do wyświetlenia");
    }
}
