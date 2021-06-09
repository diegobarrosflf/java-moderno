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
			
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(t -> System.out.println(t));

	}

}

