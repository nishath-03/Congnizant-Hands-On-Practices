package com.deepskilling.mockito.exercise2;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

// Service test
public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        // Inject mock
        MyService service = new MyService(mockApi);
        
        // Fetch data
        service.fetchData();
        
        // Verify interaction
        verify(mockApi).getData();
    }
}
