import java.util.Calendar;
import java.util.Date;
public class TestHomework {
    static void main(String[] args){
       Date now = new Date();
        HomeWork h1 =new HomeWork("SENG211","slide about arrays",now);
        h1.printInfo();

        Calendar cal = Calendar.getInstance();
        cal.set(2025,Calendar.DECEMBER,10,23,59);
        Date deadLine =cal.getTime();

        HomeWork h2= new HomeWork("CENG 201","bst",deadLine);
        h2.printInfo();

    }
}
