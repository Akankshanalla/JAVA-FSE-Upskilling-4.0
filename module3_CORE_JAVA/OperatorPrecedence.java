public class OperatorPrecedence {
    public static void main(String[] a){
        int r=10+5*2;
        System.out.println("10+5*2 = "+r);
        System.out.println("Here Multiplication happens before Addition as Multiplication has higher Operator Precedence than Addition.");
        int x=(10+5)*2;
        System.out.println("(10+5)*2 = "+x);
        System.out.println("Here Parenthesis has highest Operator Precedence.");
    }
}