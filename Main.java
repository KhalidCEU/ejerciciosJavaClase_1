public class Main {
    public static void euclides(int n, int m) {
        if (m == 0) {
            System.out.println("Resultado: " + n);
            return;
        }
        int resto = n % m;
        euclides(m, resto);
    }

    public static void multiplicacionRusa(int multiplicador, int multiplicando) {
        int resultado = 0;

        while (multiplicador != 1) {
            if (multiplicador % 2 != 0) {
                resultado += multiplicando;
                System.out.println("Mi suma es igual a: " + resultado);
            }
            multiplicador /= 2;
            multiplicando *= 2;
        }
        resultado += multiplicando;
        System.out.println("Resultado: " + resultado);

        return;
    }

    public static void triangulo(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Es un triangulo !");
            if (a == b && b == c) {
                System.out.println("De tipo equilatero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("De tipo isosceles.");
            } else {
                System.out.println("De tipo escaleno.");
            }
        } else {
            System.out.println("No es un triangulo !");
        }

        return;
    }

    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Numero de argumentoss incorrecto.");
            System.out.println("Por favor use 'eu' o 'mul' seguido de 2 numeros, o 'tri' seguido de 3 numeros");
            return;
        }
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);

        if (args[0].equals("mul")) {
            multiplicacionRusa(n1, n2);
        } else if (args[0].equals("eu")) {
            euclides(n1, n2);
        } else if (args.length == 4 && args[0].equals("tri")) {
            int n3 = Integer.parseInt(args[3]);
            triangulo(n1, n2, n3);
        } else {
            System.out.println("Numero de argumentoss incorrecto.");
        }
    }
}
