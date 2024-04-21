import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class DDD {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int ddd = reader.nextInt();
		reader.close();
		System.out.println(getCityBy(ddd));
	}

	public static String getCityBy(int ddd) {
		Map<Integer, String> dddCities = new HashMap<>();
		dddCities.put(61, "Brasilia");
		dddCities.put(71, "Salvador");
		dddCities.put(11, "Sao Paulo");
		dddCities.put(21, "Rio de Janeiro");
		dddCities.put(32, "Juiz de Fora");
		dddCities.put(19, "Campinas");
		dddCities.put(27, "Vitoria");
		dddCities.put(31, "Belo Horizonte");

		String city = dddCities.get(ddd);

		if (city == null) {
			city = "DDD not found";
		}

		return city;
	}
}
