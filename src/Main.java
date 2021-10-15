public class Main {

	public static void main(String[] args) {
		
		System.out.println("Affiche le fichier à l’endroit :");
		File file1 = new File("text/test.txt");
		System.out.println(file1.write());
		
		System.out.println("Affiche le fichier à l’envers sur l’écran en terme de lignes :");
		Reverse file2 = new Reverse("text/test.txt");
		System.out.println(file2.write());
		
		System.out.println("Affiche le fichier de manière palindromique :");
		Palindrome file3 = new Palindrome("text/test.txt");
		System.out.println(file3.write());
		
		System.out.println("Comparateur de fichiers");
		
		File file4 = new File("text/test.txt");
		File file5 = new File("text/test.txt");
		File file6 = new File("text/test2.txt");
		
		Compare test = new Compare();
		test.compare(file4, file5);
		
		System.out.println("Comparateur de fichiers");
		
		Compare test2 = new Compare();
		test2.compare(file4, file6);
		
	}

}