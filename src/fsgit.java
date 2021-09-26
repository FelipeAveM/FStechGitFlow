public class fsgit {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println(add(1,2));
        System.out.println(subs(1,2));
        System.out.println(mult(1,2));
        System.out.println(div(4,2));
        System.out.println(res(10,3));
        System.out.println("Finish GitFlow");

    }

    public static int add (int a, int b ){
        return a + b;
    }

    public static int subs (int a, int b ){
        return a - b;
    }

    public static int mult (int a, int b){
        return a*b;
    }

    public static double div (int a, int b){
        return a/b;
    }

    public static double res (int a, int b){
        return a%b;
    }

}