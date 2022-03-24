package curso_programacao;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // Elminar os espa�os das laterais
		String s04 = original.substring(2); // Retorna o elemento da posi��o 2
		String s05 = original.substring(2, 9); // A partir da posi��o 2, retorne os pr�ximos 9 elementos
		String s06 = original.replace('a', 'x'); // onde ocorrer "a" troque por "x"
		String s07 = original.replace("abc", "xy"); // onde ocorrer "abc" troque por "xy"
		int i = original.indexOf("bc"); // A primeira ocorr�ncia de "bc"
		int j = original.lastIndexOf("bc"); // A �ltima ocorr�ncia de "bc"
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j); 
	
	}

}
