import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Milan.
 * User: Milan on 12/30/17. 18 : 34
 */
public class BRegex implements IRegex {

    /**
     * Checks if provided string is valid email.
     * 99% cases are covered.
     */
    public static boolean isEmail(String email) {
        return email.matches(EMAIL);
    }

    /**
     * Checks if provided string is valid username.
     */
    public static boolean isUsername(String username) {
        return username.matches(USERNAME);
    }

    /**
     * Checks if provided string is valid password.
     */
    public static boolean isPassword(String password) {
        return password.matches(PASSWORD);
    }

    /**
     * Checks if provided string is valid name.
     */
    public static boolean isName(String name) {
        return name.matches(NAME);
    }

    /**
     * Checks if provided string is valid authorization bearer.
     */
    public static boolean isAuthorizationBearer(String header) {
        return header.matches(BEARER);
    }

    /**
     * Checks if provided string is valid authorization basic.
     */
    public static boolean isAuthorizationBasic(String header) {
        return header.matches(BASIC);
    }

    /**
     * Gets token from authorization header.
     * Format: Basic token or Bearer token.
     */
    public static String getToken(String header) {
        if (isAuthorizationBasic(header) || isAuthorizationBearer(header)) {
            Matcher matcher = Pattern.compile(TOKEN).matcher(header);
            matcher.matches();
            return matcher.find() ? matcher.group() : null;
        }
        return null;
    }
}
