
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestCase {
        
    private String jackson() throws Exception {
        String s = mapper.writeValueAsString(book);
        Long startTime;
        // Jackson
        startTime = System.currentTimeMillis();
        for (int i = 0; i < LOOP_COUNT; i++) {
            book_jackson = com.fasterxml.jackson.databind.ObjectMapper.readValue(s, EpubViewBook.class);
            //s = com.fasterxml.jackson.databind.ObjectMapper.writeValueAsString(epubViewBook);
        }
        System.out.println("Jackson:" + (System.currentTimeMillis() - startTime) + ", " + s.length());
        System.out.println(s);
        return s;
    }
}
