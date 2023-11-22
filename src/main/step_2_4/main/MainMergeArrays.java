package main.step_2_4.main;

public class MainMergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {

        if (a1.length == 0) {
            return a2;
        }

        if (a2.length == 0) {
            return a1;
        }

        int arrayResultLength = a1.length + a2.length;
        int[] arrayResult = new int[arrayResultLength];

        int i = 0, j = 0, k = 0;
        boolean flag1 = true, flag2 = true;


        do {

            if (flag1 == true && flag2 == true) {
                if (a1[i] <= a2[j]) {
                    arrayResult[k] = a1[i];
                    k++;
                    i++;
                    if (i == a1.length) {
                        flag1 = false;
                    }
                }
            } else if (flag1 == true && flag2 == false) {
                arrayResult[k] = a1[i];
                k++;
                i++;
                if (i == a1.length) {
                    flag1 = false;
                }
            }

            if (flag1 == true && flag2 == true) {
                if (a1[i] > a2[j]) {
                    arrayResult[k] = a2[j];
                    k++;
                    j++;
                    if (j == a2.length) {
                        flag2 = false;
                    }
                }
            } else if (flag1 == false && flag2 == true) {
                arrayResult[k] = a2[j];
                k++;
                j++;
                if (j == a2.length) {
                    flag2 = false;
                }
            }

        } while (k < arrayResultLength);

        return arrayResult;
    }
}
