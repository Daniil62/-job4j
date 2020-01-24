package ru.job4j.array;
public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i <= data.length - 1; ++i) {
            int minValue = MinDiapason.findMinIn(data, i, data.length - 1);
            FindLoop findInd = new FindLoop();
            int tempIndex = findInd.indexOf(data, minValue);
            data[tempIndex] = data[i];
            data[i] = minValue;
        }
        return data;
    }
}
