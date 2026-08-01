public class Utils {
    public static String spaceFiller(String text, int max_character) {
        int spaceNeeded = max_character - text.length();
        return text + " ".repeat(Math.max(0, spaceNeeded));
    }
}