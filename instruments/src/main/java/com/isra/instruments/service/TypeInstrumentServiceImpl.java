package com.isra.instruments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isra.instruments.repos.InstrumentRepository;
import com.isra.instruments.entities.Instrument;
import com.isra.instruments.entities.TypeInstrument;
import com.isra.instruments.repos.TypeInstrumentRepository;



@Service
public class TypeInstrumentServiceImpl implements TypeInstrumentService {
	




		@Autowired
	    TypeInstrumentRepository typeInterfaceRep;
		
		@Override
		public TypeInstrument saveType(TypeInstrument p) {
			
			return typeInterfaceRep.save(p); 
		}

		@Override
		public TypeInstrument updateType(TypeInstrument p) {
			return typeInterfaceRep.save(p);
		}

		@Override
		public void deleteType(TypeInstrument p) {
			typeInterfaceRep.delete(p);
			
		}

		@Override
		public void deleteTypeById(Long id) {
			typeInterfaceRep.deleteById(id);
		}

		@Override
		public TypeInstrument getType(Long id) {
		
			return typeInterfaceRep.findById(id).get();
		}

		@Override
		public List<TypeInstrument> getAllTypes() {
		
			return typeInterfaceRep.findAll();
		}

		@Override
		public List<TypeInstrument> listAll(String keyword) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<TypeInstrument> findByNomType(String nom) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<TypeInstrument> findByNomTypeContains(String nom) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<TypeInstrument> findByNomDateCreation(String nom) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<TypeInstrument> findByOrderByNomTypeInstrumentAsc() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<TypeInstrument> trierTypeInstrumentsNoms() {
			// TODO Auto-generated method stub
			return null;
		}

	}
