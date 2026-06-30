package com.deepskilling.mockito.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

// Service test
public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");
        
        // Inject mock
        MyService service = new MyService(mockApi);
        
        // Fetch data
        String result = service.fetchData();
        
        // Assert data
        assertEquals("Mock Data", result);
    }
}
