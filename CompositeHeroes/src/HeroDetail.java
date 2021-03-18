public class HeroDetail extends HeroComponent {

    String name;

    public HeroDetail(String name) {
        this.name = name;
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
    }
}