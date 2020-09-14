public class GivenString {

    public String convert(String inputString) {
        int vowelsCount = 0;
        final double minVowlsPersent = 0.3;
        for (int i = 0; i < inputString.length(); i++) {
            char everyChar = inputString.charAt(i);
            if (everyChar == 'a' || everyChar == 'e' || everyChar == 'i' || everyChar == 'o' || everyChar == 'u') {
                vowelsCount++;
            }
        }
        double vowlsPercent = (double) vowelsCount / inputString.length();
        if (vowlsPercent < minVowlsPersent) {
            return inputString;
        } else {
            if (hasContinuous(inputString, "aa") || hasContinuous(inputString, "ee") || hasContinuous(inputString, "ii") || hasContinuous(inputString, "oo") || hasContinuous(inputString, "uu")){
                return null;
            }else {
                return inputString;
            }
        }
    }

    public static boolean hasContinuous(String inputString, String judgeString) {
        boolean flag = false;
        if (inputString.indexOf(judgeString) != -1) {
            flag = true;
        }
        return flag;
    }
}
