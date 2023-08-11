
    import java.util.Scanner;
    import java.util.Locale;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        //TO DO: Cohecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pela Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numeroAgencia;
        String numeroConta;
        String nomeCliente;
        Double saldoConta;

        System.out.println("Por favor, digite o número da agência: ");

        numeroAgencia = sc.nextInt();

        System.out.println("Por favor, digite o número da conta: ");

        numeroConta = sc.next();
        
        System.out.println("Por favor, digite seu primeiro e último nome: ");

        sc.nextLine();
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta: ");

        saldoConta = sc.nextDouble();

        System.out.printf("Olá %s" + ", obrigado por criar uma conta em nosso banco, sua agência é %d" +
                          ", conta %s" + " e seu saldo R$ %.2f" + " já está disponível para saque."
                           , nomeCliente, numeroAgencia, numeroConta,saldoConta);
                           
        sc.close();

    }
}


