import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

    public boolean strongPasswordCheckerII(String password) {
        final String regex = "^(?!.*(.)\\1)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()+-]).{8,}$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}