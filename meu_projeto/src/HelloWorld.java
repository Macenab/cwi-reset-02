public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Fala rapazeada");

        int valor = 3;
        System.out.println(valor + " multiplicado por " + (valor*2) + " é igual a " + (valor*6) + ".");

        int dividendo = 6;
        int divisor = 3;
        System.out.println("O resto da divisão de "+ dividendo + " por "
                + divisor + " é " + (dividendo%divisor) + ".");

        int a = 6;
        int b = 3;
        boolean resultado = a > b;
        System.out.println(a + " é maior que " + b + "? " + resultado);
    }
}

