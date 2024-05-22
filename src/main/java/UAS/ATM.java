/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Indra-PC
 */
public class ATM {
    protected double saldo;

    public ATM(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public double cekSaldo() {
        return this.saldo;
    }

    public void setorTunai(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Setor tunai berhasil. Saldo saat ini: " + this.saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari nol.");
        }
    }

    public void tarikTunai(double jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            System.out.println("Tarik tunai berhasil. Saldo saat ini: " + this.saldo);
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            System.out.println("Jumlah tarik harus lebih dari nol.");
        }
    }
}