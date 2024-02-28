/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálás: Béres Délia, 2024-02-27
 */

import java.util.Scanner;

public class MainConsole extends Koltseg {

    private Scanner scanner;

    public MainConsole() {
        drawHeader();
        try (Scanner scanner = new Scanner(System.in)) {
            this.scanner = scanner;
            input();
        }

        Koltseg koltseg = new Koltseg(szallitas, uzlet, javitas);

        FileHandler fh = new FileHandler();
        fh.FileWriter(koltseg);

    }

    private void drawHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    private void input() {
        szallitas = Double.parseDouble(inputConsole("Szállítási költség: "));
        uzlet = Double.parseDouble(inputConsole("Üzleti költség: "));
        javitas = Double.parseDouble(inputConsole("Javítási költség: "));
    }

    private String inputConsole(String message) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(message);
        String data = scanner.nextLine();
        return data;

    }
}
