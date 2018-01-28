import controller.GiantController;
import model.Fatigue;
import model.GiantModel;
import model.Health;
import model.Norishment;
import view.GiamtView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<GiantModel> giantList = new ArrayList<GiantModel>();

        GiantModel giant1 = new GiantModel(
                Health.HEALTHY,
                Fatigue.NO,
                Norishment.NOTHUNGRY);

        giantList.add(giant1);

        GiantModel giant2 = new GiantModel(
                Health.NOHEALTHY,
                Fatigue.SLEEPING,
                Norishment.NOTHUNGRY);

        giantList.add(giant2);

        GiamtView view = new GiamtView();
        GiantController controller = new GiantController(giantList, view);

        //wyświetlenie listy
        controller.updateViewList();

        //zmiana pola dla wyświetlanego k - 1
        controller.setHealth(Health.DEAD,1);
        controller.updateViewList();
    }
}
