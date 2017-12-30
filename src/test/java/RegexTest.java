/*
 * Copyright 2017 OBD all rights reserved.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexTest {

    @Test
    public void credentials() {
        // Email.
        assertEquals(true, BRegex.isEmail("space@space.com"));
        assertEquals(true, BRegex.isEmail("space@space.dot.net"));
        assertEquals(true, BRegex.isEmail("space@space.net"));
        assertEquals(true, BRegex.isEmail("other.email-with-dash@example.com"));
        assertEquals(true, BRegex.isEmail("other.email.dash@example.com"));
        assertEquals(true, BRegex.isEmail("other.email-with-dash@example.co.net"));
        assertEquals(true, BRegex.isEmail("space1992@space.net"));

        assertEquals(false, BRegex.isEmail("A@b@c@example.com"));
        assertEquals(false, BRegex.isEmail("Abc.example.com"));
        assertEquals(false, BRegex.isEmail("a\"b(c)d,e:f;g<h>i[j\\k]l@example.com"));
        assertEquals(false, BRegex.isEmail("just\"not\"right@example.com"));
        assertEquals(false, BRegex.isEmail("john..doe@example.com"));
        assertEquals(false, BRegex.isEmail("john.doe@example..com"));
        assertEquals(false, BRegex.isEmail("@domain.com"));
        assertEquals(false, BRegex.isEmail("!@.com"));

        // Username.
        assertEquals(true, BRegex.isUsername("Milan"));
        assertEquals(true, BRegex.isUsername("MilanNz"));
        assertEquals(true, BRegex.isUsername("Milan-Nz"));
        assertEquals(true, BRegex.isUsername("Milan_Nz"));
        assertEquals(true, BRegex.isUsername("Milan.Nz"));
        assertEquals(true, BRegex.isUsername("milannz"));

        assertEquals(false, BRegex.isUsername("Milan*Nz"));
        assertEquals(false, BRegex.isUsername("Milan nz"));

        // Password.
        assertEquals(true, BRegex.isPassword("Y29tLmJvdXRpcX"));
        assertEquals(true, BRegex.isPassword("Y29tLmJvdXRpcX!223*&#"));
        assertEquals(true, BRegex.isPassword("123Mil!@32"));

        assertEquals(false, BRegex.isPassword("123456789"));
        assertEquals(false, BRegex.isPassword("MilanNz"));
        assertEquals(false, BRegex.isPassword("22!S"));
        assertEquals(false, BRegex.isPassword("123"));

        // Name.
        assertEquals(true, BRegex.isName("Milan"));
        assertEquals(true, BRegex.isName("Ena"));

        assertEquals(false, BRegex.isName("122"));

        // Bearer.
        assertEquals(true, BRegex.isAuthorizationBearer("Bearer " +
                "Y29tLmJvdXRpcXVlc3RlYW0uYm91dGlxdWVzOmRhMzlhM2VlNWU2YjAxODkwYWZkODA3MA"));

        // Basic.
        assertEquals(true, BRegex.isAuthorizationBasic("Basic " +
                "Y29tLmJvdXRpcXVlc3RlYW0uYm91dGlxdWVzOmRhMzlhM2VlNWU2YjAxODkwYWZkODA3MA"));

        // Get token.
        String token = BRegex.getToken("Bearer Y29tLmJvdXRpcXVlc3RlYW0uYm91dGlxdWVzOmRhMzlhM2VlNWU2YjAxODkwYWZkODA3MA");
        System.out.println("token: " + token);
        assertEquals("Y29tLmJvdXRpcXVlc3RlYW0uYm91dGlxdWVzOmRhMzlhM2VlNWU2YjAxODkwYWZkODA3MA", token);
    }
}
