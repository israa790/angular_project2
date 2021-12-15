package com.isra.instruments.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.isra.instruments.entities.Instrument;
import com.isra.instruments.entities.TypeInstrument;



@RepositoryRestResource(path = "rest")
public interface TypeInstrumentRepository extends JpaRepository<TypeInstrument, Long> {
	
	List<TypeInstrument> findByNomType(String nom);
	List<TypeInstrument> findByIdType(Long keyword);
	 List<TypeInstrument> findByNomTypeContains(String nom); 
	 
	 @Query("select p from TypeInstrument p where p.nomType like %:nom and p.dateCreation > :dateCreation")
	 List<TypeInstrument> findByNomDateCreation (@Param("nom") String nom,@Param("dateCreation") Date dateCreation);
	 
	// @Query("select p from Instrument p where p.typeInstrument = ?1")
	// List<Instrument> findByTypeInstrument (TypeInstrument typeInstrument);
	 
	
	// List<TypeInstrument> findByTypeInstrumentIdType(Long keyword);
	 List<TypeInstrument> findByOrderByNomTypeAsc();
	 
	 @Query("select p from TypeInstrument p order by p.nomType ASC, p.dateCreation DESC")
	 List<TypeInstrument> trierTypeInstrumentsNomsDateCreation ();
	TypeInstrument save(TypeInstrument p);
	void delete(TypeInstrument p);
	

}
