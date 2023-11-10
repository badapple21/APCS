public class loops {
    public static int max(int x, int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    
    public static int max3(int x, int y, int z){
        return max(max(x, y), y);
    }


}
