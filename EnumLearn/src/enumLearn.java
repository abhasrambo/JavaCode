 enum test{
	IIT,
	GRE,
	TOEFL,
	ILETS
};
public class enumLearn {
public test name;

public enumLearn(test name)
{
	this.name = name;
}
public void testName()
{
	switch (name){
	case IIT:
		System.out.print("You are genius");
		break;
	case GRE:
		System.out.print("You are rich");
		break;
	case TOEFL:
		System.out.print("Good English");
		break;
	case ILETS:
		System.out.print("Euro Trip");
		break;
	default:
		System.out.print("Stay in India");
	}
}
public static void main(String[] args)
{
	enumLearn obj = new enumLearn(test.ILETS);
	obj.testName();
}
}

