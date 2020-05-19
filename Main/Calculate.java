package Main;

public class Calculate {
    private double a,b;
    private double score;

    public Calculate(double a, double b){
        this.a=a;
        this.b=b;

    }

    public double ADD (){
        score=a+b;
        return score;
    }

    public double SUBTRACT (){
        score=a-b;
        return score;
    }

    public double MULTIPLY (){
        score=a*b;
        return score;
    }

    public String DIVIDE (){
        try {
            score=a/b;
            if(score==Double.NEGATIVE_INFINITY || score==Double.POSITIVE_INFINITY) {
                throw new ArithmeticException();
            }
        }catch(ArithmeticException arithmeticException) {
            return "You divide by zero!" ;
        }


        return String.valueOf(score);
    }

}
