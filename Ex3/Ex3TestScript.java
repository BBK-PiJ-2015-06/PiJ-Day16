public class Ex3TestScript {
	
	public static void main(String[] args) {
		Ex3TestScript launcher = new Ex3TestScript();
		launcher.launch();
	}
	
	private void launch() {
		Ex3 test = new Ex3Impl();
		System.out.print("Name of file to be found: ");
		String name = System.console().readLine();
		test.showContents(name);
	}
}