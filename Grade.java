import java.util.*;
public class Grade{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print ("Enter the number of subjects:-");
        int n=sc.nextInt ();
        int Marks[] = new int[n];
        //Input marks from user
        for (int i=0;i<n;i++){
            System.out.print ("Enter the Marks out of 100 in Subject ["+(i+1)+"]:");
            Marks[i]=sc.nextInt ();
            if(i==0){
                System.out.println ("English:"+Marks[i]);
            }else if (i==1) {
                System.out.println ("Maths:"+Marks[i]);
            }else if (i==2) {
                System.out.println ("Chemistry:"+Marks[i]);
            }else if (i==3) {
                System.out.println ("Physics:"+Marks[i]);
            }else if (i==4) {
                System.out.println ("Computer:"+Marks[i]);
            }
        }
         int total=0;
        //Respective Output
        for (int i=0;i<n;i++) {
            total += Marks[i]; //Total marks obtained
        }
        int avg=total/ Marks.length; //Average percentage of total marks obtained
        System.out.println ("Total Marks obtained Out of 500:" + total+"\n Average percentage:"+avg);
        //Grades
        if (90<avg){
            System.out.println ("Grade A obtained");
        } else if (80<avg) {
            System.out.println ("Grade B obtained");
        } else if (70<avg) {
            System.out.println ("Grade C obtained");
        }else if(60<avg) {
            System.out.println ("Grade D obtained");
        }else if(50<avg) {
            System.out.println ("Grade E obtained");
        }
    }
}