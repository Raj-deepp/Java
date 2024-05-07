public class StringOperations {
    public static void main(String[] args) {
        String s1 ="Java";
        String s2 ="Labs";
        String s3 ="[[]]";

        String firstInOrder = (s1.compareTo(s2) < 0) ? s1 : s2;
        System.out.println("Alphabetical order: " + firstInOrder);

        String newString = s3.substring(0, s3.length() / 2) + s2 + s3.substring(s3.length() / 2);
        System.out.println("String with s2 in the middle of s3: " + newString);

        char firstChar = s1.charAt(0);
        char lastChar = s2.charAt(s2.length()-1);
        String newString2 = Character.toUpperCase(firstChar) + String.valueOf(lastChar).toUpperCase();
        System.out.println("New string " +newString2);

        String concatenated = s1+s2;
        int start = (concatenated.length() - 2) / 2;
        for (int i=0; i<=concatenated.length()-2; i++){
            if (start+2<=concatenated.length()){
                System.out.println(concatenated.substring(start, start + 2));
            }
            start++;
        }
    }
}
