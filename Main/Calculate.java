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
            if(b!=0){
                score=a/b;
            }else{
                return "You divide by zero!" ;
            }
            return String.valueOf(score);
    }

}
