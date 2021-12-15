package com.isra.instruments.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/*import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Instrument {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Long idInstrument;
	
	//@NotNull
	//@Size (min = 4,max = 20)
	private String nomInstrument;
	
	//@Min(value = 10)
	 //@Max(value = 10000)
	private Double prixInstrument;
	
	@ManyToOne
    private TypeInstrument typeInstrument;
	
	
	
	
}
