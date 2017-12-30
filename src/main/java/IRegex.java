/**
 * Created by Milan.
 * User: Milan on 12/30/17. 18 : 34
 */
public interface IRegex {
    String EMAIL = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    String USERNAME = "[a-zA-Z0-9._-]+";
    String PASSWORD = "^(?:(?=.*[a-z])(?:(?=.*[A-Z])(?=.*[\\d\\W])|(?=.*\\W)(?=.*\\d))|(?=.*\\W)(?=.*[A-Z])(?=.*\\d)).{8,}$";
    String NAME = "[a-zA-Z]+";
    String TOKEN = "[A-Za-z0-9\\-\\._~\\+\\/]+=*";
    String BEARER = "Bearer " + TOKEN;
    String BASIC = "Basic " + TOKEN;
}