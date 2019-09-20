package case3;

public class Register {
	static int id=0;
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;

	public Register(String name, String address, String contactNumber, String email, String proofType, String proofID) {
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofID=proofID;
		System.out.println("name         :"+name);
		System.out.println("address      :"+address);
		System.out.println("email        :"+email);
		System.out.println("contactNumber:"+contactNumber);
		System.out.println("proofType    :"+proofType);
		System.out.println("proofID      :"+proofID);
		System.out.println("Thankyou for register your id is "+ ++id);
		
		
	}

}
