/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.Scanner;
/**
 *
 * @author Indra-PC
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat akun baru
        Account account = new Account("John Doe", "123456789", "1234", 1000000);

        System.out.println("Selamat datang, " + account.getNama() + "!");

        // Login
        System.out.print("Masukkan PIN: ");
        String pin = scanner.nextLine();

        if (account.login(pin)) {
            System.out.println("Login berhasil!");

            boolean keluar = false;
            while (!keluar) {
                System.out.println("\nPilih menu:");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Ubah PIN");
                System.out.println("5. Keluar");
                System.out.print("Pilihan: ");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo Anda: " + account.cekSaldo());
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah setor: ");
                        double setor = scanner.nextDouble();
                        account.setorTunai(setor);
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah tarik: ");
                        double tarik = scanner.nextDouble();
                        account.tarikTunai(tarik);
                        break;
                    case 4:
                        scanner.nextLine();  // consume newline
                        System.out.print("Masukkan PIN lama: ");
                        String pinLama = scanner.nextLine();
                        System.out.print("Masukkan PIN baru: ");
                        String pinBaru = scanner.nextLine();
                        account.ubahPin(pinLama, pinBaru);
                        break;
                    case 5:
                        keluar = true;
                        System.out.println("Terima kasih telah menggunakan ATM kami.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        } else {
            System.out.println("PIN salah.");
        }

        scanner.close();
    }
}