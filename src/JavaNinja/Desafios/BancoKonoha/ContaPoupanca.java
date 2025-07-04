package JavaNinja.Desafios.BancoKonoha;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxaDeRendimento = valor * 0.02;
        saldo += valor + taxaDeRendimento;
    }

    @Override
    public void sacar(double valor) {
        if(saldo < valor){
            System.out.println("Saldo insuficiente para saque");
            consultarSaldo();
        }else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("O saldo atual da sua conta poupança é ''de : R$ %.2f%n", saldo);
    }
}
