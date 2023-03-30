package ykpsph.kodlamaio.dataAccess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ykpsph.kodlamaio.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	private List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "C++"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "JavaScript"));
		languages.add(new Language(5, "Go"));
	}


	@Override
	public List<Language> getAll() { // markalar dondurecek
		return languages;
	}


	@Override
	public void add(Language language) {
		languages.add(language);
		
	}


	@Override
	public void delete(Language language) {
		languages.remove(language);
		
	}


	@Override
	public void update(Language language) {
		languages.set(languages.indexOf(language), language);
	}


	@Override
	public Language getById(int id) {
		return languages.get(id);
	}

}
