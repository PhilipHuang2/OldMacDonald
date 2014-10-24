import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {


//your variable declarations here
Farm myFarm = new Farm();
public void setup()
{
	//your java code here
 	myFarm.rollCall();
}
//declare classes and the interface below
interface Animal
{
	public String getType();
	public String getSound();
}

class Cow implements Animal
{
	protected String getType;
	protected String getSound;
	Cow()
	{
		getType = "Cow";
		getSound = "Moo!!";
	}
	public String getType()
	{
		return getType;
	}
	public String getSound()
	{
		return getSound;
	}
}

class NamedCow extends Cow
{
	protected String cowName;
	NamedCow(String name)
	{
		getType = "NamedCow";
		getSound = "Moo!!";
		cowName = name;
	}

	public String getName()
	{
		return cowName;
	}
}

class Chick implements Animal
{
 	protected String getType;
	protected String getSound;
	Chick()
	{
		getType = "Chicken";
		if(Math.random() < .5f)
		  	getSound = "Cluck!!";
		else 
 	 	 	getSound = "Cheep!!";
	}
	public String getType()
	{
		return getType;
	}
	public String getSound()
	{
		return getSound;
	}
}

class Pig implements Animal
{
	protected String getType;
	protected String getSound;
	Pig()
	{
		getType = "Pig";
		getSound = "Oink!!";
	}
	public String getType()
	{
		return getType;
	}
	public String getSound()
	{
		return getSound;
	}
}

class Farm
{
	private Animal[] myAnimals = new Animal[4];
	Farm()
	{
		myAnimals[0] = new Cow();
		myAnimals[1] = new Chick();
		myAnimals[2] = new Pig();
		myAnimals[3] = new NamedCow("Blissey");
	}

	public void rollCall()
	{
		for(int r = 0; r < myAnimals.length; r++)
		{
			System.out.println("I am a " + myAnimals[r].getType() + " and I go " + myAnimals[r].getSound());
			if( myAnimals[r].getType() == "NamedCow" )
			{
				System.out.println("And my Name is " + ((NamedCow)myAnimals[r]).getName());
			}
		}

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
