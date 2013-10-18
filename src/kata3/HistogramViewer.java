package kata3;

public class HistogramViewer<Type> {
    
    private Histogram<Type> histogram;

    public HistogramViewer(Histogram<Type> histogram) {
        this.histogram = histogram;
    }
    
    public void show(){
        for (Type key : histogram.keySet())
            System.out.println(key + ": " + histogram.get(key));
    }
    
}
