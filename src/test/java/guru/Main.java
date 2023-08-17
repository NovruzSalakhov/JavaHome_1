package guru;

public class Main {
    public static void main(String[] args) {



        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        byte e = 125;
        byte f = 10;
        short g = 32765;
        short h = 10;
        double dbl = 5.0d;

        System.out.println("Математические операции:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("c / a = " + (c / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (b--));
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));


        System.out.println("\nПримеры на переполнение:");
        System.out.println("Результат переполнения byte: " + ((byte) (e + f)));
        System.out.println("Результат переполнения short: " + ((short) (g + h)));


        System.out.println("\nВычисление комбинаций int и double:");
        System.out.println("d + dbl = " + (d + dbl));
        System.out.println("d - dbl = " + (d - dbl));
        System.out.println("d * dbl = " + (d * dbl));
        System.out.println("d / dbl = " + (d / dbl));
        System.out.println("d % dbl = " + (d % dbl));



        boolean
                aa = true,
                bb = true,
                cc = false,
                dd = false;

        System.out.println("\nЛогические операции:");
        System.out.println("aa И bb = " + (aa && bb));
        System.out.println("aa И cc = " + (aa && cc));
        System.out.println("cc И dd = " + (cc && dd));
        System.out.println("aa ИЛИ bb = " + (aa || bb));
        System.out.println("aa ИЛИ cc = " + (aa || cc));
        System.out.println("cc ИЛИ dd = " + (cc || dd));

        System.out.println("\nИспользование логического \"НЕ\"");
        System.out.println("aa И bb = " + !(aa && bb));
        System.out.println("aa И cc = " + !(aa && cc));
        System.out.println("cc И dd = " + !(cc && dd));
        System.out.println("aa ИЛИ bb = " + !(aa || bb));
        System.out.println("aa ИЛИ cc = " + !(aa || cc));
        System.out.println("cc ИЛИ dd = " + !(cc || dd));
    }
}

