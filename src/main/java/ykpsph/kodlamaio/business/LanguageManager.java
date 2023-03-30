package ykpsph.kodlamaio.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ykpsph.kodlamaio.dataAccess.LanguageRepository;
import ykpsph.kodlamaio.entities.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	private List<Language> languages;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository, List<Language> languages) {
		this.languageRepository = languageRepository;
		this.languages = languages;
	}
	
	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		for(Language l : languages) {
			if(!(l.getName().isEmpty())) {
				if(l.getName().equals(language.getName())) {
					throw new Exception("Name already in use: "+language.getName());
				}
				languageRepository.add(language);
			}
			throw new Exception("Name can't be empty.");
		}
		
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
		
	}

	@Override
	public void update(Language language) {
		languageRepository.update(language);
	}

	@Override
	public void getById(int id) {
		languageRepository.getById(id);
	}
}
