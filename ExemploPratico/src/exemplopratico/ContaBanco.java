/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplopratico;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class ContaBanco {

    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco(int num, String tipo, String dono) {
        setNumConta(num);
        setDono(dono);
        setSaldo(0);
        setStatus(false);
        abrirConta(tipo);
    }

    /*abrirConta() - Status: false, Saldo: 0
    fecharConta() - Não pode haver débitos e nem saldo
    depositar()
    sacar() - Conta aberta e saldo
    pagarMensal() - CC: 12.00, CP: 20.00 */
    public void abrirConta(String t) {
        t = t.toUpperCase();
        setStatus(true);

        switch (t) {
            case "CC" -> {
                setTipo(t);
                setSaldo(50);
            }
            case "CP" -> {
                setTipo(t);
                setSaldo(100);
            }
            default ->
                System.out.println("Tipo Inválido");
        }

    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("A conta possui saldo.");
        }
        if (this.saldo < 0) {
            System.out.println("A conta está negativada.");
        } else {
            System.out.println("A foi fechada.");
            setStatus(false);
        }
    }

    public void depositar(float valor) {
        if (this.isStatus() == true) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Conta fechada.");
        }
    }

    public void sacar(float valor) {
        if (isStatus() == true) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta Fechada");
        }
    }

    public void pagarMensal() {
        float valor = 0;

        switch (getTipo()) {
            case "CC" -> {
                valor = 12;
            }
            case "CP" -> {
                valor = 20;
            }
            default ->
                System.out.println("Tipo Inválido");
        }

        if (isStatus() == true) {
            if (getSaldo() > valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo Insuficiente para pagamento mensal");
            }
        } else {
            System.out.println("Conta Fechada.");
        }

    }

    public void dados() {
        System.out.println("Numero: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }

}
