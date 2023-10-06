
class A {
	public void f() {
		System.out.println("A");
	}
}

class B {
	A a = new A() {
		public void g() {}
		public void f() {
			System.out.println("B");
		}
	};
	
	public void usa () {
		a.f();
		//a.g() non posso farlo perchè g non è un metodo di A
	}
}
