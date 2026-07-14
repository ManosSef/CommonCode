package me.manossef.commoncode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class MyArrays {
    private MyArrays() {
    }

    public static boolean contains(boolean[] array, boolean value) {
        for(boolean b : array)
            if(b == value)
                return true;
        return false;
    }

    public static boolean contains(byte[] array, byte value) {
        for(byte b : array)
            if(b == value)
                return true;
        return false;
    }

    public static boolean contains(char[] array, char value) {
        for(char c : array)
            if(c == value)
                return true;
        return false;
    }

    public static boolean contains(short[] array, short value) {
        for(short s : array)
            if(s == value)
                return true;
        return false;
    }

    public static boolean contains(int[] array, int value) {
        for(int i : array)
            if(i == value)
                return true;
        return false;
    }

    public static boolean contains(long[] array, long value) {
        for(long l : array)
            if(l == value)
                return true;
        return false;
    }

    public static boolean contains(float[] array, float value) {
        for(float f : array)
            if(f == value)
                return true;
        return false;
    }

    public static boolean contains(double[] array, double value) {
        for(double d : array)
            if(d == value)
                return true;
        return false;
    }

    public static <T> boolean contains(T[] array, T value) {
        for(T t : array)
            if(Objects.equals(t, value))
                return true;
        return false;
    }

    public static boolean[][] deepCopyOf(boolean[][] original) {
        boolean[][] result = new boolean[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static byte[][] deepCopyOf(byte[][] original) {
        byte[][] result = new byte[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static char[][] deepCopyOf(char[][] original) {
        char[][] result = new char[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static short[][] deepCopyOf(short[][] original) {
        short[][] result = new short[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static int[][] deepCopyOf(int[][] original) {
        int[][] result = new int[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static long[][] deepCopyOf(long[][] original) {
        long[][] result = new long[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static float[][] deepCopyOf(float[][] original) {
        float[][] result = new float[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static double[][] deepCopyOf(double[][] original) {
        double[][] result = new double[original.length][];
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static <T> T[][] deepCopyOf(T[][] original) {
        T[][] result = (T[][]) Array.newInstance(original.getClass().getComponentType(), original.length);
        for(int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    public static int indexOf(boolean[] array, boolean toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static int indexOf(byte[] array, byte toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static int indexOf(char[] array, char toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static int indexOf(short[] array, short toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static int indexOf(int[] array, int toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static int indexOf(long[] array, long toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static int indexOf(float[] array, float toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static int indexOf(double[] array, double toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind == array[i])
                return i;
        return -1;
    }

    public static <T> int indexOf(T[] array, T toFind) {
        for(int i = 0; i < array.length; i++)
            if(toFind.equals(array[i]))
                return i;
        return -1;
    }

    public static String join(boolean[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static String join(byte[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static String join(char[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static String join(short[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static String join(int[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static String join(long[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static String join(float[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static String join(double[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static <T> String join(T[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i].toString());
            if(i + 1 < array.length) builder.append(separator);
        }
        return builder.toString();
    }

    public static void reverse(boolean[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void reverse(byte[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void reverse(char[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void reverse(short[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void reverse(int[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void reverse(long[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void reverse(float[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void reverse(double[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static <T> void reverse(T[] array) {
        int length = array.length;
        for(int i = 0; i < length / 2; i++)
            swap(array, i, length - i - 1);
    }

    public static void shuffle(boolean[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void shuffle(byte[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void shuffle(char[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void shuffle(short[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void shuffle(int[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void shuffle(long[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void shuffle(float[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void shuffle(double[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static <T> void shuffle(T[] array) {
        Random rnd = new Random();
        int size = array.length;
        for(int i = size; i > 1; i--) swap(array, i - 1, rnd.nextInt(i));
    }

    public static void swap(boolean[] arr, int i, int j) {
        boolean tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(byte[] arr, int i, int j) {
        byte tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(short[] arr, int i, int j) {
        short tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(long[] arr, int i, int j) {
        long tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(float[] arr, int i, int j) {
        float tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(double[] arr, int i, int j) {
        double tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}