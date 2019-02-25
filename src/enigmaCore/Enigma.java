/*
 * Enigma.java
 * Created by Cole Hemp
 * 
 * A java implemenation of the Enigma Machine.
 * The Enigma Machine worked by taking a message and encoding it. It was accomplished by using a handful of components; the keyboard,
 * the plugboard, 3 rotors, and a reflector. 
 * 
 * When a key was pressed on the keyboard it would run through the plugboard, a series of connections where 10 pairs of letters could be assigned
 * to one another (i.e. k becomes g and g becomes k). It would then go from the plugboard to a series of rotors. There are 5 rotors in total, but 
 * only 3 are used at once. It would run through each rotor then go through a reflector in order to run through the rotors again. It will then pass 
 * through the plugboard one more time to give the final letter.
 * Every time a letter went through the rotors, rotor 1 will shift one postion thus changing the travel path of each character. Once rotor 1 makes a 
 * full rotation, rotor 2 will shift one. Then, rotor 3 will shift one after rotor 2 makes a complete rotation.
 * This made it so even two of the same characters could be different letters after encryption and the key to decrypting the message changed with 
 * every message.
 */

package enigmaCore;

import static java.lang.System.out;

public class Enigma {
	//Used to store which rotors are picked for the 3 rotors used.
	int[] rotors = new int[3];
	int[] rotorOneValues = new int[26];
	int[] rotorTwoValues = new int [26];
	int[] rotorThreeValues = new int[26];
	
	public Enigma()
	{
		//Default Constructor for the Enigma.
	}
	
	public Enigma(int rotorOne, int rotorTwo, int rotorThree)
	{
		setRotors(rotorOne, rotorTwo, rotorThree);
	}
	
	//sets all three rotors at once
	public void setRotors (int rotorOne, int rotorTwo, int rotorThree)
	{	
		if(rotorOne != rotorTwo && rotorOne != rotorThree && rotorTwo != rotorThree)
		{
			rotors[0] = rotorOne;
			rotors[1] = rotorTwo;
			rotors[2] = rotorThree;
		}
		else
		{
			out.print("Error!\nA Rotor can't be used twice");
		}
	}
	
	//sets a specific rotor postion to a rotor;
	public void setRotors (int position, int rotor)
	{
		if(rotor != rotors[0] && rotor != rotors [1] && rotor != rotors[2])
		{
			rotors[position] = rotor;
		}
		else
		{
			out.print("Error!\nA Rotor can't be used twice");
		}
	}
}
