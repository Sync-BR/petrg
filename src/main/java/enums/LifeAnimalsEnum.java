package enums;

public enum LifeAnimalsEnum {
    alive("Vivo"),
    dead("Morto");
    private String life;
    private LifeAnimalsEnum(String life) {
        this.life = life;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }
}
