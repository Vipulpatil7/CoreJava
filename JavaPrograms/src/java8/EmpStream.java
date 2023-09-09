package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmpStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> a1= new ArrayList<>();
		a1.add(new Emp(1, "Manya", "Manager", 23000 ));
		a1.add(new Emp(2, "Avinash", "TL", 24000 ));
		a1.add(new Emp(3, "Munna", "Dev", 32000 ));
		a1.add(new Emp(4, "Pooja", "Trainer", 39000 ));
		a1.add(new Emp(3, "Munna", "Dev", 32000 ));
		a1.add(new Emp(4, "Pooja", "Trainer", 39000 ));
		
		List<String> li = a1.stream().map(e->e.toString()).collect(Collectors.toList());
         System.out.println("elements in employee List:" + li);
         
         Set<String> hs = a1.stream().map(e->e.toString()).collect(Collectors.toSet());
         System.out.println("elements in employee set:" + hs);
 
         long count = a1.stream().count();
         System.out.println(count);
         
         long c = a1.stream().filter(a -> a.getEname().startsWith("A")).count();
         System.out.println(c);
         
         Stream<Emp> namesStartsWith = a1.stream().filter(a -> a.getEname().startsWith("A"));
        System.out.println("Name start with A:"+namesStartsWith.collect(Collectors.toList())); 
        
        
        Object s = a1.stream().collect(Collectors.maxBy(Comparator.comparingInt(w -> w.salary)));
		System.out.println("Emp maximum salary:" + s);
		
		Object s1 = a1.stream().collect(Collectors.minBy(Comparator.comparingInt(x -> x.salary)));
		System.out.println("Emp minimum salary:" + s1);
		
		double s2 = a1.stream().collect(Collectors.averagingInt(y -> y.salary));//avg sal
		System.out.println("Emp maximum salary:" + s2);
		
		List<String> namesofemp = a1.stream().map(n->n.ename).collect(Collectors.toList());//only names
		System.out.println(namesofemp);
		
		List<String> namesofemp1 = a1.stream().map(n->n.ename.toUpperCase()).collect(Collectors.toList());// names
		System.out.println(namesofemp1);
		
		List<String> namesofemp2 = a1.stream().map(n->n.designation).collect(Collectors.toList());// names
		System.out.println(namesofemp2);
		
		System.out.println("unique designation wise record");
		a1.stream().map(Emp::getDesignation).distinct()
        .forEach(System.out::println);

		int a[] = { 1, 5, 8 ,34,3};
		long count1= Arrays.stream(a).sum();
		System.out.println("Sum:"+count1);
		

		
		ArrayList<String> name = new ArrayList<>();
		name.add("Abhi");
		name.add("Radha");
		name.add("Anu");
		name.add("Aniket");
		name.add("Ashish");
		name.add("Krishna");

		// to use multiple function using stream api
		long count2 = name.stream().filter(f -> f.length() > 4 && f.length() < 7).count();
		System.out.println("Names length less than 5:...." + count2);

		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count3 = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Count space....." + count3);
		
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> squares = num.stream().map(n -> n * n).toList();
//        		.collect(Collectors.toList());
		System.out.println(squares);
		
		
//		static int n = 15;
//
//		private static boolean isPrime(int number) {
//			return number>1 && IntStream.range(2, number).noneMatch(i->number%i==0);
//		}
//		System.out.println("Prime checking...."+isPrime(n));


	}

}