package enigmaCore.Tests;

import static java.lang.System.out;

import enigmaCore.Rotor;

public class rotorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotor myRotor = new Rotor(1);
		
		int [] rotorValues = myRotor.getRotorValues();
		
		for(int i = 0; i < 26; i++)
		{
			out.print(i+ ","+rotorValues[i]+"\n");
		}
	}

}
