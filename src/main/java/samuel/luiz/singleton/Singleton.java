package samuel.luiz.singleton;

public class Singleton {
    private static Singleton instance;
    public String str;

    private Singleton() {
        str = "My singleton";
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void run() {
        System.out.println("The string of this singleton is: " + str);
    }
}
