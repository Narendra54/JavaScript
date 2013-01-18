import java.awt.*;
import java.io.*;


class administrator extends Frame{
	Label lblvType,lblvDriver,lblrNo,lblvMdetails,lblkms,lblsCap;
	TextField txtDriver,txtRno,txtMdetails,txtKms;
	Choice vType,seatCap;
	Button bEnter,bClear;

	public administrator(){
		setTitle("Cap Vehicle Administrator");
		setSize(800,400);


		Panel a = new Panel();

// **** creating labels....

		lblvType = new Label("Vehicle Type");
		lblvDriver = new Label("Driver Name");
		lblrNo = new Label("Vehicle Registration No.");
		lblvMdetails = new Label("Vehicle Maintainance details");
		lblkms = new Label("distance run(kms)");
		lblsCap = new Label("Vehicle Seating Capacity");

//**** creating text boxes

		txtDriver = new TextField(20);
		txtRno = new TextField(20);
		txtMdetails = new TextField(20);
		txtKms = new TextField(20);

//**** creating combo boxes...

		vType = new Choice();
		seatCap = new Choice();

		bEnter = new Button("ENTER");
	//	bEnter.a
		bClear = new Button("CLEAR");

//**** creating layout for panel

		GridLayout g = new GridLayout(7,2);
		a.setLayout(g);

//**** adding components to the panel

		a.add(lblvType);
		a.add(vType);
		vType.add("AC");
		vType.add("non-AC");
		vType.add("three-vehiler");

        a.add(lblvDriver);
        a.add(txtDriver);

		a.add(lblrNo);
		a.add(txtRno);

		a.add(lblvMdetails);
		a.add(txtMdetails);

		a.add(lblkms);
		a.add(txtKms);

		a.add(lblsCap);
		a.add(seatCap);
		seatCap.add("3");
		seatCap.add("4");
		seatCap.add("5");

		a.add(bEnter);
		a.add(bClear);

		add(a);

		setVisible(true);
	}

	public static void main(String args[]){
		administrator a = new administrator();
	}
}