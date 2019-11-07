/*
this is where all the user interaction happens
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    boolean agn1 = true;
        Educ1 educ1obj = new Educ1();
        educ1obj.displayWelcomeText();


        //Asking user for the inputs
        Scanner key = new Scanner(System.in);
        System.out.println();

        System.out.println("personal \n");

        System.out.println("enter your name:");
        String namein = key.nextLine();
        System.out.println();
        System.out.println("enter email address:");
        String emailin = key.nextLine();
        System.out.println();

        System.out.println(" now lets take a look at your educational achievements \n");
 // while (agn1) {
      System.out.println("Degree type (Associate's, Bachelor's, Master's, PhD, etc.) :");
      String degreein = key.nextLine();
      System.out.println("major: ");
      String majorin = key.nextLine();
      System.out.println("university name:");
      String univnamein = key.nextLine();
      System.out.println("graduation year:");
      int gradyrin = key.nextInt();


//            ArrayList<Educ1> educ1ArrayList = new ArrayList<>();

//
//            System.out.println(" do you have any other educational achievements? y/n");
//            String ans1 = key.next();
//            if (ans1.equalsIgnoreCase("n")) {
//                agn1 = false;
//                System.out.println("2" + degreein + majorin + univnamein + gradyrin);
//                break;
//            }
//      EducDB.getYNConfirm(key, "Would you like to play again?");


      Educ1 usereduc1 = new Educ1(degreein, majorin, univnamein, gradyrin);
//        Educ1 usereduc2 = new Educ1("BS", "CS", "SMAP", 2012);
      //Educ1 usereduc3 = new Educ1("BS", "Accounting", "SMAP", 2010);


      System.out.println(namein);
      System.out.println(emailin);

      System.out.println();
      System.out.println("education");
      System.out.println(usereduc1.getDegree() + " in " + usereduc1.getMajor());
      System.out.println(usereduc1.getUniv() + ", " + usereduc1.getGradyr());
  }
    }



