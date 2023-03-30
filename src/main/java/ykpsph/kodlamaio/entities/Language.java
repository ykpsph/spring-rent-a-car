package ykpsph.kodlamaio.entities;

public class Language {
	int Id;
	String name;

	public Language(int Id, String name) {
		this.Id = Id;
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
