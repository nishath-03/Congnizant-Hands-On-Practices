package com.deepskilling.mockito.exercise1;

// Service class
public class MyService {
    private final ExternalApi api;

    // Constructor
    public MyService(ExternalApi api) {
        this.api = api;
    }

    // Fetch data
    public String fetchData() {
        return api.getData();
    }
}
