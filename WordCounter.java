import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Remplacez ce chemin par le chemin absolu de votre fichier texte
        File file = new File("sample.txt"); 

        int totalWords = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                if (!line.isEmpty()) {
                    // Séparer par un ou plusieurs espaces
                    String[] words = line.split("\\s+");
                    totalWords += words.length;
                }
            }

            scanner.close();
            System.out.println("Nombre total de mots dans le fichier : " + totalWords);
        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable : " + file.getAbsolutePath());
        }
    }
}
