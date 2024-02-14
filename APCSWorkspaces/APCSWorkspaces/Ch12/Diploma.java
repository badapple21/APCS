
public class Diploma {
    private String Name, Degree;

    public Diploma(String Name, String Degree) {
        this.Name = Name;
        this.Degree = Degree;
    }

    public String toString() {
        return "This certifies that " + Name + "\nhas completed a MOOC in " + Degree;
    }

    public String getName() {
        return Name;
    }

    public String getDegree() {
        return Degree;
    }

    public static void main(String[] args) {
        Diploma diploma1 = new Diploma("Adam smith", "Gardening");
        System.out.println(diploma1);
        System.out.println();

        Diploma diploma2 = new DiplomaWithHonors("Betsy Smith", "Robotics");
        System.out.println(diploma2);
        System.out.println();
    }
}
