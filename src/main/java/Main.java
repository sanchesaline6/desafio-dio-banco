public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Aline Sanches");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100.00);
        cc.transferir(cp, 100.00);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
