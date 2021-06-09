import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Seja bem vindo!");
		palavras.add("Bom dia");
		palavras.add("Obrigado");

		Comparator<String> comparador = new ComparadorPorTamanho();

		// Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		// System.out.println(palavras);

//		for (String string : palavras) {
//			System.out.println(string);
//		}

		Consumer<String> Consumidor = new ImprimeNaLinha();
		palavras.forEach(Consumidor);

	}

}

class ImprimeNaLinha implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t);

	}

}

class ComparadorPorTamanho implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}