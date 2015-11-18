public class Ex2TestScript {
	
	public static void main(String[] args) {
		Ex2TestScript launcher = new Ex2TestScript();
		launcher.launch();
	}
	
	private void launch() {
		Ex2 test = new Ex2Impl();
		System.out.print("Provide name for new directory: ");
		String name = System.console().readLine();
		test.createDirectory(name);
	}
	
}
	