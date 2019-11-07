import java.util.ArrayList;
import java.util.Scanner;

public class EducDB {

    private ArrayList<Educ1> educ1DB;

    public EducDB() {
    }

    public ArrayList<Educ1> getEduc1DB() {
        return educ1DB;
    }

    public void setEduc1DB(ArrayList<Educ1> educ1DB) {
        this.educ1DB = educ1DB;
    }
    ArrayList<Educ1> newentry= new ArrayList<>();

    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        String choice = "";

        System.out.println(prompt);

        choice = pipe.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }


    }

}
