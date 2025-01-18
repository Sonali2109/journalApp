package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import static org.mockito.Mockito.*;
import static org.springframework.security.core.userdetails.User.builder;

@SpringBootTest
public class UserDetailsServiceImplTests {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @MockBean
    private UserRepository userRepository;

    @Disabled
    @Test
    public void loadUserByUserNameTest() {
       // when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().username("Harry").password("sdfggh").build());
        UserDetails user = userDetailsService.loadUserByUsername("Harry");
        Assertions.assertNotNull(user);
    }

}
