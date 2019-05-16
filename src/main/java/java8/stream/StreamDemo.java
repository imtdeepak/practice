package java8.stream;import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by deepak on 10/11/18.
 */
public class StreamDemo {
    public static void main(String[] args) {
        String[] sampleString = new String[]{"abc", "bcd", "cde"};
        Arrays.stream(sampleString).forEach((str) -> reverse(str));


        Stream<String> stringStream = Arrays.stream(sampleString);
        long totalCharacters = stringStream.distinct().count();


        System.out.println("Total Characters =  " + totalCharacters);

        for (String s : sampleString) {

            System.out.println(s);

        }


        stringStream = Arrays.stream(sampleString);// We have to get the stream again otherwise it will throw the Stream Already used Exception
        boolean isExist = stringStream.anyMatch(element -> element.contains("a"));

        System.out.println("a exist in the String Stream " + isExist);

        //We can resolve this by using Supplier
        Supplier<Stream<String>> streamSupplier = new Supplier<Stream<String>>() {
            @Override
            public Stream<String> get() {
                return Stream.of(sampleString);
            }
        };
        System.out.println("Find Any  " + streamSupplier.get().findAny().get());

//setALL
        int[] array = new int[10];
        Arrays.setAll(array, i -> i + 1);
        for (int i : array
                ) {
            System.out.println(i);
        }


    }

    private static String reverse(String str) {
        return (new StringBuilder(str).reverse()).toString();
    }
}
