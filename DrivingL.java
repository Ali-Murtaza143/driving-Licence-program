import java.util.*;
	public class DrivingL {
	    public static void main(String[] args) {
	        Scanner Input= new Scanner (System.in);
	        System.out.println("Enter your age");
	        int age= Input.nextInt();
	        if(age>=18) {
	        	System.out.println("Do you posses learner's license? Type 1 if you posses, else type any onther number");
	            int number=Input.nextInt();
	            if(number==1) {
	                System.out.println("Since how much time have you got your learner's license? Type no of months");
	                int month=Input.nextInt();
	                if(month>2)
	                    System.out.println("You are eligible for license");
	                else
	                    System.out.println("You are not eligible for license");
	            }
	            else {
	                System.out.println("You should have learner's license to apply for license");
	            }
	        }
	        else
	            System.out.println("Sorry, you wouldn't be awarded with license. You are under age");}}