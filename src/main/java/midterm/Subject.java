package midterm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Subject {

    float valueA;
    float valueB;
    float valueC;
    float valueD;

    public Subject(float valA, float valB, float valC, float valD) throws IOException {
        valueA = valA; valueB = valB; valueC = valC; valueD = valD;
        generateGraphs();
    }

    public Subject(){
        valueA = 0; valueB = 0; valueC = 0; valueD = 0;
    }

    public void updateValues(float valA, float valB, float valC, float valD) throws IOException {
        valueA = valA; valueB = valB; valueC = valC; valueD = valD;
        generateGraphs();
    }

    public void generateGraphs() throws IOException {
        PieChartMonitor.generatePieChart(valueA, valueB, valueC, valueD);
        BarChartMonitor.generateBarChart(valueA, valueB, valueC, valueD);
    }

    public List<Float> getValues(){
        List<Float> list = new ArrayList<>();
        list.add(valueA); list.add(valueB); list.add(valueC); list.add(valueD);
        return list;
    }
}
