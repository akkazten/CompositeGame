import java.util.ArrayList;
import java.util.List;

public class Army extends HeroComponent {

    List<HeroComponent> systems = new ArrayList<>();

    String name;

    public Army(String name) {
        this.name = name;
    }

    @Override
    public void add(HeroComponent system) {
        systems.add(system);
    }

    @Override
    public void remove(HeroComponent system) {
        systems.remove(system);
    }

    @Override
    public HeroComponent getChild(int index) {
        return systems.get(index);
    }

    @Override
    public void print(int indent) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            builder.append("\t");
        }
        if (indent != 0) {
            builder.append(" - ");
        }
        builder.append(this.name);

        System.out.println(builder.toString());

        indent++;

        for (HeroComponent system : systems) {
            system.print(indent);
        }
    }
}