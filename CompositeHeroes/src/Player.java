
public class Player {

    HeroComponent component;

    public Player(HeroComponent component) {
        this.component = component;
    }
    public void getHero() {
        component.print(0);
    }
}