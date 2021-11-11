
public class MathUtils {

    public static int factorial(int n) throws IllegalArgumentException

    {
    
    int fac = 1;
    if (n < 0){
        throw new IllegalArgumentException("Negative numbers are invalid");
    }else if(n > 16){
        throw new IllegalArgumentException("Number entered is greater than 16, try a lesser number");
    }

    for (int i=n; i>0; i--){
        fac *= i;
    }
    
    return fac;
    
    }
}
