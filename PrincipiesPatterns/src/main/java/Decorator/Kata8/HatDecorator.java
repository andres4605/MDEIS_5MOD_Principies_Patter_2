package src.main.java.Decorator.Kata8;

public class HatDecorator extends AvatarDecorator {

    public HatDecorator(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String customize() {
        return avatar.customize() + " con sombrero";
    }
}
