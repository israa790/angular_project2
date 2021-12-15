package com.isra.instruments.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isra.instruments.entities.Instrument;
import com.isra.instruments.entities.TypeInstrument;
import com.isra.instruments.service.InstrumentService;
import com.isra.instruments.service.TypeInstrumentService;

@RestController
@RequestMapping("/api/type")
@CrossOrigin
public class TypeInstrumentRESTControllers {

	@Autowired
	TypeInstrumentService typeInstrumentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<TypeInstrument> getAllInstruments() {
		
	return typeInstrumentService.getAllTypes();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public TypeInstrument getTypeById(@PathVariable("id") Long id) {
		
	return typeInstrumentService.getType(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public TypeInstrument createType(@RequestBody TypeInstrument typeInstrument) {
		
	return typeInstrumentService.saveType(typeInstrument);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public TypeInstrument updateType(@RequestBody TypeInstrument typeInstrument) {
	return typeInstrumentService.updateType(typeInstrument);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteType(@PathVariable("id") Long id)
	{
		typeInstrumentService.deleteTypeById(id);
	}
	
	@RequestMapping(value="/instrsType/{nomType}",method = RequestMethod.GET)
	public List<TypeInstrument> getTypesByTypeId(@PathVariable("nomType") String nomType) {
		
	return typeInstrumentService.findByNomType(nomType);
	}
	
	
}