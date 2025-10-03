package edu.susana.segundasemana;
public class MinhaClasse {
    public static void main (String [] args) {
        
        String meuNome = "Susana";
        String meuSobrenome = "Santos";

        String nomeCompleto = nomeCompleto (meuNome, meuSobrenome);

        System.out.println (nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
