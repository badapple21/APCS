public class Die {
    private int dice_num;

    public void roll(){
        dice_num =  (int) ((Math.random()*6)+1);
    }

    public int getNumDots(){
        return dice_num;
    }
    public static void main(String[] args){
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
    }
}
