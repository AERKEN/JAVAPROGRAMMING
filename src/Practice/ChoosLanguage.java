package Practice;

public class ChoosLanguage {
    public static void main(String[] args) {
        int selection =4;
        String language="";

        if (selection == 1) {
            language = "Hello, thank you for your call";
        } else if (selection == 2) {
            language = "Hola, gracias para lamar";
        } else if (selection == 3) {
            language = "Merhaba, aradiginiz icin tesekkurler";
        } else if (selection == 4) {
            language = "Privet, spasibo za vash zvonok";
        } else {
            language = "Merci, pour votre appel";

        }System.out.println(language);

    }
}
