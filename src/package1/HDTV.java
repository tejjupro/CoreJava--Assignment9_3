package package1;     //This java file is inside package named package1 inside src folder.


public class HDTV implements Comparable<HDTV>    //Class declaration which is implementing Comparable interface to compare two objects based on property.
{
	String brandName;        //Declaring String object to Store the brand name.
	int size;            //int variable to store the size.
	
	public HDTV(String brandName,int size)       //Constructor.
	{
		//Initializing Class variables by parameters passed into constructor.
		this.brandName=brandName;
		this.size=size;
	}

	@Override
	public int compareTo(HDTV passedObject)     //compareTo function which is abstract method of Comparable interface. 
	{
		//Conditional Statements to compare objects based on their size.
		if(this.size<passedObject.size)
			return -1;
		else if(this.size>passedObject.size)
			return 1;
		return 0;
	}
	
}   //End of class.
