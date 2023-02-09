package com.cogent.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Author {
	
	@Id
	int authorId;
	String authorName;
	String authorAddress;
	int authorPhone;
}
