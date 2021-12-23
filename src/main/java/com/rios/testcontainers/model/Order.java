package com.rios.testcontainers.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Order {
	
	@Id
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "customer_id", nullable=false)
    @EqualsAndHashCode.Exclude
	private Customer customer;
}
