package case3;

public class Register {
	 int id;
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	String date;

	public void Register1(String name, String address, String contactNumber, String email, String proofType, String proofID,int id,String date) {
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofID=proofID;
		this.date=date;
		System.out.println("name         :"+name);
		System.out.println("address      :"+address);
		System.out.println("email        :"+email);
		System.out.println("contactNumber:"+contactNumber);
		System.out.println("proofType    :"+proofType);
		System.out.println("proofID      :"+proofID);
		System.out.println("Thankyou for register your id is "+ id);
		System.out.println("name         :"+date);
		
		
	}

}
