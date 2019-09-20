package case3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String i;
		String ac;
		String cot;
		String cableConnection;
		String wifi ;
		String Laundry;
		String num1;
		int id =0;
		
		
do {
			
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your details:");
		System.out.println("enter your name");
		name = br.readLine();
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
		Register customer  =new   Register(name,address,contactNumber,email,proofType,proofID);
		System.out.println("Do you want to continue? (yes/no)");
		i=br.readLine();
		System.out.println();// space of another person details
		}
while(i.equalsIgnoreCase("yes"));
       do {
    	   
       
       System.out.println("enter your status(booking :1)(check :2)(exit:3)");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       num1 = br.readLine();
       Status mn = new Status(num1);
       System.out.println("Do you want the  Enter your choice: (yes/no)");
       i=br.readLine();
		}while(i.equalsIgnoreCase("yes"));
       
       
      
	}

}
