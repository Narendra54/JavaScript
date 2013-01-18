import java.awt.*;
import java.awt.event.*;


class reservation extends Frame implements ActionListener{
	Label lblsrcDesti,lblType,lblSeat;
	//TextField txtDriver,txtRno,txtMdetails,txtKms;
	Choice vType,seatCap;
	Button bEnter,bClear,bMap;

	public reservation(){
		setTitle("Cap Reservation Window");
		setBounds(200,200,400,300);
		setBackground(Color.MAGENTA);


		Panel a = new Panel();

// **** creating labels....

		lblType = new Label("Type of Vehicle you want:");
		lblSeat = new Label("No. of Persons Travelling:");
		lblsrcDesti = new Label("Mark the source and Destination:");

//**** creating combo boxes...

		vType = new Choice();
		seatCap = new Choice();

//**** creating buttons...

		bEnter = new Button("ENTER");
                bClear = new Button("CLEAR");
                bMap = new Button("Show Map");


//**** creating layout for panel

		GridLayout g = new GridLayout(4,2);
		a.setLayout(g);

//**** adding components to the panel

		a.add(lblType);
		a.add(vType);
		vType.add("AC");
		vType.add("non-AC");
		vType.add("three-vehiler");

		a.add(lblSeat);
		a.add(seatCap);
		seatCap.add("3");
		seatCap.add("4");
		seatCap.add("5");

		a.add(lblsrcDesti);
		a.add(bMap);

		a.add(bEnter);
		a.add(bClear);

		bMap.addActionListener(this);
		bEnter.addActionListener(this);
		bClear.addActionListener(this);

		add(a);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
	       if(e.getSource()==bMap){
	            try{new roadMap();
                }catch(Exception k){}
	        }
	}

	public static void main(String args[]){
		reservation r = new reservation();
	}
}