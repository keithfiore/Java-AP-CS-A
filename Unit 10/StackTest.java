public class StackTest {
	/**
	 * 
	 */
	public static void test1() {
		System.out.println(“In test 1”);
		test2();
		System.out.println(“In test1 after test2”);
	}
	public static void test2() {
		System.out.println(”In test2”);
		int y = 0;
		int x = 3 / y;
	}
	public static void main(String[] args){ 
		System.out.println(”In main”); 
		test1(); 
	} 
}
