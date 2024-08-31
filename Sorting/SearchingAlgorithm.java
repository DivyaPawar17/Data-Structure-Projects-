package Sorting;

import java.util.Scanner;


public class SearchingAlgorithm {
	 int sequential_serach(int a[],int size,int key)
	    {
	        for(int i=0;i<size;i++)
	        {
	            if(a[i]==key)
	            {
	                return i;//found at i
	            }
	        }
	        return -1;//not found hence -1
	    }

	    int binary_serach(int a[],int start,int end,int key)
	    {
	        if(start<=end)//searchable
	        {
	            int mid=(start+end)/2;
	            if(key==a[mid])
	                return mid;
	            else
	            {
	                if(key<a[mid])//left half
	                    return binary_serach(a,start,mid-1,key);
	                else//right half
	                    return binary_serach(a,mid+1,end,key);
	            }

	        }
	        else
	        {
	            return -1;//not found
	        }
	    }

	    public static void main(String args[])
	    {
	        int a[]={12,44,22,66,77,10,89,19},size,key;
	        int a2[]={11,22,33,44,55,66,77,88,99,111};
	        size=a2.length;
	        SearchingAlgorithm obj=new SearchingAlgorithm();
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a key to search:");
	        key=in.nextInt();
	       // int response=obj.sequential_serach(a,size,key);
	        int response=obj.binary_serach(a2,0,a2.length-1,key);
	        if(response==-1)
	            System.out.println(key+" not found in data");
	        else
	            System.out.println(key+" found in data at index "+response);
	    }
	}
