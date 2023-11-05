//package com.user.management.Details;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.user.management.entity.User;
//
//public class CustomUserDetails  implements UserDetails{
////
//	public CustomUserDetails( User user) {
//		super();
//		this.user=user;
//	}
//
//	@Autowired
//	private User user;
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		SimpleGrantedAuthority simpleGrantedAuthority=new SimpleGrantedAuthority(user.getRole());
//		return Arrays.asList(simpleGrantedAuthority);
//	}
//
//	@Override
//	public String getPassword() {
//		
//		return user.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//	
//		return user.getUsername();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
