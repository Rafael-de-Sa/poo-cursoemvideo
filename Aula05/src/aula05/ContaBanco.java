/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Rafael de Sá <rafaeldesa170622@gmail.com>
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    /*abrirConta() - Status: false, Saldo: 0
    fecharConta() - Não pode haver débitos e nem saldo
    depositar()
    sacar() - Conta aberta e saldo
    pagarMensal() - CC: 12.00, CP: 20.00 */
    public void abrirConta(String t) {
        t = t.toUpperCase();
        this.setStatus(true);

        switch (t) {
            case "CC" -> {
                this.setTipo(t);
                this.setSaldo(50);
            }
            case "CP" -> {
                this.setTipo(t);
                this.setSaldo(150);
            }
            default ->
                System.out.println("Tipo Inválido");
        }

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta possui saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta está negativada.");
        } else {
            this.setStatus(false);
            System.out.println("A foi fechada.");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de: " + this.getDono());
        } else {
            System.out.println("Conta fechada.");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta Fechada");
        }
    }

    public void pagarMensal() {
        float valor = 0;

        switch (this.getTipo()) {
            case "CC" -> {
                valor = 12;
            }
            case "CP" -> {
                valor = 20;
            }
            default ->
                System.out.println("Tipo Inválido");
        }

        if (this.isStatus() == true) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente para pagamento mensal");
            }
        } else {
            System.out.println("Conta Fechada.");
        }

    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

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

    public void dados() {
        System.out.println("------------------------------------");
        System.out.println("Numero: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }

}
