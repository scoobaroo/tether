package tether;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;

public class MyFrame extends JFrame
{
    private static final long serialVersionUID = 8394236698316485656L;

    private Graph graph = new MultiGraph("embedded");
    //private Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
    private Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
    private View view = viewer.addDefaultView(false);

    public MyFrame() {
        setLayout(new BorderLayout());
        add((Component) view, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Activate autolayout here : 
        viewer.enableAutoLayout();
   }
}