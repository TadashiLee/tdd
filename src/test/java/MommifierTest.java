import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void given_a_string_length_which_vowels_is_lower_than_30_persent(){
        //Given
        GivenString givenString = new GivenString();
        String inputString = "axxxx";
        //when
        String result = givenString.convert(inputString);
        //Then
        assertEquals("axxxx",result);
    }
}
