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
			
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//palavras.sort(Comparator.comparing(s -> s.length()));
		//palavras.sort(Comparator.comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		

		//palavras.forEach(t -> System.out.println(t));
		palavras.forEach(System.out::println);

	}

}

