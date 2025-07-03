package JavaNinja.Desafios.BancoKonoha;

public interface Conta {
    void consultarSaldo();
    void depositar(double valor);
    void sacar(double valor);
}