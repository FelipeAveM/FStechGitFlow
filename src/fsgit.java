public class fsgit {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println(add(1,2));
        System.out.println(subs(1,2));
        System.out.println(div(4,2));

    }

    public static int add (int a, int b ){
        return a + b;
    }

    public static int subs (int a, int b ){
        return a - b;
    }

    public static double div (int a, int b){
        return a/b;
    }
}