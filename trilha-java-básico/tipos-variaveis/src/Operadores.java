public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        // + - / * %
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        System.out.println(resultado);

        // Operadores de Atribuição
        // = += -= *= /= %=
        int numero3 = 10;
        numero3 += 5; // numero3 = numero3 + 5
        System.out.println(numero3);

        // Operadores de Comparação
        // == != > < >= <=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // Operadores Lógicos
        // && || !
        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }

    }
    
}
