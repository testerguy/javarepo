
public class CommonStringMethods {
	public static void main(String[] args) {
		String[] words = {"chunk", "funk", "furry", "terminator"};
		
		for (String w : words) {
			if (w.startsWith("fu"))
				System.out.println(w + " starts with 'fu'");
		}
		
		for (String w : words) {
			if (w.endsWith("unk")) {
				System.out.println(w + " ends with 'unk'");
			}
		}
	}
}
