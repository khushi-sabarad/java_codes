//Program to implement different string operations
class StringOperations 
{
	public static void main(String[] args) 
	{
		String str1 = "Java";
		String str2 = "Programming Lab";
		
		//Length operation
		System.out.println("Length of string: " + str1.length());
	
		//Concatenation operation
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));

		//Convert to LowerCase operation
		System.out.println("Convert to LowerCase: " + str1.toLowerCase());

		//Convert to UpperCase operation
		System.out.println("Convert to UpperCase: " + str2.toUpperCase());

		//Contain operation
		System.out.println("Contains sequence 'gram': " + str2.contains("gram"));

		//charAt operation
		System.out.println("Character at position 5: " + str2.charAt(5));

		//Indexof operation
		System.out.println("Index of character 'n': " + str2.indexOf('n'));

		//EndsWith operation
		System.out.println("EndsWith character 'a': " + str1.endsWith("a"));

		//Compare to operation
		System.out.println("Compare To 'JAVA': " + str1.compareTo("JAVA"));

		//Compare to - Ignore case
		System.out.println("Compare To 'JAVA' - Case Ignored: " + str1.compareToIgnoreCase("JAVA"));

		//Replace operation
		System.out.println("Replace 'Lab' with 'Class': " + str2.replace("Lab", "Class"));
	}
}
	
