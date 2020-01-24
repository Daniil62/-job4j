package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = word.length - 1, j = post.length - 1; j >= 0; --i, --j) {
            if (post[j] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
