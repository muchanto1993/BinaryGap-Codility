/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tnc;

/**
 *
 * @author mab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();
        Main m4 = new Main();
        Main m5 = new Main();
        Main m6 = new Main();
        Main m7 = new Main();
        Main m8 = new Main();

        System.out.println("Test No 1 : " + m1.solution(1041));
        System.out.println("Test No 2 : " + m2.solution(15));
        System.out.println("Test No 3 : " + m3.solution(32));
        System.out.println("Test No 4 : " + m3.solution(9));
        System.out.println("Test No 5 : " + m3.solution(529));
        System.out.println("Test No 6 : " + m3.solution(20));
        System.out.println("Test No 7 : " + m3.solution(15));
        System.out.println("Test No 8 : " + m3.solution(32));
    }

    public int solution(int N) {
        //System.out.println("Input : " + N);

        String binary = Integer.toBinaryString(N);
        //System.out.println("Convert to Binary : " + binary);

        int count = 0;
        int tmpCount = 0;
        for (int i = 0; i < binary.length(); i++) {
            //System.out.println("Check  : " + binary.charAt(i));
            //System.out.println("count : " + count);
            //System.out.println("tmpCount : " + tmpCount);
            if (binary.charAt(i) == '0') {
                if ((i > 0) && (binary.charAt(i - 1) == '1')) {
                    tmpCount++;
                } else {
                    if (tmpCount > 0) {
                        tmpCount++;
                    }
                }
            } else if (binary.charAt(i) == '1') {
                if (tmpCount > 0 && tmpCount > count) {
                    count = tmpCount;
                }
                tmpCount = 0;
            }
        }
        return count;
    }

}
