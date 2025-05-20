package src.main.java.Decorator.Kata8;

public abstract class AvatarDecorator implements Avatar {
    protected Avatar avatar;

    public AvatarDecorator(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public String customize() {
        return avatar.customize();
    }
}
