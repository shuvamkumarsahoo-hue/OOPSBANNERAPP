/**
 * OOPSBannerApp - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap there by enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */


import java.util.HashMap;

public class OOPSBannerApp {


    public static HashMap<Character, String[]> createCharacterMap() {
    
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "   *** ",
            " **    **",
            "**    **",
            "**    **",
            "**    **",
            "**    **",
            "**    **",
            " **  **",
            "  ***  "
        });

        charMap.put('P', new String[] {
            "   ****** ",
            "* ***",
            "**   **",
            "****** ",
            "**     ",
            "**     ",
            "**     ",
            "  **     ",
            "  **     "
        });

        charMap.put('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " ***  ",
            "   ***",
            "    **",
            "    **",
            "**  **",
            " *****"
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
   
        int patternHeight = charMap.get('O').length;
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  "); 
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}