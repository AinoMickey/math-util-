package com.mickey.mathutil.core;

public class MathUtility {
    // class nay cung cap cac ham tien ich cho moi nowi su dung
    // tien ich cho moi noi dung => thuong thiet ke la static

    //ham tinh n!
    // < 0! va 21! ko tinh, 20! vua du kieu long
    // 0! va 21! ta se nem ra ngoai le
    public static long getFactorial (int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n n must be between 0! and 20!");

        if (n == 0 || n == 1)
            return 1;
        // song sot den day n dang = 2, 3, 4,... 20

        long result = 1; // tich ban dau bang 1
        for (int i = 2; i <= n ; i++) {
            result*=i; // nhan don vao ket qua

        }
        return result;
    }
}
