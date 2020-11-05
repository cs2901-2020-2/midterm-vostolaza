package midterm;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

@Test
public class SubjectTest {

    public void instantiateSubject() throws Exception {
        Subject s = new Subject(30,85,30,40);
        List<Float> values = s.getValues();
        Assert.assertEquals(values.get(0), 30, 0.0001);
        Assert.assertEquals(values.get(1), 85, 0.0001);
        Assert.assertEquals(values.get(2), 30, 0.0001);
        Assert.assertEquals(values.get(3), 40, 0.0001);
    }

    public void updateValues() throws Exception {
        Subject s = new Subject();
        s.updateValues(10, 20, 30, 40);
        List<Float> values = s.getValues();
        Assert.assertEquals(values.get(0), 10, 0.0001);
        Assert.assertEquals(values.get(1), 20, 0.0001);
        Assert.assertEquals(values.get(2), 30, 0.0001);
        Assert.assertEquals(values.get(3), 40, 0.0001);
    }

    public void pieChartGenerated() throws Exception {
        Subject s = new Subject(30,85,30,40);
        File pieChart = new File("PieChart.jpeg");
        Assert.assertTrue(pieChart.exists());
    }

    public void barChartGenerated() throws Exception {
        Subject s = new Subject(30,85,30,40);
        File barChart = new File("BarChart.jpeg");
        Assert.assertTrue(barChart.exists());
    }

}
