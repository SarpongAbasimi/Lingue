import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LearnTest {
    private Learn book;
    @BeforeEach
    public void createBookInstance(){
        book = new Learn("banana");
    }

    @Test
    public void getBookName(){
        String result = book.getName();
        assertEquals(result, "banana");
    }

    @Test
    public void throwsErrorIfApple(){
        RuntimeException message = assertThrows(RuntimeException.class, () -> {
            book.setName("apple");
        });
        assertTrue(message.getMessage().contains("Apple can't be used"));
    }
}