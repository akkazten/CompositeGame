
public abstract class HeroComponent {
    public abstract void print(int indent);
    public void add(HeroComponent system) {
        throw new UnsupportedOperationException();
    }
    public void remove(HeroComponent system) {
        throw new UnsupportedOperationException();
    }
    public HeroComponent getChild(int index) {
        return null;
    }
}