package Sorting;

import java.util.Scanner;

public class SortingAlgorithms {

    void bubble_sort(int a[],int size)
    {
        System.out.println("Bubble sort called:");
        int i,j,temp;//i:passes, j:sort ,temp:swap
        for(i=size-1;i>0;i--)//passes n-1: 5 element need at most 4 passes
        {
            for(j=0;j<i;j++)//to stop at ith
            {
                if(a[j]>a[j+1])
                {
                    //swap
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
    void selection_sort(int a[],int size)
    {
        int min,pos,i,j;
        System.out.println("Selection sort called:");
        for(i=0;i<size-1;i++)//passes
        {
            //reference
            min=a[i]; pos=i;
            for( j=i+1;j<size;j++)//search for min from ith to size-1
            {
                if(a[ j ]<min)//found update
                {
                    min=a[j];pos=j;
                }
            }//j
            a[pos]=a[i];a[i]=min;//swapped min with ith
        }//i
    }
    void insertion_sort(int a[],int size)
    {
        System.out.println("Insertion sort called:");
        int i,j,new_element;
        for (i=0;i<size-1;i++)
        {
            new_element=a[i+1];
            j=i+1;
            while( j>0 && a[ j-1]>new_element)
            {
                a[ j ]= a[j-1];
                j--;
            }
            a[j]=new_element;
        }
    }
    void quick_sort(int a[],int start, int end)
    {
        
        int i,j,pivot,temp;
        i=start;
        j=end;
        pivot=end;
        while (i < j)
        {
            while(a[i]<a[pivot])
                i++;
            while(a[j]>a[pivot])
                j--;
            if(i<j)
            {
                temp=a[i];a[i]=a[j];a[j]=temp;
            }
        }
        if(i<end)
             quick_sort(a,i+1,end);
        if(start<j)
             quick_sort(a,start,j-1);
    }

    void merger(int a[],int start,int mid,int end)
    {
        int i=start,j=mid+1;
        int t[ ]=new int[a.length];
        int ti=start;
        while(i<=mid && j<=end)
        {
            if(a[ i ]<a[ j ])
                t[ti++]=a[ i++ ];
            else
                t[ti++]=a[ j++ ];
        }
        while(i<=mid)
            t[ti++]=a[ i++ ];
        while(j<=end)
            t[ti++]=a[ j++ ];
        for(i=start;i<=end;i++)
            a[ i ]=t [ i ];
    }

    void mergesort(int a[],int start,int end)
    {
        if(start<end)//at most size 1
        {
            int mid=(start+end)/2;
            mergesort(a,start,mid);
            mergesort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }


    void print_Array(int a[])
    {
        System.out.println("Array has:");
        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+" , ");
        }
    }
    public static void main(String args[])
    {
        int a[]={12,44,22,66,77,10,89,19};
        SortingAlgorithms obj=new SortingAlgorithms();
        //obj.bubble_sort(a,a.length);
        //obj.selection_sort(a,a.length);
        //obj.insertion_sort(a,a.length);
        //obj.quick_sort(a,0,a.length-1);
        obj.mergesort(a,0,a.length-1);
        obj.print_Array(a);
    }
}
