package com.isra.instruments.service;

import java.util.List;

import com.isra.instruments.entities.TypeInstrument;
import com.isra.instruments.entities.Instrument;

public interface TypeInstrumentService {

	
		
	
		TypeInstrument saveType(TypeInstrument p);
		TypeInstrument updateType(TypeInstrument p);
		void deleteType(TypeInstrument p);
		void deleteTypeById(Long id);
		TypeInstrument getType(Long id);
		List <TypeInstrument> getAllTypes();
		List<TypeInstrument> listAll(String keyword);
		
		List<TypeInstrument> findByNomType(String nom);
		
		 List<TypeInstrument> findByNomTypeContains(String nom); 
		///on a pas de prix ici
		 List<TypeInstrument> findByNomDateCreation(String nom);
		 
		// List<TypeInstrument> findByTypeInstrument (TypeInstrument typeInstrument);
		 
	//	 List<Instrument> findByTypeInstrumentIdType(Long id);
		 
		 List<TypeInstrument> findByOrderByNomTypeInstrumentAsc();
		 
		 List<TypeInstrument> trierTypeInstrumentsNoms();
	}
