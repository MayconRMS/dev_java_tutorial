package teste2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author maycon
 *
 *Cada numero é um lugar para se viajar
 *
 *Qual o menor dia que preciso para viajar a todos os lugares?
 *
 */
public class SequenciaViagens {

	public static void main(String[] args) {
		int resposta = 0;

		System.out.println("Start Project 2");

		int[] arr = { 7, 3, 7, 3, 1, 3, 4, 1 };
		resposta = Solution(arr);
		System.out.println("Resposta: " + resposta + " dias | " + (resposta == 5 ? "CORRECT" : "ERRO"));

		int[] arr2 = { 2, 1, 1, 3, 2, 1, 1, 3 };
		resposta = Solution(arr2);
		System.out.println("Resposta: " + resposta + " dias | " + (resposta == 3 ? "CORRECT" : "ERRO"));

		int[] arr3 = { 7, 5, 2, 7, 2, 7, 4, 7 };
		resposta = Solution(arr3);
		System.out.println("Resposta: " + resposta + " dias | " + (resposta == 6 ? "CORRECT" : "ERRO"));

		int[] arr4 = { 7, 9, 5, 6, 5, 5, 7, 2, 4, 4, 8, 9 };
		resposta = Solution(arr4);
		System.out.println("Resposta: " + resposta + " dias | " + (resposta == 9 ? "CORRECT" : "ERRO"));

	}

	public static int Solution(int[] arr) {
		int day = 0;
		List<Integer> values = new ArrayList<>();
		Set<Integer> locais = new HashSet<>();
		for (int a : arr) {
		  locais.add(a);
		}

		for (int y = 0; y < (arr.length - locais.size()); y++) {
			for (int i = y; i < arr.length; i++) {

				if (locais.contains(arr[i])) {
					values.add(arr[i]);
				}

				if (values.containsAll(locais)) {
					if (values.size() < day || day == 0) {
						day = values.size();
					}
					break;
				}
			}
			values.clear();
		}
		return day;
	}
}
