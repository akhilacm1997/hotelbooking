package case3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Status {

	String ac;
	String cot;
	String cableConnection;
	String wifi ;
	String Laundry;
	String num1;
	String i;
	static int m=0;
	static int id=0;
  
  
	
	public Status(String num1) throws IOException {
		this.num1=num1;
		int []arr= new int[25];
		 for(int i=0;i<25;i++)
		   {
		   	arr[i]=++i;
		   }
	switch(num1)
	{
	case "1":
	{    
		
	do {
		    System.out.println("Booking");
		    System.out.println("please choose your service required");
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Do you want ac room(please  enter:(ac/nac)");
		    ac = br.readLine();
		    System.out.println("Do you want single or double cot room (please  enter:(single/double)");
			cot=br.readLine();
			System.out.println("Do you want cable connection ?(please  enter:(cable/nocable)");
			cableConnection = br.readLine();
			System.out.println("Do you want wifi connection ?(please  enter:(wifi/no wifi)");
			wifi=br.readLine();
			System.out.println("Do you want any laundry services ?(please  enter:(Laundry/no Laundry)");
			Laundry=br.readLine();
			
	       Services sr = new Services();
	       sr.Services1(ac,cot,cableConnection,wifi,Laundry);
	       System.out.println(ac+"room");
	       System.out.println(cot+"room");
	       System.out.println(cableConnection+"connection enabled");
	       System.out.println(wifi+"connection enabled");
	       System.out.println("with"+Laundry+"services");
	       System.out.println("Do you want to proceed (yes/no)");
	       i=br.readLine();
			}while(i.equalsIgnoreCase("no"));
	        
           arr[m]=++id;
        		   m++;
        		   System.out.println("Thank you for booking. Your room number is "+id);
        	break;	   
	
	}
	case "2":
		
	{
		 System.out.println("enter which room you want?");
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int j= Integer.parseInt(br.readLine());
		 for(int i=0;i<m;i++)
		 {
			 if(arr[i]==j)
			 {
				 System.out.println("Room number "+ j+ " is booked");
		 }
			
		 }
		
		 break;
	}
	case "3":
	{
		System.out.println("exit");
		System.exit(0);
	}
	}
	}

}
