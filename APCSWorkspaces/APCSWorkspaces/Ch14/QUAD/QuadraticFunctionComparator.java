public class QuadraticFunctionComparator {
    private double x;

    QuadraticFunctionComparator() {
        this.x = 0.0;
    }

    QuadraticFunctionComparator(double x) {
        this.x = x;
    }

    public int compare(QuadraticFunction q1, QuadraticFunction q2){
        if(q1.valueAt(x)>q2.valueAt(x)){
            return 1;
        }else if(q1.valueAt(x)<q2.valueAt(x)){
            return -1;
        }
        else{
            return 0;
        }
    }
}
