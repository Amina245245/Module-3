package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//AUTO is default generation type.when a strategy is not specified jpa uses auto.
	//genretion type is thestrategy which the jpa should use or follow to generate primary key value.
	//when the underlined database is mysql GenerationType.auto means the jpa will create a hibernate sequence in the database for generation of primary keys.
	
	//Hibernate: select next_val as id_val from hibernate_sequence for update
	//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
	//Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
	private String _id;
	
	
	private String name;
	
	
	private String description;
	
	private BigDecimal price;
	
	private int qty;
	
	
	
	
	

}
