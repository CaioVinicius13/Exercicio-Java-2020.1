package Questão1;

import java.util.ArrayList;
import java.util.List;

public class ListaMathUtils {
	
	static List<Integer> calculaDivisores(int num) {
		List<Integer> divisores = new ArrayList<Integer>();
		for (int i = 1 ; i<=num ; i++) {
			if (num%i==0) {
				divisores.add(i);
			}
		}
		return divisores;
	}
	
	static double computaMaior(List<Double> numeros) {
		double maior = numeros.get(0);
		for(int i = 0 ; i < numeros.size() ; i++) {
			if((double) numeros.get(i)>maior) {
				maior =numeros.get(i);
			}
		}
		return maior;
	}
	
	static double computaMenor(List<Double> numeros) {
		double menor =numeros.get(0);
		for(int i = 0 ; i<numeros.size() ; i++) {
			if((double) numeros.get(i) < menor) {
				menor =numeros.get(i);
			}
		}
		return menor;
	}
	
	static double computaMedia(List<Double> numeros) {
		double media = 0;
		for (int i = 0 ; i<numeros.size() ; i++) {
			media+= numeros.get(i);
		}
		return media/numeros.size();
	}
	
	static boolean temNumRepetido(List numeros) {
		for (int i = 0 ; i<numeros.size() ; i++) {
			for (int j = 0 ; j<numeros.size() ; j++) {
				if ((numeros.get(i)).equals(numeros.get(j)) && i!=j) {
					return true;
				}
			}
		}
		return false;
	}
}
