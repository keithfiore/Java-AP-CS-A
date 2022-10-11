/*

public class OutputAstericks {
	public static String ShapeA() {
		int row = 3;
		int column = 6;
		String fin = "";
		for(int i = 0;i<row;i++) {
			for (int v = 0;v<column;v++) {
				fin+="*";
			}
			fin+="\n";
		}
		
		return fin;
	}
	
	public static String ShapeB() {
		int row = 6;
		int column = 3;
		String fin = "";
		for(int i = 0;i<row;i++) {
			if (i == 2 || i == 3) {
				column = 9;
			}else {
				column = 3;
			}
			for (int v = 0;v<column;v++) {
				
				fin+="*";
			}
			fin+="\n";
		}
		
		return fin;
	}
	
	public static String ShapeC() {
		int row = 4;
		int column = 4;
		String fin = "";
		for(int i = 0;i<row;i++) {
			for (int v = 0;v<column;v++) {
				fin+="*";
			}
			column--;
			fin+="\n";
		}
		
		return fin;
	}
	
	 public static void main(String[] args) {
		System.out.println(ShapeA()+"\n");
		System.out.println(ShapeB()+"\n");
		System.out.println(ShapeC());
	}
}
*/