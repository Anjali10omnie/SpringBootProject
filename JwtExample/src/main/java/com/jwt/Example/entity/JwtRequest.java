package com.jwt.Example.entity;

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class JwtRequest {
	private String email;
	private String password;

}
