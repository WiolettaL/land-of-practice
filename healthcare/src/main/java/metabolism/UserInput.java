package metabolism;

public class UserInput {

    private String name;
    private String sex;
    private int age;
    private double weight;
    private int height;
    private int lifestyle;

    protected UserInput() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getLifestyle() {
        return lifestyle;
    }

    public static final class Builder {

        private String name;
        private String sex;
        private int age;
        private double weight;
        private int height;
        private int lifestyle;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder lifestyle(int lifestyle) {
            this.lifestyle = lifestyle;
            return this;
        }

        public UserInput build() {
            UserInput userInput = new UserInput();
            userInput.name = this.name;
            userInput.sex = this.sex;
            userInput.age = this.age;
            userInput.weight = this.weight;
            userInput.height = this.height;
            userInput.lifestyle = this.lifestyle;
            return userInput;
        }
    }
}
