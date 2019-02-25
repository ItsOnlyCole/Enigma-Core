/*
 * Rotor.Java
 * Created by Cole Hemp
 * 
 * Used to manage the rotors in enigmaCore
 */
package enigmaCore;

public class Rotor {
	//Which rotor is used
	int rotorNumber;
	//The order of letters stored on the rotor
	int[] rotorValues = new int[26];
	//The current index the rotor is set at *Default is at 0*
	int rotorPosition = 0;
	
	//Default Constructor
	public Rotor() {}
	//Creates one of 5 rotors
	public Rotor(int rotorNumber)
	{
		setRotorNumber(rotorNumber);
		assignRotorValues(rotorNumber);
	}
	//Creates one of 5 rotors a specific position
	public Rotor(int rotorNumber, int rotorPosition)
	{
		setRotorNumber(rotorNumber);
		assignRotorValues(rotorNumber);
		this.rotorPosition = rotorPosition;
	}
	
	/*
	 * Takes the rotor number from the constructor then gets the values of a specific rotor.
	 * 
	 * Values are setup where each rotor contains 2 values for every pair. 
	 * The position in the rotorValues array is the first value.
	 * The value of each position in the array is the second value.
	 * This is done this way to simplify the process of converting one letter to another instead of using a multidimensional array
	 */
	public void assignRotorValues(int rotorNumber)
	{
		switch (rotorNumber)
		{
		case 1:
			int[] rotorOne = {6,24,20,5,11,9,16,14,19,22,23,4,3,15,25,13,0,12,17,7,1,18,10,8,2,21};
			for(int i = 0; i < 26; i++)
			{
				rotorValues[i] = rotorOne[i];
			}
			break;
			
		case 2:
			int[] rotorTwo = {1,7,6,19,16,4,23,5,25,24,17,15,8,12,3,9,10,20,2,13,22,11,18,21,0,14};
			for(int i = 0; i < 26; i++)
			{
				rotorValues[i] = rotorTwo[i];
			}
			break;
			
		case 3:
			int[] rotorThree = {3,18,9,19,14,1,16,10,24,7,20,8,6,11,22,4,21,15,0,12,23,2,5,7,25,13};
			for(int i = 0; i < 26; i++)
			{
				rotorValues[i] = rotorThree[i];
			}
			break;
			
		case 4:
			int[] rotorFour = {20,7,24,15,16,19,18,12,4,10,11,8,17,5,22,1,23,25,13,14,6,9,0,21,2,3};
			for(int i = 0; i < 26; i++)
			{
				rotorValues[i] = rotorFour[i];
			}
			break;
			
		case 5:
			int[] rotorFive = {14,24,20,22,23,2,13,12,15,11,3,10,16,4,5,19,25,18,21,1,8,17,7,9,6,0};
			for(int i = 0; i < 26; i++)
			{
				rotorValues[i] = rotorFive[i];
			}
			break;
		}
	}
	public void setRotorNumber(int rotorNumber)
	{
		if (rotorNumber > 0 && rotorNumber < 6)
		{
			this.rotorNumber = rotorNumber;
			assignRotorValues(rotorNumber);
		}
		else
		{
			java.lang.System.out.print("ERROR!\nCan only select Rotors 1-5\n\n");
		}
	}
	public void setRotorPosition(int rotorPosition)
	{
		this.rotorPosition = rotorPosition;
	}
	
	
	public int[] getRotorValues()
	{		
		return rotorValues;
	}
	public int getRotorNumber()
	{
		return rotorNumber;
	}
	public int getRotorPosition()
	{
		return rotorPosition;
	}
	


	
}
