/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
import java.util.*;
/**
 *
 * @author Admin
 */
public class sqdigits {
    private static Scanner sc;
    public static void main(String[] args)
    {
        sc=new Scanner(System.in);
        int n=sc.nextInt();
        getvalues(n);
    }
    
    public static void getvalues(int n)
    {
        int a=n;
        int rem=0;
        int sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem);
            a=a/10;
        }
        System.out.println(sum);
    }
}
