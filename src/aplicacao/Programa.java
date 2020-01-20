package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		int soma = lista.stream().filter(x->x%2==0).map(x->x*10).reduce(0, (a,b) ->a+b);
		
		System.out.println(soma);

		Stream<Integer> stream = lista.stream().map(x -> x * 2);

		System.out.println(Arrays.toString(stream.toArray()));
		
		Stream<Integer> stream1 = Stream.iterate(0, x->x+2).map(x ->x%2).limit(100);
		
		System.out.println(Arrays.toString(stream1.toArray()));
		
		List <Integer> lista1 = Arrays.asList(3,5,7,8,4);
		
		Stream <Integer> pipe = lista1.stream().filter(x->x%2==0).map(x->x*10);
		
		System.out.println(Arrays.toString(pipe.toArray()));
		
		
		List <Integer> newList = Arrays.asList(1,2,3,4,5,6,7);
		
		Stream <Integer> newStream =  newList.stream().filter(x->x%2==0).map(x->x*10);
		
		System.out.println(Arrays.toString(newStream.toArray()));
		
		int soma2 =  newList.stream().filter(x->x%2==0).map(x->x*10).reduce(0,(a,b) ->a+b);
				
		System.out.println(soma2);
	
		
		

		
		

	}

}
