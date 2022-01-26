package com.ushwamala.interview.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TheStreamsApi {
    public static void main(String[] args) throws IOException {

        Stream<Integer> emptyIntStream = createEmptyStream();

        Stream<String> streamOfStrings = createStreamFromList(List.of("test", "tst"));

        Collection<String> collection = Arrays.asList("a", "b");
        Stream<String> streamFromCollection = createStreamFromCollection(collection);

        String[] array = new String[] {"a", "b", "c"};
        Stream<String> streamFromCompleteArray = createStreamFromCompleteArray(array);
        Stream<String> createStreamFromArrayWithRange = createStreamFromArrayWithRange(array, 0, 1);

        Stream<String> streamFromStreamBuilder = createStreamWithStreamBuilder("a", "b", "c");

        //range(int startInclusive, int endExclusive)
        IntStream intStream = IntStream.range(1, 23);

        //rangeClosed(int startInclusive, int endInclusive)
        LongStream longStream = LongStream.rangeClosed(1, 3);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);

        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");

        //Stream of File
        Path path = Paths.get("src/main/java/com/ushwamala/interview/streams/test.txt");
        Stream<String> streamFromFile = Files.lines(path);
        Stream<String> streamFromFileWithCharset = Files.lines(path, StandardCharsets.UTF_8);

        // referencingStream();

        //useStreamsCorrectly();

        //takeWhile();

        flatMap();

    }


    public static <T> Stream<T> createEmptyStream() {
        return Stream.empty();
    }

    public static <T> Stream<T> createStreamFromList(List<T> list) {
        return list == null || list.isEmpty() ? createEmptyStream() : list.stream();
    }

    public static <T> Stream<T> createStreamFromCollection(Collection<T> collection) {
        return collection.stream();
    }

    public static <T> Stream<T> createStreamFromCompleteArray(T[] array) {
        return Arrays.stream(array);
    }

    public static <T> Stream<T> createStreamFromArrayWithRange(T[] array, int from, int to) {
        return Arrays.stream(array, from, to);
    }

    @SafeVarargs
    public static <T> Stream<T> createStreamWithStreamBuilder(T... args) {
        Stream<T> result = createEmptyStream();
        for (T t : args) {
            result = Stream.<T>builder().add(t).build();
        }
        return result;
    }

    public static void referencingStream() {
        Stream<String> stream = Stream.of("a", "b", "c")
                .filter(element -> element.contains("b"));

        Optional<String> anyElement = stream.findAny();
        anyElement.ifPresent(System.out::println);

        //This operation will trigger the IllegalStateException: Java 8 streams can't be reused.
       /* final Optional<String> first = stream.findFirst();
        first.ifPresent(System.out::println);*/

    }

    public static void useStreamsCorrectly() {
        List<String> elements = Stream.of("a", "b", "c")
                .filter(element -> element.contains("b"))
                .collect(Collectors.toList());

        final Optional<String> anyElement = elements.stream().findAny();
        anyElement.ifPresent(System.out::println);

        final Optional<String> firstElement = elements.stream().findFirst();
        firstElement.ifPresent(System.out::println);

    }

    public static void takeWhile() {
        Stream.of("cat", "dog", "elephant", "fox", "rabbit", "duck")
                .takeWhile(n -> n.length() % 2 != 0)
                .forEach(System.out::println);
    }

    public static void flatMap() {
        List<List<String>> listOfStringLists = Arrays.asList(
                Arrays.asList("Mike", "Angela"),
                Arrays.asList("Ushamah", "Refia")

        );
        final List<String> listOfStrings = listOfStringLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(listOfStrings);
    }

}
