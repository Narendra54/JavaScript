import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class adminitrator extends Frame implements ActionListener{
	Label lblvType,lblvDriver,lblrNo,lblvMdetails,lblkms,lblsCap;
	TextField txtDriver,txtRno,txtMdetails,txtKms;
	Choice vType,seatCap;
	Button bEnter,bClear,bAddStn,bStatus;
    private PreparedStatement pst;

	public adminitrator(){
                
		setTitle("Cap Vehicle Administrator");
		setBounds(100,100,400,400);
                setBackground(Color.CYAN);
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

//**** creating boxes
		bEnter = new Button("ENTER");
		bClear = new Button("CLEAR");
                bAddStn = new Button("ADD STATION");
                bStatus = new Button("SEE STATUS");

//**** creating layout for panel

		GridLayout g = new GridLayout(8,2);
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
                a.add(bAddStn);
                a.add(bStatus);

		add(a);


		setVisible(true);

  /****  Adding AAction listening of buttons  ****/

                bEnter.addActionListener(this);
                bClear.addActionListener(this);
                bAddStn.addActionListener(this);
              //  bClear.addActionListener(this);
                
	}

  /****  Main method  ****/
              //  public static void main(String args[]){
	//	adminitrator a = new adminitrator();
          //     }

  /**** Adding response of different buttons  ****/
                public void actionPerformed(ActionEvent e) {
                       if(e.getSource()==bEnter){

  /**** pressing enter will first add to the table Administrator and then will show of JTable ****/
                            cabInformation cabInfo = new cabInformation();
                            cabInfo.update_dataBase(this);
                            cabInfo.update_table();
                       }
                       else if(e.getSource()==bClear){

  /**** pressing clear will make all entries set to initial state  ****/
                           vType.select("AC");
                           txtDriver.setText(null);
                           txtRno.setText(null);
                           txtMdetails.setText(null);
                           txtKms.setText(null);
                           seatCap.select("3");


                       }
                       else if(e.getSource()==bAddStn){
                             new map();

            
            
            
                       }
                       else if(e.getSource()==bStatus){
                           status caBInfo = new status();
                           //caBInfo.update_dataBase(this);
                           caBInfo.update_table();
                       }
                       //else if(e.getSource())
        }
}