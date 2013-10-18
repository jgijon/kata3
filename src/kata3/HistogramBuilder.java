package kata3;

import java.util.List;

public class HistogramBuilder<Type> {
    
    private Histogram<Type> histogram;

    public HistogramBuilder() {
        this.histogram = new Histogram<>();
    }
    
    public void calculate(Type[] data){
        for (Type item : data) {
            histogram.put(item, getCount(item)+1);
        }
    }
    
    public void calculate(List<Type> data){
        for (Type item : data) {
            histogram.put(item, getCount(item)+1);
        }
    }

    public Histogram getHistogram() {
        return histogram;
    }

    private Integer getCount(Type item) {
        if (histogram.containsKey(item))
            return histogram.get(item);
        return 0;
    }
    
}
