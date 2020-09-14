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
                if (addwhere(inputString, "aa")) return addMommy(inputString, "aa");
                if (addwhere(inputString, "ee")) return addMommy(inputString, "ee");
                if (addwhere(inputString, "ii")) return addMommy(inputString, "ii");
                if (addwhere(inputString, "oo")) return addMommy(inputString, "oo");
                if (addwhere(inputString, "uu")) return addMommy(inputString, "uu");
            }else {
                return inputString;
            }
        }
        return null;
    }

    private boolean addwhere(String inputString, String aa) {
        if (hasContinuous(inputString, aa)) {
            return true;
        }
        return false;
    }

    public static boolean hasContinuous(String inputString, String judgeString) {
        boolean flag = false;
        if (inputString.indexOf(judgeString) != -1) {
            flag = true;
        }
        return flag;
    }
    public static String addMommy(String inputString, String judgeString){
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.insert(inputString.indexOf(judgeString)+1,"mommy");
        return stringBuilder.toString();
    }
}
