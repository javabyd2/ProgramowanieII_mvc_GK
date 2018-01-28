import controller.GiantController;
import model.Fatigue;
import model.GiantModel;
import model.Health;
import model.Norishment;
import view.GiamtView;

public class Main {

    public static void main(String[] args) {
        GiantModel giant1 = new GiantModel(
                Health.HEALTHY,
                Fatigue.NO,
                Norishment.NOTHUNGRY);

        GiamtView view = new GiamtView();
        GiantController controller = new GiantController(giant1, view);
        controller.updateView();

        controller.setHealth(Health.NOHEALTHY);
        controller.updateView();
    }
}
