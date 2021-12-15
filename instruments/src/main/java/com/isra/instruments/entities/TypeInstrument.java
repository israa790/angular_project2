package com.isra.instruments.entities;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TypeInstrument {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idType;
	
	private String nomType;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@PastOrPresent
	private Date dateCreation;
	
	@JsonIgnore
	@OneToMany (mappedBy ="typeInstrument")
	private  List<Instrument> instruments;

	
	
}
