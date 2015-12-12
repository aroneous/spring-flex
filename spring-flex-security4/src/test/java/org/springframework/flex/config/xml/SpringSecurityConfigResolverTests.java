package org.springframework.flex.config.xml;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SpringSecurityConfigResolverTests {

    /**
     * Ensure that, if SpringSecurity4ConfigHelper is on the classpath, it's used in preference to
     * SpringSecurity3ConfigHelper.
     */
    @Test
    public void testResolveSpringSecurity4ConfigHelper() {
        SpringSecurityConfigHelper configHelper = SpringSecurityConfigResolver.resolve();
        
        assertTrue(configHelper instanceof SpringSecurity4ConfigHelper);
    }
}
