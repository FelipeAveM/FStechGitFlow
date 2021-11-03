public class fsgit {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println(integerAddition(1,2));
        System.out.println(integerSubstraction(1,2));
        System.out.println(integerMultiplication(1,2));
        System.out.println(integerDivision(4,2));
        System.out.println(integerResidue(10,3));
        System.out.println("Finish GitFlow");

    }

    public static int integerAddition(int a, int b ){
        return a + b;
    }

    public static int integerSubstraction(int a, int b ){
        return a - b;
    }

    public static int integerMultiplication(int a, int b){
        return a*b;
    }

    public static double integerDivision(int a, int b){
        return a/b;
    }

    public static double integerResidue(int a, int b){
        return a%b;
    }

}