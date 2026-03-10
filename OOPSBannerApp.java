public class OOPSBannerApp {

    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        String[] oPattern = {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };

        String[] pPattern = {
            "***    ",
            "** **  ",
            "**  ** ",
            "**  ** ",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        };

        String[] sPattern = {
            " ***** ",
            "**     ",
            "**     ",
            " ***   ",
            "    ** ",
            "    ** ",
            "    ** ",
            " ***** "
        };

        String[] spacePattern = {
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        };

        characterPatternMap[0] = new CharacterPatternMap('O', oPattern);
        characterPatternMap[1] = new CharacterPatternMap('P', pPattern);
        characterPatternMap[2] = new CharacterPatternMap('S', sPattern);
        characterPatternMap[3] = new CharacterPatternMap(' ', spacePattern);

        return characterPatternMap;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        String[][] patterns = new String[message.length()][];
        for (int i = 0; i < message.length(); i++) {
            patterns[i] = getCharacterPattern(message.charAt(i), charMaps);
        }

        int lines = patterns[0].length;
        for (int line = 0; line < lines; line++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                sb.append(patterns[i][line]);
                sb.append("  ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}