package threads;

/**
 * Created by deepak.kumar on 2/28/16.
 */
public class DataHolder {
    private Integer value;
    public DataHolder(int value)
    {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
