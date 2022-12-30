import java.util.Scanner;

public class keytocrypto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cipher = input.nextLine();
        String key = input.nextLine();
        String message = "";
        for (int i = 0; i < cipher.length(); i++) {
            key += shiftLetter(cipher.charAt(i),letterToNumber(key.charAt(i)));
            message += shiftLetter(cipher.charAt(i),letterToNumber(key.charAt(i)));
        }
        System.out.println(message);
    }
    public static int letterToNumber(char letter){
        return (((int)letter) - ((int)'A'));
    }
    public static char shiftLetter(char letter, int number){
        int newLetter = (int)letter - number;
        if (newLetter < (int)'A'){
            newLetter += 'Z'-'A'+1;
        } else if (newLetter > (int)'Z') {
            newLetter -= 'A'-'Z';
        }
        return (char)newLetter;
    }
}
