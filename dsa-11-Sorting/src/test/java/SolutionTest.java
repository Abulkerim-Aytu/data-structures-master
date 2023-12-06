import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SolutionTest {

    @InjectMocks
    private Solution solution;

    @Test
    public void is_palindrome_true(){
//        Given
        String str =  "A man, a plan, a canal: Panama";
//        When
        boolean result = solution.isPalindrome(str);
//        Then
        assertTrue(result);
    }

    @Test
    public void is_palindrome_false(){
//        Given
        String str =  "hen A man, a plan, a canal: Panama";
//        When
        boolean result = solution.isPalindrome(str);
//        Then
        assertFalse(result);
    }
}
