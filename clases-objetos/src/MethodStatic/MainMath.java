package MethodStatic;

public class MainMath {
    public static void main(String[] args) {
        int result = MathExample.add(2, 2);
        System.out.println(result);

        MathExample mathExample = new MathExample();
        result = mathExample.subtract(4, 2);
        System.out.println(result);
    }
}
