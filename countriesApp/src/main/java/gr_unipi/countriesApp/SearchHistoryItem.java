package gr_unipi.countriesApp; // Assuming this is your package name

public class SearchHistoryItem {
    private final String query;
    private final String type;

    public SearchHistoryItem(String query, String type) {
        this.query = query;
        this.type = type;
    }

    public String getQuery() {
        return query;
    }

    public String getType() {
        return type;
    }
}
