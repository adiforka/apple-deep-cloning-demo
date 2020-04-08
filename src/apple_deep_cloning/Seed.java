package apple_deep_cloning;

public class Seed implements Cloneable {
    private String description;

    public Seed(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Seed clone() {
        try {
            return (Seed) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
