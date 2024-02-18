package model;
import services.CountriesAPIService;

public class CountriesAPI {
	public static CountriesAPIService getCountriesAPIService() {
		return new CountriesAPIService("https://restcountries.com/");

	}

}
