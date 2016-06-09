package com.java.utils.usage;

import com.java.courses.utils.Utils;
import org.joda.time.DateTime;

public class UtilsTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Utils utils = new Utils();
        utils.printArray(array);

        DateTime dateTime = new DateTime();
        int day = dateTime.getDayOfMonth();
        System.out.println(day);
    }



}
