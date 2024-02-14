import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestMe {
    
    public String printNumber() {
        try {
            InputStream input = getClass().getResourceAsStream("/qaBuild.txt");
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(input))){
                String line;
                if((line = reader.readLine()) != null) {
                    return line;
                }else {
                   throw new Exception("qaBuild.txt is empty"); 
                }
            }
        } catch (Exception e) {
            return "Error";
        }
    }
    

    public static void main(String[] args) {

        TestMe x = new TestMe();
        System.out.println(x.printNumber());

    }

}
