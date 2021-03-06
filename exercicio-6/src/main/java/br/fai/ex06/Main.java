package br.fai.ex06;

import java.text.DecimalFormat;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}

	private void start() {

		int[] primeiroArray = { 50, -20, 0, 40 };
		int[] segundoArray = { 5, -50, 10, 60 };

		exibirValoresDoArray(primeiroArray);
		exibirValoresDoArray(segundoArray);

		int[] arraysCombinados = combinarArrays(primeiroArray, segundoArray);

		int soma = somar(arraysCombinados);
		
		System.out.println("Soma: " +soma);

		Double media = media(soma, arraysCombinados.length);
		
		exibirMedComCasasDecimais(media);

	}

	private void exibirValoresDoArray(int[] array) {
		System.out.println("Valoresde array: " + Arrays.toString(array));
	}

	private int[] combinarArrays(int[] primeiroArray, int[] segungoArray) {
		// para importar,basta da cltr + shift + o
		int[] arraysCombinados = ArrayUtils.addAll(primeiroArray, segungoArray);
		System.out.println("Arrays combinados: " + Arrays.toString(arraysCombinados));
		return arraysCombinados;

	}

	private int somar(int[] array) {
		int soma = 0;
		for (int i = 0; i < array.length; i++)	{
			soma += array[i];
		}
		return soma;

	}

	private Double media(int soma, int numeroDeItens) {
		return (double) (soma / numeroDeItens);

	}

	private void exibirMedComCasasDecimais(Double media) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Media: " + decimalFormat.format(media));
	}

}
