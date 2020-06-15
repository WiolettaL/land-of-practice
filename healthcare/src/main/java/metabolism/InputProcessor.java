package metabolism;

public class InputProcessor {

    private InputCollector inputCollector;

    public InputProcessor() {
        this.inputCollector = new InputCollector();
    }

    public UserInput processCollectingData() {
        return UserInput.builder()
                .name(inputCollector.collectName())
                .sex(inputCollector.collectSex())
                .age(inputCollector.collectAge())
                .weight(inputCollector.collectWeight())
                .height(inputCollector.collectHeight())
                .lifestyle(inputCollector.collectLifestyle())
                .build();
    }
}
