
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestCase {
    
    ObjectMapper mapper = new ObjectMapper();    
    
    private String jackson() throws Exception {
        String s = mapper.writeValueAsString(book);
        Long startTime;
        // Jackson
        startTime = System.currentTimeMillis();
        for (int i = 0; i < LOOP_COUNT; i++) {
            book_jackson = mapper.readValue(s, EpubViewBook.class);
            //s = mapper.writeValueAsString(epubViewBook);
        }
        System.out.println("Jackson:" + (System.currentTimeMillis() - startTime) + ", " + s.length());
        System.out.println(s);
        return s;
    }
}
