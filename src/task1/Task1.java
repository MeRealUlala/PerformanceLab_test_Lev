package task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        List<Integer> resultList = new ArrayList<>();
        int[] nMas = new int[n];
        boolean flag = true;
        int[] mMas = new int[m];

        int i=0;
        while (flag) {
            for (int j = 0; j < m; i++, j++) {
                if (i == n) i = 0;
                nMas[i] = i + 1;
                mMas[j] = nMas[i];
            }
            resultList.add(mMas[0]);
            i--;
            if (mMas[m - 1] == nMas[0]) {
                flag = false;
            }
        }

        for (Integer integer : resultList) {
            System.out.print(integer);
        }
    }
}
