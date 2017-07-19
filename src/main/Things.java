package main;

import java.awt.*;
import java.awt.Color;
import java.util.Collections;

/**
 * Created by Student on 7/18/2017.
 */
public class Things {

    public static void swap(double[][] arr, int a, int b)
    {
       double[] tmp =  arr[b];
       arr[b] =  arr[a];
       arr[a] = tmp;
    }
    public static void swap(boolean[] arr, int a, int b)
    {
        boolean tmp = arr[b];
        arr[b] =  arr[a];
        arr[a] = tmp;
    }

    public static void swap(double[] arr, int a, int b)
    {
        double tmp =  arr[b];
        arr[b] =  arr[a];
        arr[a] = tmp;
    }
    public static void swap(int[][] arr, int a, int b)
    {
        int[] tmp =  arr[b];
        arr[b] =  arr[a];
        arr[a] = tmp;
    }

    public static void swap(java.awt.Color[] arr, int a, int b)
    {
        Color tmp =  arr[b];
        arr[b] =  arr[a];
        arr[a] = tmp;
    }
}
