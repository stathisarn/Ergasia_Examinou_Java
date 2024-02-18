package gr_unipi.countriesApp;

import java.util.ArrayList;
import java.util.List;

public class SearchHistory {
    private List<String> history;
    private static final int MAX_HISTORY_SIZE = 5; // Maximum number of search history entries

    public SearchHistory() {
        this.history = new ArrayList<>();
    }

    public void addSearch(String query) {
        // Add the query to the history
        history.add(0, query); // Add at the beginning to maintain order
        // Trim history to maximum size
        if (history.size() > getMaxHistorySize()) {
            history = history.subList(0, getMaxHistorySize());
        }
    }

    public List<String> getSearchHistory() {
        return new ArrayList<>(history); // Return a copy to prevent external modification
    }

    // Getter method for MAX_HISTORY_SIZE
    public static int getMaxHistorySize() {
        return MAX_HISTORY_SIZE;
    }
}
