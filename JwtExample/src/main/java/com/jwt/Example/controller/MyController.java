package com.jwt.Example.controller;

import java.security.Principal;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.OncePerRequestFilter;

import com.jwt.Example.Authentication.JwtHelper;
import com.jwt.Example.Repo.UserRepository;
import com.jwt.Example.Service.UserService;
import com.jwt.Example.Service.UserServiceImpl;
import com.jwt.Example.entity.JwtRequest;
import com.jwt.Example.entity.JwtResponse;
import com.jwt.Example.entity.User;

@RestController
@RequestMapping("/auth")
public class MyController {
	
	@Autowired
	private UserServiceImpl userSer;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private AuthenticationManager manager;
	
	@Autowired
	private JwtHelper jwtHelper;
	
	private Logger logger=LoggerFactory.getLogger(MyController.class);	
	
	
	
	
	public MyController(UserServiceImpl userSer, UserDetailsService userDetailsService, AuthenticationManager manager,
			JwtHelper jwtHelper, Logger logger) {
		super();
		this.userSer = userSer;
		this.userDetailsService = userDetailsService;
		this.manager = manager;
		this.jwtHelper = jwtHelper;
		this.logger = logger;
	}

	@GetMapping("/users")
	public List<User> getUser(User user)
	{
		return userSer.getUser();
		
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal)
	{
		return principal.getName();
	}
	
	@PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

        this.doAuthenticate(request.getEmail(), request.getPassword());


        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
        String token = this.jwtHelper.generateToken(userDetails);

        JwtResponse response = JwtResponse.builder()
                .jwtToken(token)
                .username(userDetails.getUsername()).build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
	private void doAuthenticate(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);


        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(" Invalid Username or Password  !!");
        }

    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return "Credentials Invalid !!";
    }
	

}
