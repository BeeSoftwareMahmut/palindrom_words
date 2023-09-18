import java.util.Scanner;

public class App {

    // Bir kelimenin palindrom olup olmadığını kontrol eden metod
    public static boolean isPalindrom(String kelime) {
        // Gelen kelimeyi küçük harflere çevirin ve boşlukları kaldırın
        kelime = kelime.toLowerCase().replaceAll("\\s+", "");
        
        int uzunluk = kelime.length();
        
        // Kelimenin başından ve sonundan başlayarak karakterleri karşılaştırın
        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - i - 1)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();
        
        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindrom kelime.");
        } else {
            System.out.println(kelime + " bir palindrom kelime değil.");
        }
    }
    
  
}
