package tether;
import java.awt.Component;

import javax.swing.JFrame;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;

public class Main {
	static JFrame frame;
    protected static String styleSheet =
    		"edge { "+
    				"fill-color: blue;"+
    				"}"+
    		"node {"+
		    	"size: 50px;"+
		    	"shape: circle;"+
		    	"fill-color: green, yellow;"+
		    	"stroke-mode: plain;"+
		    	"stroke-color: yellow;"+
		    "}";
    
	protected void sleep() {
		try { Thread.sleep(1000); } catch (Exception e) {}
	}
	
	public static void main(String[] args) {
		System.setProperty("org.graphstream.ui.renderer","org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		MyFrame frame = new MyFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Graph graph = new MultiGraph("Tether");
		graph.addAttribute("ui.stylesheet", styleSheet);
	    graph.addAttribute("ui.quality");
	    graph.addAttribute("ui.antialias");
		graph.addNode("tetherReserve");
		graph.addNode("bitfinex");
		graph.addNode("poloniex");
		graph.addNode("bitrex");
		Node tetherReserve = graph.getNode("tetherReserve");
		tetherReserve.setAttribute("xyz", 1,1,1);
		tetherReserve.setAttribute("address", "CSDFSDF");
		Node bitfinex = graph.getNode("bitfinex");
		bitfinex.setAttribute("address", "FDSFSDFDSF");
		Node bitrex = graph.getNode("bitrex");
		bitrex.setAttribute("address", "0123sdf23213");
		Node poloniex = graph.getNode("poloniex");
		poloniex.setAttribute("address", "23423566");
	    for (Node node : graph) {
	        node.addAttribute("ui.label", node.getId());
	    }
		graph.addEdge("tetherReserveToBitfinex1", tetherReserve, bitfinex, true);
		graph.addEdge("tetherReserveToBitfinex2", tetherReserve, bitfinex, true);
		graph.addEdge("tetherReserveToBitfinex3", tetherReserve, bitfinex, true);
		graph.addEdge("tetherReserveToBitfinex4", tetherReserve, bitfinex, true);
		graph.addEdge("tetherReserveToBitfinex5", tetherReserve, bitfinex, true);
		Edge tetherReserveToBitfinex1 = graph.getEdge("tetherReserveToBitfinex1");
		Edge tetherReserveToBitfinex2 = graph.getEdge("tetherReserveToBitfinex2");
		Edge tetherReserveToBitfinex3 = graph.getEdge("tetherReserveToBitfinex3");
		Edge tetherReserveToBitfinex4 = graph.getEdge("tetherReserveToBitfinex4");
		Edge tetherReserveToBitfinex5 = graph.getEdge("tetherReserveToBitfinex5");
		tetherReserveToBitfinex1.setAttribute("transactionAmount", 100000000);
		tetherReserveToBitfinex2.setAttribute("transactionAmount", 100000000);
		tetherReserveToBitfinex3.setAttribute("transactionAmount", 100000000);
		tetherReserveToBitfinex4.setAttribute("transactionAmount", 100000000);
		tetherReserveToBitfinex5.setAttribute("transactionAmount", 100000000);
		tetherReserveToBitfinex1.setAttribute("ui.label", tetherReserveToBitfinex1.getAttribute("transactionAmount").toString() );
		tetherReserveToBitfinex2.setAttribute("ui.label", tetherReserveToBitfinex2.getAttribute("transactionAmount").toString() );
		tetherReserveToBitfinex3.setAttribute("ui.label", tetherReserveToBitfinex3.getAttribute("transactionAmount").toString() );
		tetherReserveToBitfinex4.setAttribute("ui.label", tetherReserveToBitfinex4.getAttribute("transactionAmount").toString() );
		tetherReserveToBitfinex5.setAttribute("ui.label", tetherReserveToBitfinex5.getAttribute("transactionAmount").toString() );
		graph.addEdge("bitfinexToPoloniex1", bitfinex, poloniex, true);
		graph.addEdge("bitfinexToPoloniex2", bitfinex, poloniex, true);
		graph.addEdge("bitfinexToPoloniex3", bitfinex, poloniex, true);
		Edge bitfinexToPoloniex1 = graph.getEdge("bitfinexToPoloniex1");
		Edge bitfinexToPoloniex2 = graph.getEdge("bitfinexToPoloniex2");
		Edge bitfinexToPoloniex3 = graph.getEdge("bitfinexToPoloniex3");
		bitfinexToPoloniex1.setAttribute("transactionAmount", 1000000);
		bitfinexToPoloniex2.setAttribute("transactionAmount", 1000000);
		bitfinexToPoloniex3.setAttribute("transactionAmount", 1000000);
		bitfinexToPoloniex1.setAttribute("ui.label", bitfinexToPoloniex1.getAttribute("transactionAmount").toString());
		bitfinexToPoloniex2.setAttribute("ui.label", bitfinexToPoloniex2.getAttribute("transactionAmount").toString());
		bitfinexToPoloniex3.setAttribute("ui.label", bitfinexToPoloniex3.getAttribute("transactionAmount").toString());
		graph.addEdge("bitfinexToBitrex1", bitfinex, bitrex, true);
		graph.addEdge("bitfinexToBitrex2", bitfinex, bitrex, true);
		graph.addEdge("bitfinexToBitrex3", bitfinex, bitrex, true);
		Edge bitfinexToBitrex1 = graph.getEdge("bitfinexToBitrex1");
		Edge bitfinexToBitrex2 = graph.getEdge("bitfinexToBitrex2");
		Edge bitfinexToBitrex3 = graph.getEdge("bitfinexToBitrex3");
		bitfinexToBitrex1.setAttribute("transactionAmount", 1000000);
		bitfinexToBitrex2.setAttribute("transactionAmount", 1000000);
		bitfinexToBitrex3.setAttribute("transactionAmount", 1000000);
		bitfinexToBitrex1.setAttribute("ui.label", bitfinexToBitrex1.getAttribute("transactionAmount").toString());
		bitfinexToBitrex2.setAttribute("ui.label", bitfinexToBitrex2.getAttribute("transactionAmount").toString());
		bitfinexToBitrex3.setAttribute("ui.label", bitfinexToBitrex3.getAttribute("transactionAmount").toString());
		Viewer viewer = graph.display();
		viewer.enableAutoLayout();
	}
}
