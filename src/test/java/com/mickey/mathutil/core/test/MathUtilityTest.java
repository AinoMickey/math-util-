package com.mickey.mathutil.core.test;

import com.mickey.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //TEST CASE STRUCTURE: ID, DESCRIPTION, STEP/PROCEDURE
    //                     EXPECTED RESULT, STATUS (PASSED, FAILED)
    //                     BUG ID (BUGZILLA, JIRA)

    // Test case #4: check getFactorial() with n = -1 -2 -3 -4 -5 -6 22 23 24 25 26
    @Test
    public void testFactorialGivenWrongArgumentsThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(21);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(22);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(50);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(100);});

    }

    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        //MathUtility.getFactorial(-5); Chưa bắt xem có ngoại lệ hay ko


        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});
    }// thấy ngoại lệ mừng rơi nước mắt
     // vì hàm thiết kế rằng đưa n < 0 hoặc n > 20 thì ngoại lệ phải đc ném ra
     //vậy nếu hàm ném ngoiaj lệ khi n = -5 rõ ràng hàm đúng, hàm đúng thì phải xanh
     // xanh vì trả về ngoại lệ đúng như kì vọng

    //Test case #3 (gộp): check getFactorial() with = 2 3 4 5 6 ....
    @Test
    public void testFactorialGivenRightArgumentsReturnWell() {
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));

    }  //bad smell = đoạn code bốc mùi (Robert C. Martin - Clean Code)
       //code bị lặp lại, lộn xộn test data và lệnh kiểm thử
       //ta cần tinh chỉnh, tối ưu code - REFACTOR, REFACTORING

    //Test case #2: check getFactorial() with n = 1
    @Test
    public void testFactorialGivenRightArgument1ReturnWell(){
        assertEquals(1, MathUtility.getFactorial(1));
    }


    //TEST CASE #1: CHECK getFactorial with n = 0
    //...

    @Test
    public void getFactorialGivenRightArgument0ReturnWell() {
        long expectedValue = 1; //hi vong 0! ra 1
        long actualValue = MathUtility.getFactorial(1);

        //so sanh 2 thang expected va actual
        assertEquals(expectedValue,actualValue);
    }


}