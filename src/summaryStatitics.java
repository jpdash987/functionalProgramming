import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class summaryStatitics
{
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = DoubleStream.of(1.0,2.0,3.0,4.0,5.0).summaryStatistics();
        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
        System.out.println(stats.getCount());

    }
}
