public class Person 
{
   public static void main(String[] args) 
   {
       Person p1 = new Person("Mary", "Boole");
       Person p2 = new Person("George", "Boole");
       Person p3 = new Person("Ada", "Lovelace");

       System.out.println(p1.compareTo(p3));
       System.out.println(p1.compareTo(p2));
   }  
}