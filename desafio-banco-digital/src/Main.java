import main.java.Banco;
import main.java.Cliente;
import main.java.ContaCorrente;
import main.java.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco.iniciarBanco();

        Cliente jurandir = new Cliente("Jurandir", "123");

        ContaCorrente contaCorrente1 = new ContaCorrente(jurandir);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(jurandir);

        Banco.adicionarConta(contaCorrente1);
        Banco.adicionarConta(contaPoupanca1);
        Banco.listarContas();


    }
}