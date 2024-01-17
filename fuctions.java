import java.util.Map;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;

public class JacksonTest extends TestCase {

    public void test_0() throws Exception {
        com.fasterxml.jackson.databind.ObjectMapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);

        com.fasterxml.jackson.databind.ObjectMapper.readValue("{a:3}", Map.class);
    }
}
