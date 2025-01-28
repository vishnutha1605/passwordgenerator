import java.util.Random;

public class passwordgenerator {

    public static void main(String[] args) {
        String password = generatepassword(12);
        System.out.println(password);

    }

    public static String generatepassword(int length) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = ("!@#$%^&*()");
        String characters = uppercase + lowercase + digits + symbols;

        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

}