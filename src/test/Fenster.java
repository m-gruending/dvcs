package test;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//testest
public class Fenster implements ActionListener{
			
	Frame oberflaeche= new Frame();
	Panel panel=new Panel();
	Button ziehEins=new Button("1");
	Button ziehZwei=new Button("2");
	Button ziehDrei=new Button("3");
	Button neuesSpiel=new Button("Neues Spiel");
	Spiellogik spiel= new Spiellogik();
		
		public void erzeugeOberflaeche() {

			
			oberflaeche.setVisible(true);
			oberflaeche.setSize(200, 100);
			oberflaeche.add(panel);

			panel.add(ziehEins);
			panel.add(ziehZwei);
			panel.add(ziehDrei);
			panel.add(neuesSpiel);

			ziehEins.addActionListener(this);
			ziehZwei.addActionListener(this);
			ziehDrei.addActionListener(this);
			neuesSpiel.addActionListener(this);
				
		}
		
		public void actionPerformed(ActionEvent e) {
	        if(e.getSource() == ziehEins){
	        	spiel.spielzug(1);
	        }
	        else if(e.getSource() == ziehZwei){
	        	spiel.spielzug(2);
	          
	        }
	        else if (e.getSource() == ziehDrei){
	        	spiel.spielzug(3);
	        }        
	        
	        else if (e.getSource() == neuesSpiel){
	        	spiel.nenneStartHoelzer();
	        }

		}
}




