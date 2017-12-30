# Really basic regex lib.
If you need simple regex expressions like checking username, password, email and etc. this lib might help you. In case you need something more complex take a look at http://jakarta.apache.org/regexp/ or use java.util.regexp package.

## Supported options:
- Email
- Username
- Password
- Name
- Authorization Bearer
- Authorization Basic
- getToken method which returns just token from header.

* If you have something on your mind but it is not supported at the moment, please open issue i'll add it :)

#### Useful link
https://regexr.com/

## How to use it?
It is very easy to use...

```
// Methods return boolean value.
BRegex.isEmail(email);
BRegex.isUsername(username);
BRegex.isPassword(password);
BRegex.isName(name);
BRegex.isAuthorizationBearer(header);
BRegex.isAuthorizationBasic(header);

// Returns string token.
String token = BRegex.getToken(header);
```

## Tests
Yeah there are actually tests :D Take a look at class:
https://github.com/MilanNz/BRegex/blob/master/src/test/java/RegexTest.java

### I drink beer, thanks
Bitcoin: 1JVQnkuKTWA6i4AMXFsksdJgt4B3o1yfgA

## Copyright
Do whatever you want with this code to get things done :) anyway star would be cool...
