package com.user.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int userid;
		@NotEmpty
		@Size(min=4,max=15,message="Username must be min of 4 characters ")
		private String Username;
		
		@Column(unique = true)
		@NotEmpty
		@Email(message="Email Address not valid")
		private String email;
		
		@Column(unique=true)
		@NotEmpty
		private String password;

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getUsername() {
			return Username;
		}

		public void setUsername(String username) {
			Username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public User(int userid,
				@NotEmpty @Size(min = 4, max = 15, message = "Username must be min of 4 characters ") String username,
				@NotEmpty @Email(message = "Email Address not valid") String email,
				@NotEmpty @Size(min = 8, max = 16, message = "password must be min of 8 chars and max of 16") String password) {
			this.userid = userid;
			Username = username;
			this.email = email;
			this.password = password;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "User [userid=" + userid + ", Username=" + Username + ", email=" + email + ", password=" + password
					+ "]";
		}
		

	
	

}
