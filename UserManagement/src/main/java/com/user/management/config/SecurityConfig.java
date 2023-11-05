package com.user.management.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {
	
    
	 @Bean
	 public UserDetailsService userDetailsService() {
	        UserDetails userDetails = User.builder().
	                username("Anjali")
	                .password(passwordEncoder().encode("Singh")).roles("Admin").
                build();
      return new InMemoryUserDetailsManager(userDetails);
	    }
	 
	 @Bean
	public BCryptPasswordEncoder passwordEncoder() {
	     return new BCryptPasswordEncoder();
	 }

	 @Bean
		SecurityFilterChain defaultSecurityFilterChain (HttpSecurity http) throws Exception {
	 
			http.authorizeHttpRequests ((requests) ->
			requests.requestMatchers (new AntPathRequestMatcher("/home")).permitAll()
			.anyRequest().authenticated())
	 
			.csrf(csrf -> csrf.disable())
			.httpBasic(withDefaults());
			return http.build();
	 
		}
	
	 
	 

	}

