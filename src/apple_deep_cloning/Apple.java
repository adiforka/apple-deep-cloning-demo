package apple_deep_cloning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            Apple clonedApple = (Apple) super.clone();
            clonedApple.seeds = new ArrayList<>();
            for(Seed s : this.seeds) {
                //need to remember to call Seed's own clone method here
                clonedApple.seeds.add(s.clone());
            }
            return clonedApple;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
