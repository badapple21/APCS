public class day {
    public String day_of_week(int num) {
        
        String day = "";


        switch (num) {
            case 0:
                day =  "Sunday";
                break;
            case 1:
                day =  "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Friday";
                break;
            default:
                day = "Non";
            
            return day;
            
            
        }
    }
    public static void main(String[] Args){
        System.out.println(day_of_week(2));
    }

}
