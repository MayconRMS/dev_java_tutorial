package teste1;
import java.util.Arrays;

//Menor numero não existente na lista
public class MenorNaoExistente {

	public static void main(String[] args) {
		String resposta = "nothing";

		System.out.println("Start Project");

		int[] arr = { 1, 3, 6, 4, 1, 2 };
		resposta = Solution(arr) + "";
		System.out.println("Correta: 5 - Resposta: " + resposta);

		int[] arr2 = { 1, 2, 3 };
		resposta = Solution(arr2) + "";
		System.out.println("Correta: 4 - Resposta: " + resposta);

		int[] arr3 = { -1, -3 };
		resposta = Solution(arr3) + "";
		System.out.println("Correta: 1 - Resposta: " + resposta);

	}

	public static int Solution(int[] arr) {
		int smallestInt = 1;

		if (arr.length == 0)
			return smallestInt;

		Arrays.sort(arr);

		if (arr[0] > 1)
			return smallestInt;
		if (arr[arr.length - 1] <= 0)
			return smallestInt;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == smallestInt) {
				smallestInt++;
			}
		}

		return smallestInt;
	}
}
