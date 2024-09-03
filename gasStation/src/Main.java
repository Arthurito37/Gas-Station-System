import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] gasName = {"Gasolina", "Gasolina Aditivada", "Etanol", "Diesel", "GNV"}; //recebe o nome dos combustiveis
        final double [] gasPrice = new double [6]; //recebe o preço dos combustiveis
        gasPrice [0] = 6.50; //ARMAZENA O PREÇO DA GASOLINA
        gasPrice [1] = 6.80; //ARMAZENA O PREÇO DA GASOLINA ADITIVADA
        gasPrice [2] = 4.30; //ARMAZENA O PREÇO DA ETANOL
        gasPrice [3] = 5.00; //ARMAZENA O PREÇO DO DIESEL
        gasPrice [4] = 5.26; //ARMAZENA O PREÇO DO GN
        System.out.println("Deseja CPF na nota?");
        String CPF = scanner.nextLine().trim().toLowerCase();
        boolean valorCPF = CPF.equals("sim");
        if (valorCPF){
            System.out.println("Digite o CPF:");
            CPF = scanner.nextLine();
        } else {

        }
        



    }
}
