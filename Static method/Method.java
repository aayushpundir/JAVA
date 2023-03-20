class Method {
	int a;
	static int b;
	void input(int n) {
		a = n;
		b++;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Method a1 = new Method();
		Method a2 = new Method();
		Method a3 = new Method();
		a1.input(100);
		a1.display();
		a2.input(200);
		a1.display();
		a2.display();
		a3.input(300);
		a1.display();
		a2.display();
		a3.display();
	}
}