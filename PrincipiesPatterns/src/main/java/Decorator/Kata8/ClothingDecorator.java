package src.main.java.Decorator.Kata8;

public class ClothingDecorator extends AvatarDecorator {

    public ClothingDecorator(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String customize() {
        return avatar.customize() + " y ropa personalizada";
    }
}
