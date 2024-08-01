package exercises;

public class Palindrome {
    public boolean check(String inputString) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            stringBuffer.append(inputString.charAt(i));
        }
        return stringBuffer.toString().equals(inputString);
    }
}
