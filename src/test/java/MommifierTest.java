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

    @Test
    void given_a_string_lenth_which_vowls_is_more_than_30_persent_but_has_not_continuous(){
        //Given
        GivenString givenString = new GivenString();
        String inputString = "apple";
        //when
        String result = givenString.convert(inputString);
        //Then
        assertEquals("apple",result);
    }

    @Test
    void given_a_string_lenth_which_vowls_is_more_than_30_persent_and_has_1_continuous(){
        //Given
        GivenString givenString = new GivenString();
        String inputString = "tree";
        //when
        String result = givenString.convert(inputString);
        //Then
        assertEquals("tremommye",result);
    }

    @Test
    void given_a_string_lenth_which_vowls_is_more_than_30_persent_and_has_more_than_1_continuous(){
        //Given
        GivenString givenString = new GivenString();
        String inputString = "treee";
        //when
        String result = givenString.convert(inputString);
        //Then
        assertEquals("tremommyemommye",result);
    }

    @Test
    void given_an_empty_string(){
        //Given
        GivenString givenString = new GivenString();
        String inputString = "";
        //when
        String result = givenString.convert(inputString);
        //Then
        assertEquals("",result);
    }
}
