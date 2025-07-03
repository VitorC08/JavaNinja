package JavaNinja.Desafios.BancoKonoha;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxaDeDeposito = valor * 0.01;
        saldo += valor - taxaDeDeposito;
    }

    @Override
    public void sacar(double valorDoSaque) {
        if(saldo < valorDoSaque){
            System.out.println("Saldo insuficiente para saque");
            consultarSaldo();
        }else {
            saldo -= valorDoSaque;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("O saldo atual da sua conta corrente Ã© de : R$ %.2f%n", saldo);
    }
}