import services.CountriesAPIService;


//CountriesAPI class
public class CountriesAPI {
	public static CountriesAPIService getCountriesAPIService() {
		return new CountriesAPIService("https://restcountries.com/");

	}

}
