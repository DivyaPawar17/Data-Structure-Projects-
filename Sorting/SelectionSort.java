package Sorting;

public class SelectionSort {
	
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
	                    temp=a[j]; a[j]=a[j+1];a[j+1]=temp;
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
	        SelectionSort obj=new SelectionSort();
	        //obj.bubble_sort(a,a.length);
	        obj.selection_sort(a,a.length);
	        obj.print_Array(a);
	    }
	}



