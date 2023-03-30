package ykpsph.kodlamaio.webAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ykpsph.kodlamaio.business.LanguageService;
import ykpsph.kodlamaio.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;
	
	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}
	
	@GetMapping("/delete")
	public void delete(Language language) {
		languageService.delete(language);
	}
	
	@GetMapping("/update")
	public void update(Language language) {
		languageService.update(language);
	}
	
	@GetMapping("/getById")
	public void getById(int id) {
		languageService.getById(id);
	}
	
}
