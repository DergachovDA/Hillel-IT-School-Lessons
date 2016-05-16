package homework;

public class UlamSpiral {

    public static void main(String[] args) {

        int r = 3; // радиус матрици
        int l = (r << 1) + 1; // вычисляем длину грани
        int i = 0;
        String[] vector = {"down", "right", "up", "left"};
        int v = 0; // index вектора
        int[][] m = new int[l][l];
        int x = m.length >> 1; // находим центр по горизонтали
        int y = m[x].length >> 1; // находим центр по вертикали

        while (x >= 0 && x < m.length && y >= 0 && y < m[x].length) {
            i++;
            m[x][y] = i;

            switch (vector[v]) {
                case "down":
                    if (m[x][y + 1] == 0) {
                        v = v + 1 < vector.length ? v + 1 : 0;
                        y++;
                    } else x++;
                    break;
                case "right":
                    if (m[x - 1][y] == 0) {
                        v = v + 1 < vector.length ? v + 1 : 0;
                        x--;
                    } else y++;
                    break;
                case "up":
                    if (m[x][y - 1] == 0) {
                        v = v + 1 < vector.length ? v + 1 : 0;
                        y--;
                    } else x--;
                    break;
                case "left":
                    if (m[x + 1][y] == 0) {
                        v = v + 1 < vector.length ? v + 1 : 0;
                        x++;
                    } else y--;
                    break;
            }
        }
        Utils.printArray2(m);
    }

}
