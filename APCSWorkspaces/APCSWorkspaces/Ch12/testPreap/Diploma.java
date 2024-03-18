public class Diploma{
    private String name, major;
    Diploma(String name, String major){
        this.name = name;
        this.major = major;
    }

    public String toString(){
        return "This certifies that " + name + "\nhas completed a MOOC in " + major
    }

    
}