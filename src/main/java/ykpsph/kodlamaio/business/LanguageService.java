package ykpsph.kodlamaio.business;

import java.util.List;

import ykpsph.kodlamaio.entities.Language;

public interface LanguageService {
	public List<Language> getAll();
	public void add(Language language) throws Exception;
	public void delete(Language language);
	public void update(Language language);
	public void getById(int id);
}
