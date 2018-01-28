package model;

public class GiantModel {

    private Health health;
    private Fatigue fatigue;
    private Norishment norishment;

    public GiantModel(Health health,
                      Fatigue fatigue,
                      Norishment norishment) {
        this.health = health;
        this.fatigue = fatigue;
        this.norishment = norishment;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Norishment getNorishment() {
        return norishment;
    }

    public void setNorishment(Norishment norishment) {
        this.norishment = norishment;
    }

    @Override
    public String toString() {
        return "\nGiantModel" +
                "\n\thealth=" + health +
                "\n\tfatigue=" + fatigue +
                "\n\tnorishment=" + norishment;
    }
}
