package com.example.coach.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
	private Long id;
	private String username;
	private String password;
	private String email;
	private Integer nbTel;
	private String role;
	private Integer age;
	private Boolean status;
	private Categorie categorie;
	

}
