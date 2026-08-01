public class Utils {
    public static String spaceFiller(String text, int max_character) {
        int spaceNeeded = max_character - text.length();
        String result = text;
        for (int i = 0; i < spaceNeeded; i++) {
            result += " ";
        }
        return result;
    }
}