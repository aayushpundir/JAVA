class Array_Of_Objects {
	String name = "Ayush";
	int roll = 13;
	int age = 19;
	static int i = 0;
	void show() {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(age);
		System.out.println(i + "th Student");
		System.out.println(" ");
		i = i + 1;
	}
	
	public static void main(String[] args) {
		Array_Of_Objects arr[] = new Array_Of_Objects[10];
		for(int i = 0; i < 10; i++) {
			arr[i].show();
		}
	}
}	