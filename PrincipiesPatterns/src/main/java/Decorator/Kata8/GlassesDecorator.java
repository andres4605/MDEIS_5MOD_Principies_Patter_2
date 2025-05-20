package src.main.java.Decorator.Kata8;

public class GlassesDecorator extends AvatarDecorator {

    public GlassesDecorator(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String customize() {
        return avatar.customize() + ", gafas";
    }
}
