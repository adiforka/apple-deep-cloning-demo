package apple_deep_cloning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Apple implements Cloneable {

    private List<Seed> seeds = new ArrayList<>();

    public List<Seed> getSeeds() {
        return seeds;
    }


    public void addAllSeeds(Seed... seeds1) {
        seeds.addAll(Arrays.asList(seeds1));
    }

    //deep clone method for Apple
    @Override
    public Apple clone() {
        try {
            //refactoring using a stream pipeline (which returns a new list object - populating it with cloned Seeds)
            Apple clonedApple = (Apple) super.clone();
            clonedApple.seeds = seeds.stream()
                    .map(Seed::clone)
                    .collect(Collectors.toList());
            return clonedApple;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
