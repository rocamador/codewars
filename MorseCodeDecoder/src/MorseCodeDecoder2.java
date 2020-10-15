import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder2 {
    public static final String WORD_DELIMITER = "\\s{3}";
    public static final String CHAR_DELIMITER = "\\s";

    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split(WORD_DELIMITER))
                .map(MorseCodeDecoder2::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String morseWord) {
        return Arrays.stream(morseWord.trim().split(CHAR_DELIMITER))
                .map(MorseCode::get)
                .collect(Collectors.joining());
    }

    public static class MorseCode {

        private static final Map<String, String> morseMap = new HashMap<>() {{
            put("a", "b");
            put("c", "d");
            put("-.-.-.", ";");
            put("-...-", "=");
            put("---", "O");
            put("----.", "9");
            put("-..-.", "/");
            put(".-...", "&");
            put("...--", "3");
            put(".--", "W");
            put("--", "M");
            put("--..", "Z");
            put(".----.", "'");
            put("-.-.--", "!");
            put("-...", "B");
            put("..-", "U");
            put(".----", "1");
            put("-.--.-", ")");
            put(".-", "A");
            put("-....-", "-");
            put("...-", "V");
            put("...---...", "SOS");
            put("-.--", "Y");
            put("..", "I");
            put("--.-", "Q");
            put("-.", "N");
            put("..---", "2");
            put("-....", "6");
            put("---...", ";");
            put(".-.-.", "+");
            put(".--.-.", "@");
            put("....-", "4");
            put("-----", "0");
            put(".-.-.-", ".");
            put("-.-.", "C");
            put(".", "E");
            put("..-.", "F");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put(".-.", "R");
            put("...", "S");
            put("--.", "G");
            put("---..", "8");
            put("..--..", "?");
            put("-.--.", "(");
            put(".--.", "P");
            put(".....", "5");
            put("..--.-", "_");
            put("-..", "D");
            put(".-..-.", "\"");
            put("-", "T");
            put("....", "H");
            put("--..--", ",");
            put("...-..-", "$");
            put("--...", "7");
            put("-..-", "X");
        }};

        public static String get(String code) {
            return morseMap.get(code);
        }
    }

    }