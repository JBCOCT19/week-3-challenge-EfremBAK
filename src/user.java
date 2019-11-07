/*
this is where all the users name, email and other data is stored
 */

import java.util.Arrays;

/*
Requirements


Write a program that will allow a user to enter in:
a name,
an email address,
at least 1 educational achievement:
degree type (Associate's, Bachelor's, Master's, PhD, etc.),
major,
university name,
graduation year,
at least 1 work experience:
company,
job title,
start date,
end date,
at least 1 job description
at least 3 skills:
skill name
rating/proficiency (Fundamental, Novice, Intermediate, Advanced, Expert)


Functionalities
Build as an Object-Oriented Program
The main method of the program should handle all user interaction
The data must be kept in a type of collection (i.e. Arrays, or ArrayList)
Ensure that users have met the minimum amount of items requirements
Make the resume look pretty!
 */ //requirements
public class user {


    private String name;
    private String email;
    private String[] educ;
    private String[] work;
    private String[] skills;

    //default constructor
    public user() {
    }



    //setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getEduc() {
        return educ;
    }

    public void setEduc(String[] educ) {
        this.educ = educ;
    }

    public String[] getWork() {
        return work;
    }

    public void setWork(String[] work) {
        this.work = work;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }


    //overloaded constructor
    public user(String name, String email, String[] educ, String[] work, String[] skills){

        this.name = name;
        this.email = email;
        this.work =work;
        this.educ = educ;
        this.skills = skills;
    }

    public void displayText(){
        System.out.println("Name : " + name + ".  email : " + email + ".   education : "+ Arrays.toString(educ) + ".  work : "+ Arrays.toString(work) + ".  skills : " + Arrays.toString(skills));
    }


}
