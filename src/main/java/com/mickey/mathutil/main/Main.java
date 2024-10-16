package com.mickey.mathutil.main;

import com.mickey.mathutil.core.MathUtility;


public class  Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnsWell();
        System.out.println("0!: " + MathUtility.getFactorial(0));
    }
    // TA SẼ TEST HÀM CỦA TA VIẾT RA, GỌI LÀ UNIT TESTING - TEST NHỮNG ĐƠN VỊ CƠ BẢN NHẤT
    // TA CẦN TƯST HÀM GETFACTORIAL() VỚI CÁC BỘ DATA ĐƯA VÀO -> NHỮNG TSST CASE
    // TEST CASE LÀ GÌ?: LÀ NHỮNG BỘ DATA ĐƯA VÀO HÀM, APP, CÀ CÁCH THỨC XÀI BỘ DATA NÀY, VÀ KÈM THEO KẾT QUẢ KÌ VINGJ APP/HÀM SẼ TRẢ


    // TEST CASE #1
    //DESCRIPTION: (MÔ TẢ MỤC ĐÍCH TEST CASE, TEST CASE DÙNG TEST ĐIỀU GÌ?)
    //              TO CHECK, TO VERIFY THE getfactorial() METHOD WITH CORRECT GIVEN ARGUMENT, E.G N = 0
    //              VIÉTUB: KIỂM TRA HÀM GIAI THỪA CÓ ĐÚNG VỚI N = 0 HAY KO?
    // STEP/PROCEDURES: (CÁC BƯỚC TEST HÀM/APP, NHẤN GÌ, NHẬP GÌ...)
    // CALL GETFACTORIAL() METHOD WITH VALID ARG: GETFACTORIAL(0)

    // EXPECTED RESULT (TA HY VỌNG HÀM TRẢ VỀ GÌ VỚI N = 0)
    //          TO HAVE NAMBER 1 AS THE RESULT OF 0!
    //          VIETSUB: HY VỌNG HÀM TRẢ VỀ 2 VỚI O!

    //STATUS (TRANG THAI CUA TEST CASE LA GI SAU KHI CHAY APP CHAY HAM)
    //          PASS/FAILED  (BUG)
    // CHO XEM HAM, APP XU LY DC SO MAY - ACTUAL VALUE VA DI SO SANH VOI EXPECTED Ở TRÊN ĐỂ LUẬN ĐÚNG SAI!!!!

    // VIẾT CDE TEST ĐỂ TEST HÀM CHÍNH GETFACTORIAL() CHẠY ĐÚNG VỚI N = 0 HAY KHÔNG

    static void testFactorialGivenRightArgument0ReturnsWell(){
        int n = 0;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(0);

        // so sánh:
        System.out.println(n + "! = \n"
                           + "expected valued: " + expectedResult
                           + "actual valued : " +  actualResult );

    }
}
