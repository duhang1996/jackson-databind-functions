
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;

public class RedisConfig{

    private void objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enableDefaultTyping();
    }
}
