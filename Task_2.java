import java.util.*;
public class Task_2
{
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of subjects:");
		int subjects=sc.nextInt();
		int[] marks=new int[subjects];
		int totalMarks=0;
		System.out.println("Enter marks between 0 and 100.");
		for(int i=0;i<subjects;i++){
		    System.out.print("Enter marks of Subject-"+(i+1)+":");
		    marks[i]=sc.nextInt();
		    if(marks[i]<0 || marks[i]>100){
		        System.out.println("Invalid marks entered.Please enter marks between 0 and 100.");
		        i--;
		        continue;
		    }
		    totalMarks+=marks[i];
		}
		double averagePercentage=(double) totalMarks/subjects;
		
		String grade;
		if(averagePercentage>=90){
		    grade="O";
		}
		else if(averagePercentage>=80){
		    grade="A";
		}
		else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("---Results---");
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average percentage:"+averagePercentage+"%");
        System.out.println("Grade:"+grade);
	}
}
