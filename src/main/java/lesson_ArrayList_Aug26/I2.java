package lesson_ArrayList_Aug26;

import java.util.Arrays;

public class I2 {
    private int[] arr = new int[2];

    public I2(int i1, int i2) {
        this.arr[0] = i1;
        this.arr[1] = i2;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}
