package mypackage;

public class Boolean{
	public static void main (String [] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Numbers entered: " + args[0] + "," + args[1]);
		System.out.println ("(Relational operator > ): ");
		if (x > y){
			System.out.println("Is " + x + " greater than " + y + ": true");
		}else {
			System.out.println("Is " + x + " greater than " + y + ": false");
			}
		System.out.println ("(Relational operator < ): ");
		if (x < y){
			System.out.println("Is " + x + " less than " + y + ": true");
		}else {
			System.out.println("Is " + x + " less than " + y + ": false");
			}
		System.out.println ("(Relational operator >= ): ");
		if (x >= y){
			System.out.println("Is " + x + " greater than or equal to " + y + ": true");
		}else {
			System.out.println("Is " + x + " greater than or equal to " + y + ": false");
			}
		System.out.println ("(Relational operator <= ): ");
		if (x <= y){
			System.out.println("Is " + x + " less than or equal to " + y + ": true");
		}else {
			System.out.println("Is " + x + " less than or equal to " + y + ": false");
			}
		System.out.println ("(Relational operator == ): ");
		if (x == y){
			System.out.println("Is " + x + " equal to " + y + ": true");
		}else {
			System.out.println("Is " + x + " equal to " + y + ": false");
			}
		System.out.println ("(Relational operator != ): ");
		if (x != y){
			System.out.println("Is " + x + " not equal to " + y + ": true");
		}else {
			System.out.println("Is " + x + " not equal to " + y + ": false");
			}
	}

}