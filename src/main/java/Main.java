import java.io.File;

import com.mathsystem.graphapi.GraphFactory;

public class Main {
    public static void main (String[] args) {
        FlatGraph graphSquare = new FlatGraph();
        System.out.println(graphSquare.
                execute(GraphFactory.loadUndirectedGraphFromFile(
                        new File("D:/Graph/graph.txt"))));
    }

}