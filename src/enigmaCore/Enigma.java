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
	Rotor[] rotors = new Rotor[3];
	
	//Default Constructor for Enigma
	public Enigma() {}
	
	//Constructor for Enigma with Rotor Postions
	public Enigma(int[] rotors)
	{
		setRotors(rotors[0], rotors[1], rotors[2]);
	}
	
	
	//sets all three rotors at once
	public void setRotors (int[] rotors)
	{	
		if(rotors[0] != rotors[1] && rotors[0] != rotors[2] && rotors[1] != rotors[2])
		{
			this.rotors[0] = new Rotor(rotors[0]);
			this.rotors[1] = new Rotor(rotors[1]);
			this.rotors[2] = new Rotor(rotors[2]);
		}
		else
		{
			out.print("Error!\nA Rotor can't be used twice");
		}
	}
	//sets a specific rotor to a rotor location
	public void setRotors (int location, int rotor)
	{
		if(rotor != rotors[0].getRotorNumber() && rotor != rotors[1].getRotorNumber() && rotor != rotors[2].getRotorNumber())
		{
			rotors[location] = null;
			rotors[location] = new Rotor(rotor);
		}
		else
		{
			out.print("Error!\nA Rotor can't be used twice");
		}
	}
	//Sets a specific rotor to a rotor location along with setting it's position
	public void setRotors (int location, int rotor, int position)
	{
		if(rotor != rotors[0].getRotorNumber() && rotor != rotors[1].getRotorNumber() && rotor != rotors[2].getRotorNumber())
		{
			rotors[location] = null;
			rotors[location] = new Rotor(rotor);
			rotors[location].setRotorPosition(position);
		}
		else
		{
			out.print("Error!\nA Rotor can't be used twice");
		}
	}
	//Sets the postion for all rotors
	public void setRotorPosition(int positionOne, int positionTwo, int positionThree)
	{
		rotors[0].rotorPosition = positionOne;
		rotors[1].rotorPosition = positionTwo;
		rotors[2].rotorPosition = positionThree;
	}
	//Sets the position ofr a specific rotor
	public void setRotorPosition(int location, int position)
	{
		rotors[location].rotorPosition = position;
	}
	
	public int getRotorNumber (int location)
	{
		return rotors[location].getRotorNumber();
	}
	public int[] getRotorValues (int location)
	{
		return rotors[location].getRotorValues();
	}
	public int getRotorPosition (int location)
	{
		return rotors[location].getRotorPosition();
	}
	
}
