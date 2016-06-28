package com.projectname.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class InicioController {


	@RequestMapping("/version")
	public ModelAndView getVersion(){
		return new ModelAndView("version");
	}
	
	@RequestMapping("/prueba")
	public @ResponseBody String prueba2()
	{
		return "OK2";
	}

	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public @ResponseBody	List<String> findAll(){
		List<String> listaPrueba = new ArrayList<String>();
		listaPrueba.add("EStp");
		listaPrueba.add("es");
		listaPrueba.add("una");
		listaPrueba.add("prueba");
		return listaPrueba; 
	}

	@RequestMapping(value = "/llamarServicio", method = RequestMethod.GET)
	public @ResponseBody	List<String> llamarServicioExterno(){

		RestTemplate restTemplate = new RestTemplate();
		//ObjetoTipo[] array = restTemplate.getForObject("Servicio" , ObjetoTipo[].class);
				
		return null;

	}

	
	
	
	
}
