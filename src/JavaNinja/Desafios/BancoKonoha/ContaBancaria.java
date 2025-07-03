package JavaNinja.Desafios.BancoKonoha;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public abstract void depositar(double valor);

    @Override
    public abstract void sacar(double valor);

    @Override
    public abstract void consultarSaldo();
}
