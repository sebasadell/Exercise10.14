import java.io.*;

public class Main {
    public static void main(String[] args) {
        int characters = 0;
        int lines = 0;
        int words = 0;
        try (BufferedReader in = new BufferedReader(new FileReader("carta.txt"))){
            String text = in.readLine();
            while(text != null){
                String[] substrings = text.split(" ");
                words += substrings.length;
                for (int i = 0; i < substrings.length; i++){
                    for (int j = 0; j < substrings[i].length(); j++){
                        characters++;
                    }
                }
                lines++;
                text = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("Characters: " + characters + "\nLines: " + lines + "\nWords: " + words);
    }
}