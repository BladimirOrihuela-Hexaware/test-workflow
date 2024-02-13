import java.io.InputStream;
import java.util.Properties;

public class TestMe {
    
    public void printNumber() {
        try {
            Properties appProps = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("app.properties");
            appProps.load(input);
            String qaBuild = appProps.getProperty("qaBuild");
            System.out.print(qaBuild);
        } catch (Exception e) {
            System.out.print(e.getLocalizedMessage());
        }
    }
    

    public static void main(String[] args) {

        TestMe y = new TestMe();
        y.printNumber();

    }

}
