public class Ex1TestScript {
	
	public static void main(String[] args) {
		Ex1TestScript test = new Ex1TestScript();
		test.launch();
	}
	
	private void launch() {
		Ex1 myDirectory = new Ex1Impl();
		myDirectory.printFiles();
	}
}