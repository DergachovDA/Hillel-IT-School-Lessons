package ua.in.dergachovda.less07;

import ua.in.dergachovda.Utils;

public class UlamSpiral2 {

    public static void main(String[] args) {
        int r = 3;
        int length = (r << 1) + 1;
        int[][] spiral = new int[length][length];
        fillUlamSpiral(spiral);
        Utils.printArray2(spiral);

    }

    public static void fillUlamSpiral(int[][] m) {

        int n = 0;
        String course = "down";
        int x = m.length >> 1; // находим центр по горизонтали
        int y = m[x].length >> 1; // находим центр по вертикали

        while (x >= 0 && x < m.length && y >= 0 && y < m[x].length) {
            n++;
            m[x][y] = n;

            switch (course) {
                case "down":
                    if (m[x][y + 1] == 0) {
                        course = "right";
                        y++;
                    } else x++;
                    break;
                case "right":
                    if (m[x - 1][y] == 0) {
                        course = "up";
                        x--;
                    } else y++;
                    break;
                case "up":
                    if (m[x][y - 1] == 0) {
                        course = "left";
                        y--;
                    } else x--;
                    break;
                case "left":
                    if (m[x + 1][y] == 0) {
                        course = "down";
                        x++;
                    } else y--;
                    break;
            }
        }
    }

}
