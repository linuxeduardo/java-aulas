package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		// MAP
		// key value
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "ROberTo"); // put = update or add
		usuarios.put(1, "ROb3rTo2");
		usuarios.put(2, "Lu!zA");
		usuarios.put(3, "MiCh43L");
		usuarios.put(4, "MiCh43L 2");
		usuarios.put(5, "MiCh43L 3");
		
		System.out.println(usuarios);
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("MiCh43L"));
		System.out.println(usuarios.get(3)); // key
		
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(1, "Michael"));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println("Registro: " 
		+ registro.getKey() + " " + registro.getValue());
		}
	}
}






