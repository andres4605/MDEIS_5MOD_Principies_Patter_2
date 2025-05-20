package src.main.java.Decorator.Kata8;

public class AppAvatarDecorator {
    public static void main(String[] args) {
        Avatar avatar = new BasicAvatar();

        avatar = new HatDecorator(avatar);
        avatar = new GlassesDecorator(avatar);
        avatar = new ClothingDecorator(avatar);

        System.out.println(avatar.customize());
    }
}
