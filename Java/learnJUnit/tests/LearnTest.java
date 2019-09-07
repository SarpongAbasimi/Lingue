import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LearnTest {
    private Learn book;
    @BeforeEach
    public void createBookInstance(){
        book = new Learn("banana");
    }

    @Test
    @DisplayName("GetBookName: It returns the name of a book")
    public void getBookName(){
        String result = book.getName();
        assertEquals(result, "banana");
    }

    @Test
    @DisplayName("ThrowError: it throws an error when passed an apple")
    public void throwsErrorIfApple(){
        RuntimeException message = assertThrows(RuntimeException.class, () -> {
            book.setName("apple");
        });
        assertTrue(message.getMessage().contains("Apple can't be used"));
    }
}