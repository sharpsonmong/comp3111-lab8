package Lab8;

import Lab8.Library;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class Library {
	
	public static void main(String arg[]) {
		Library lib = new Library();
		if(!lib.someLibraryMethod()) {
			System.out.println("jjjjj");
		}
	}
	
    public boolean someLibraryMethod() {
        return true;
    }
}
