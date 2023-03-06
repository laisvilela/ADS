package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Program {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Stack<Integer> pilha = new Stack<Integer>();
		Queue<Integer> fila = new LinkedList<Integer>();

		for (int item = 1; item <= 5; item++) {
			lista.add(item);
			pilha.push(item);
			lista.remove(0);
		}

		Iterator<Integer> iterPilha = pilha.listIterator();
		while (iterPilha.hasNext()) {
			int topoPilha = pilha.peek();
			fila.add(topoPilha);
			pilha.pop();

		}

		System.out.println("Elementos fila 1: " + fila);

		for (int item = 6; item <= 10; item++) {
			lista.add(item);
			pilha.push(item);
			lista.remove(0);
		}

		Iterator<Integer> iterPilha2 = pilha.listIterator();
		while (iterPilha2.hasNext()) {
			int topoPilha = pilha.peek();
			fila.add(topoPilha);
			pilha.pop();

		}

		System.out.println("Elementos fila 2: " + fila);

	}
}
