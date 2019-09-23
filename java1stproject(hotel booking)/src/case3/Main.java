package case3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int m1=0;
	static int id =0;
	
	public static void main(String[] args) throws IOException {
	
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String i;
		String num1;
		String i1;
		String arr2[]=new String[25];
		int arr1[]=new int [25];
		String startdate,date;
		BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  starting date of booking");
		startdate =br4.readLine();
		Register customer  =new  Register();
		
do {
			
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your details:");
		System.out.println("enter your name");
		name = br.readLine();
		 arr2[m1]=name;
		System.out.println("enter your address");
		address=br.readLine();
		System.out.println("enter your contactnumber");
		contactNumber = br.readLine();
		System.out.println("enter your emailid");
		email=br.readLine();
		System.out.println("enter your proof name");
		proofType=br.readLine();
		System.out.println("enter your prrofid");
		proofID=br.readLine();
		System.out.println("Enter the  date of booking");
		 date = br4.readLine();
			
		++id;
		 arr1[m1]=id;
		
		 m1++;
		
				customer. Register1(name,address,contactNumber,email,proofType,proofID,id,date);
		System.out.println("Do you want to update your email? (yes/no)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		i1=br1.readLine();
		System.out.println();

		if(i1.equalsIgnoreCase("yes"))
		{
			System.out.println("enter your emailid");
			email=br.readLine();
			System.out.println(email);
			System.out.println(name);
			customer .Register1(name,address,contactNumber,email,proofType,proofID,id,date);
		
        }
   
       do {
    	   
       
       System.out.println("enter your status(booking :1)(check :2)(exit:3)");
      
       num1 = br4.readLine();
       Status mn = new Status(num1,id);
       System.out.println("Do you want the  Enter your choice: (yes/no)");
       i=br4.readLine();
		}while(i.equalsIgnoreCase("yes"));
       System.out.println("Do you want to continue? (yes/no)");
		i=br.readLine();
		System.out.println();// space of another person details
		}
while(i.equalsIgnoreCase("yes"));   
     System.out.println("customer id    name    room number");
	for(int j=0;j<m1;j++)
       {
 	   System.out.println(arr1[j]+    "    " + arr2[j]+"       "+Status.arr[j]);
       }
       System.out.println("Thank you");
       System.out.println("view all bookings");
       System.out.println("Starting date:"+startdate);
       System.out.println("ending date:"+date);
      
	}
	 
}
