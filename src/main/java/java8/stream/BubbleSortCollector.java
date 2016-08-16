package java8.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by deepak.kumar on 1/28/16.
 */
public class BubbleSortCollector implements Collector<Integer, List<Integer>, List<Integer>> {
    @Override
    public Supplier<List<Integer>> supplier() {
        return () -> new ArrayList<>();
    }

    @Override
    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (p, e) -> p.add(e);
    }

    @Override
    public BinaryOperator<List<Integer>> combiner() {
        return (p, e) -> {
            p.addAll(e);
            return p;
        };
    }

    @Override
    public Function<List<Integer>, List<Integer>> finisher() {
        return (p) -> p;
    }

    @Override
    public Set<Characteristics> characteristics() {
        Set<Characteristics> set = new HashSet<>();
        set.add(Characteristics.UNORDERED);
        return set;
    }
}
