import model.Kotic;
public class Application {
    public static void main(String[] args) {
        Kotic cat = new Kotic(10, "Cat One", 10, "Meow", 5);
        Kotic cat2 = new Kotic();
        cat2.setKotic(11, "Cat Two", 11, "Meow2", 0);

        System.out.println(cat.getMeow().equals(cat2.getMeow()));
        cat.liveAnotherDay();
        System.out.println(Kotic.getCount());
    }
}
