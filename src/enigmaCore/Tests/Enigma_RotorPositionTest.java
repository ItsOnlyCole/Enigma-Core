package enigmaCore.Tests;
import static java.lang.System.out;

import enigmaCore.Enigma;

public class Enigma_RotorPositionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rotors = new int[3];
		
		Enigma myEnigma = new Enigma(1,4,3);
		
		out.print("original Rotor locations: ");
		for(int i = 0; i < 3; i++)
		{
			rotors[i] = myEnigma.getRotorNumber(i);
			out.print(rotors[i] +" ");
		}
		
		myEnigma.setRotors(2, 3, 1);
		out.print("\n\nnew Rotor Locations(All Different): ");
		for(int i = 0; i < 3; i++)
		{
			rotors[i] = myEnigma.getRotorNumber(i);
			out.print(rotors[i] +" ");
		}
		
		myEnigma.setRotors(1, 5);
		out.print("\n\nnew Rotor Locations(One Different): ");
		for(int i = 0; i < 3; i++)
		{
			rotors[i] = myEnigma.getRotorNumber(i);
			out.print(rotors[i] +" ");
		}
	}

}
