/*An election is contested by 5 candiades the candiades are numbered 1 to 5 and the voting is done by marking the candiadate in number on paper write a [program to read the paper and count the votes cast for each candiadtes using array variable count in case a number read is outside the range 1 to 5 paper should consider as spoilt paper and the program should also count the number of spoilt paper*/ 
import java.util.*;

class task4{
public static void main(String arrg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of Voters");
int n=sc.nextInt();
int arr[]=new int[6];
for(int i=0;i<n;i++){
System.out.println("1 BJP 2 AAP 3 ICP 4 BAA 5 UKD");
int op=sc.nextInt();
if(op==1)
arr[0]++;
else if(op==2)
arr[1]++;
else if(op==3)
arr[2]++;
else if(op==4)
arr[3]++;
else if(op==5)
arr[4]++;
else
arr[5]++;
}
System.out.println("BJP total Vote :- "+arr[0]);
System.out.println("AAP total Vote :- "+arr[1]);
System.out.println("ICP total Vote :- "+arr[2]);
System.out.println("BAA total Vote :- "+arr[3]);
System.out.println("UKD total Vote :- "+arr[4]);
System.out.println("NOTA total Vote :- "+arr[5]);
}
} 
