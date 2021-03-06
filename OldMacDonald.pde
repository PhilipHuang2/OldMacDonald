/* I made some modifcation to the assignment since I thought
that this makes more logical sense

First For the Cow, Chick, and Pig I made the constructors
have no varaible since the type and sounds should stay the same
for each instance of the class.

Second instead having a double variable constructor for the chick
sound, I made the two sounds being selected during the constructor instanzation
by Math.random().

Finally for the NamedCow Class I made a 1 variable Constructor since the 
name of the Cow does change per Cow
*/ 
Farm myFarm = new Farm();
void setup()
{
 	myFarm.rollCall();
}

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
		if(Math.random() < .5)
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