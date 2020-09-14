public class GivenString {

    public String convert(String inputString) {
        int vowelsCount = 0;
        final double minVowlsPersent = 0.3;
        double vowlsPercent = vowelsCount / inputString.length();
        for (int i = 0; i < inputString.length(); i++) {
            char everyChar = inputString.charAt(i);
            if (everyChar == 'a' || everyChar == 'e' || everyChar == 'i' || everyChar == 'o' || everyChar == 'u') {
                vowelsCount++;
            }
        }
        if (vowlsPercent < minVowlsPersent){
            return inputString;
        }
        return null;
    }
}
