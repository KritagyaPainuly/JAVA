import java.*;
class ARRAYSORT{
public static void main(String arr[])
{
int number[]={1,23,31,12,45,432,6,32,5235};
int n=number.length;
for(int i=0;i<n;i++)
System.out.print(number[i]+" ");
for(int i=0;i<n;i++)
for(int j=i;j<n;j++)
if(number[i]>number[j])
{int temp=number[i];
number[i]=number[j];
number[j]=temp;
}
System.out.println();
for(int i=0;i<n;i++)
System.out.print(number[i]+" ");
}
}
