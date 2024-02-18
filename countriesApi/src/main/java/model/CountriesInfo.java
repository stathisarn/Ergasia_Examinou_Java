package model;

import java.util.List;

//class CountriesInfo
public class CountriesInfo {
	// class fields
	private String name;
	private String capital;
	private String currency;
	private String language;
	private int population;
	private String continents;

	// constructors
	public CountriesInfo(String name, String capital, String currency, String language, int population,
			String continents) {
		this.name = name;
		this.capital = capital;
		this.currency = currency;
		this.language = language;
		this.population = population;
		this.continents = continents;
	}

	// Getters-Setters

	public String getCommon() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public String getCurrency() {
		return currency;
	}

	public String getLanguage() {
		return language;
	}

	public long getPopulation() {
		return population;
	}

	public String getContinent() {
		return continents;
	}

	// string representation of object
	@Override
	public String toString() {
		return "Info{" + "name='" + name + "'\n" + ", capital='" + capital + "'\n" + ", currency='" + currency + "'\n"
				+ ", language='" + language + "'\n" + ", population='" + population + "'\n" + ", continent='"
				+ continents + "'\n" + '}';
	}
}
