package reflection;

public class GetClassInformation {

	public static void main(String[] args)
	{
		Class classObj = GetClassInformation.class;
		
		// func to get class name including package
		System.out.println("classname--"+classObj.getClass());
		
		// func to get class name excluding package
		
		System.out.println("simplified classname--"+classObj.getSimpleName());
		
	}
}
