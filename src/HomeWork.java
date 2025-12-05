import java.text.SimpleDateFormat;
import java.util.*;

public class HomeWork {
    protected String courseName;
    protected String description;
    protected Date dueDate;

    public HomeWork(String courseName,String description ,Date dueDate){
        this.courseName=courseName;
        this.description=description;
        this.dueDate = dueDate;
    }
    public String getFormattedDueDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM.yyyy HH:mm");
        return sdf.format(dueDate);
    }
    public void printInfo(){
        System.out.println("Course name :"+ courseName);
        System.out.println("Details :" +description);
        System.out.println("Due Date :"+ dueDate);
    }

}
