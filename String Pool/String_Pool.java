class String_Pool {
	public static void main(String[] args) {
		String s1 = "Amit";
		String s2 = "Amit";
		String s3 = "Kapil";
		String s4 = new String("Amit");
		
		System.out.println(s1 == s2);  // True is given.
		System.out.println(s1 == s3);  // False is given.
		System.out.println(s1 == s4);	 // False is given.
	}
}
// In this code the objects of the String class s1 and s2 are pointing to the same memory location in the String pool while
// the String object s4 is not in the String pool, it is in the heap memory because it is allocated by using the new function.

class Equals_function {
	public static void main(String[] args) {
		String s1 = "ajay";
		String s2 = "ajay";
		String s3 = new String("ajay");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}

class Compare_to {
	public static void main(String[] args) {
		String s1 = "ayush";
		String s2 = "rai";
		String s3 = "ayush";

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s1));
	}
}