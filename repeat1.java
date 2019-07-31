/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Admin
 */
public class repeat1 {
    void showrepeat(int arr[],int size)
    {
    int i,j;
    System.out.println("repeated elements are:");
    for(i=0;i<size;i++)
    {
        for(j=i+1;j<size;j++)
        {
            if (arr[i] == arr[j])
                System.out.println(arr[i] + " ");
        }
    }
    }
    
    public static void main(String[] args)
    {
    repeat1 repeat=new repeat1();
    int arr[]={1,2,2,3,4,4};
    int arr_size=arr.length;
    repeat.showrepeat(arr,arr_size);
    }
}
