/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálás: Béres Délia, 2024-02-27
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public void FileWriter(Koltseg koltseg) {
        try {
            tryFileWriter(koltseg);
        } catch (IOException e) {
            System.err.println("Hiba a fájl létrehozásakor!");
            System.err.println(e.getMessage());
        }
    }

    public void tryFileWriter(Koltseg koltseg) throws IOException {
        FileWriter fw = new FileWriter("adat.txt", true);
        fw.write(koltseg.szallitas.toString() + ":");
        fw.write(koltseg.uzlet.toString() + ":");
        fw.write(koltseg.javitas.toString() + ":");
        fw.close();
    }

}
