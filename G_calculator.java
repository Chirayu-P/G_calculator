import java.util.*;
public class G_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter total number of subjects: ");
        int subjects=sc.nextInt();  
        int marks[]=new int[subjects];
        int total_marks=0;
        //For loop to store marks of subjects;
        for(int i=0;i<subjects;i++){
            System.out.println("subject "+(i+1)+": ");
             marks[i]=sc.nextInt();
             total_marks+=marks[i];
        }
        //calculating average;
        double average=total_marks/subjects;

        System.out.println("Total Marks: "+total_marks);
        System.out.println("Average: "+average);

        //grade calculation based on average marks;
        if (average>=85) {
            System.out.println("A++ Grade!");
        }
        else if(average>=75){
            System.out.println("A Grade!");
        }
        else if(average>=65){
            System.out.println("B Grade!");
        }
        else if (average>=45) {
            System.out.println("C Grade!");
        }
        else{
            System.out.println("D Grade!");
        }

        
    }
}
