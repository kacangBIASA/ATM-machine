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
public class Account extends ATM {
    private String pin;
    private String nama;
    private String noRekening;

    public Account(String nama, String noRekening, String pin, double saldoAwal) {
        super(saldoAwal);
        this.nama = nama;
        this.noRekening = noRekening;
        this.pin = pin;
    }

    public boolean login(String pinInput) {
        return this.pin.equals(pinInput);
    }

    public void ubahPin(String pinLama, String pinBaru) {
        if (this.pin.equals(pinLama)) {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah.");
        } else {
            System.out.println("PIN lama salah.");
        }
    }

    public String getNama() {
        return this.nama;
    }

    public String getNoRekening() {
        return this.noRekening;
    }
}