package streams.customerOpearation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerData
{
    public static void main(String[] args) {
        List<Customer> customers = Stream.of(
                new Customer(1 ,12000,"swadhin", "12cs21" ,24 , "Male"),
                new Customer(2,12345,"partha"  ,"15cs123" ,32,"Female"),
                new Customer(3,89000,"Sunita"  ,"90cs789" ,27,"Female"),
                new Customer(4,23123,"Ram"  ,"89fg678" ,87,"male"),
                new Customer(5,56789,"Jp"  ,"87ck456" ,45,"male")
        ).collect(Collectors.toList());

    //    customers.forEach(customer -> System.out.println(customer.toString()));

 /*
   find second highest salary */
   Optional<Double> secondHighestSalary = customers.stream()
           .map(Customer::getSalary)
           .distinct()
           .sorted((s1,s2) ->Double.compare(s2,s1))
           .skip(1)
           .findFirst();

   secondHighestSalary.ifPresent(System.out::println);
        /**
         * Lowest salary
         */

        Optional<Double> lowestSalary = customers.stream()
                .map(Customer::getSalary)
                .min(Double::compare);
    lowestSalary.ifPresent(salary -> System.out.println(salary));


    /**
     * sorting salary based on ascending order
     */

    List<Customer> sortedAscendingOrder = customers.
                                   stream().sorted((c1,c2)  -> Double.compare(c1.getSalary(),c2.getSalary()))
                                   .collect(Collectors.toList());

    sortedAscendingOrder.forEach(System.out::println);

        /**
         * only salary sorting
         */
          customers.stream().map(Customer::getSalary).forEach(System.out::println);


        /**
         * hig   hest age
         */

        Optional<Customer> highestAge = customers.stream().max((c1 ,c2) ->Integer.compare(c1.getAge(), c2.getAge()));
        highestAge.ifPresent(System.out::println);

        /**
         * gender count
         */
        Map<String,Long> genderCount = customers.stream()
                                       .collect(Collectors.groupingBy(c ->c.getGender() .toLowerCase(), Collectors.counting()));
       genderCount.entrySet().stream().forEach(System.out::println);
     //   System.out.println(genderCount.getOrDefault("Male",0L));

    }}
