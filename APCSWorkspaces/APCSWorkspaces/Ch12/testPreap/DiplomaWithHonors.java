public class DiplomaWithHonors extends Diploma{
    DiplomaWithHonors(String name, String major){
        super(name, major);
    }

    public String toString(){
        return super.toString + "\n*** with honors ***";
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
