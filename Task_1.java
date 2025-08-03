import java.util.*;
public class Task_1
{
	public static void Rcheck(int n,int r,int i,int attempts) {
		System.out.println(attempts-i+" attempts remaining");
		if(r==n) {
			int score=(attempts-(i-1))*10;
			System.out.println("Your guess is correct.");
			System.out.println("Your score:"+score);
		}
		else if(n>r) {
			System.out.println("too high");
		}
		else if(n<r) {
			System.out.println("too low");
		}

	}
	public static void RPrint(int r) {
		System.out.println("You ran out off attempts.");
		System.out.println("The number is "+r);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int numofRounds=0;
		int wonRounds=0;
		String playAgain;
		do {
			int attempts=5;
			int r=rand.nextInt(100)+1;
			boolean guessedCorrectly=false;
			System.out.println("Guss the numbers between 1 to 100.");
			System.out.println("You have "+attempts+" attempts.");
			for(int i=1; i<=attempts; i++) {
				System.out.print("Enter you guess:");
				int n=sc.nextInt();
				sc.nextLine();
				Rcheck(n,r,i,attempts);
				if(n==r) {
					guessedCorrectly=true;
					wonRounds++;
					break;
				}
			}
			if(!guessedCorrectly) {
				RPrint(r);
			}
			System.out.println("Do you want to play again?(yes/no):");
			playAgain=sc.nextLine();
			playAgain=playAgain.toLowerCase();
			numofRounds++;
		}
		while(playAgain.equals("yes"));
		System.out.println("Rounds played:"+numofRounds);
		System.out.println("Rounds won:"+wonRounds);
		System.out.println("Thanks for playing!");
	}
}
