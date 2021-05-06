package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon ma tran co bao nhieu hang ???");
        int row = sc.nextInt();
        System.out.println("ban muon ma tran co bao nhieu cot ???");
        int col = sc.nextInt();
        double[][] array = new double[row][col];
        int x = 0;
        int y =0;
        double max = array[x][y];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhap phan tu thu " + i + " " + j + " vao day");
                array[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("phan tu lon nhat la: " + max + "["+x+"]["+y+"]");
    }
}
