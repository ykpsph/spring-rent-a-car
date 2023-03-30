package ykpsph.kodlamaio.dataAccess;

import java.util.List;

import org.springframework.stereotype.Repository;

import ykpsph.kodlamaio.entities.Language;

@Repository
public interface LanguageRepository {
	public List<Language> getAll();
	public void add(Language language);
	public void delete(Language language);
	public void update(Language language);
	public Language getById(int id);
}
