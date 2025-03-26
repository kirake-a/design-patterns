import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class Demo {
    public static void main(String[] args) throws Exception {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        return new Application(factory);
    }
}
