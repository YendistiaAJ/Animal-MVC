/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yen
 */
public interface ConstantsInterface {

    final int DEAD = 0;
    final int ALIVE = 1;

    // Request Input User
    final String INPUT_NAMA = "Nama hewan:";
    final String INPUT_UMUR = "Umur:";
    final String INPUT_MAKANAN = "Makanan:";
    final String INPUT_GENDER = "Jenis Kelamin:";
    final String INPUT_ALIVE = "Masih hidup? [0 Tidak|1 Ya]:";

    // Print Menu
    final String MAIN_MENU = "Menu"
            + "\n1. Add Animal"
            + "\n2. Print Sound"
            + "\n3. Is Alive"
            + "\n4. Print Data"
            + "\n5. Exit";

    final String MENU_CHOOSE_ANIMAL = "Pilih hewan"
            + "\n1. Cat"
            + "\n2. Dog"
            + "\n3. Duck"
            + "\n4. Horse";

    // Error
    final String ERROR = "Error";
    final String ERROR_INVALID_OPTION = "Pilihan tidak valid!";
}
