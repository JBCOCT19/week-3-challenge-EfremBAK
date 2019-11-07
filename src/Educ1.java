public class Educ1 {

    private String degree;
    private String major;
    private String univ;
    private int gradyr;

    public Educ1() {
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public int getGradyr() {
        return gradyr;
    }

    public void setGradyr(int gradyr) {
        this.gradyr = gradyr;
    }

    public Educ1(String degree, String major, String univ, int gradyr){
        this.degree = degree;
        this.major = major;
        this.univ = univ;
        this.gradyr = gradyr;

    }

    public void displayWelcomeText() {
        System.out.println("Fill the form below");

    }


}
