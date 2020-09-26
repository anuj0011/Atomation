package calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame
{

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel weight;
	private JTextField num1;
	private JLabel cart;
	private JTextField num3;

	private JLabel prime;
	private JComboBox nonprime;

	private ButtonGroup gengp;

	private JLabel country;
	private JComboBox num2;

	private JLabel store;
	private JComboBox stores;

	private JLabel shipping;
	private JComboBox shippingtype;

	private JButton sub;
	private JButton reset;
	
	
	
	private JLabel title2;
	private JLabel length;
	private JTextField tlength;
	private JLabel bredth;
	private JTextField tbredth;
	private JLabel height;
	private JTextField theight;
	private JButton sub2;
	private JButton reset2;
	private JLabel res2;
	
	
	
	private JTextArea tout;
	private JLabel res;
	

	private String nonprimes[] = { "yes", "no" };

	private String countrys[] = { "kuwait", "uae", "saudi", "oman", "bahrain", "qatar", "OTHER" };

	private String str[] = { "us", "uk", "hk" };

	private String ship[] = { "5-9 days", "3-6 days" };

	// constructor, to initialize the components
	// with default values.
	public MyFrame() {
		setTitle("UBUY TOOLS");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("SHIPPING FINDER");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		weight = new JLabel("Weight(pounds)");
		weight.setFont(new Font("Arial", Font.PLAIN, 20));
		weight.setSize(200, 25);
		weight.setLocation(100, 100);
		c.add(weight);

		num1 = new JTextField();
		num1.setFont(new Font("Arial", Font.PLAIN, 15));
		num1.setSize(80, 25);
		num1.setLocation(350, 100);
		c.add(num1);

		cart = new JLabel("No. of Items in Cart");
		cart.setFont(new Font("Arial", Font.PLAIN, 20));
		cart.setSize(200, 25);
		cart.setLocation(100, 150);
		c.add(cart);

		num3 = new JTextField();
		num3.setFont(new Font("Arial", Font.PLAIN, 15));
		num3.setSize(80, 25);
		num3.setLocation(350, 150);
		c.add(num3);

		prime = new JLabel("Any Non-Prime item?");
		prime.setFont(new Font("Arial", Font.PLAIN, 20));
		prime.setSize(250, 25);
		prime.setLocation(100, 200);
		c.add(prime);

		nonprime = new JComboBox(nonprimes);
		nonprime.setFont(new Font("Arial", Font.PLAIN, 15));
		nonprime.setSize(75, 25);
		nonprime.setLocation(350, 200);
		c.add(nonprime);

		country = new JLabel("Country");
		country.setFont(new Font("Arial", Font.PLAIN, 20));
		country.setSize(100, 25);
		country.setLocation(100, 250);
		c.add(country);

		num2 = new JComboBox(countrys);
		num2.setFont(new Font("Arial", Font.PLAIN, 15));
		num2.setSize(125, 25);
		num2.setLocation(200, 250);
		c.add(num2);

		store = new JLabel("Store");
		store.setFont(new Font("Arial", Font.PLAIN, 20));
		store.setSize(100, 25);
		store.setLocation(100, 300);
		c.add(store);

		stores = new JComboBox(str);
		stores.setFont(new Font("Arial", Font.PLAIN, 15));
		stores.setSize(50, 25);
		stores.setLocation(200, 300);
		c.add(stores);

		shipping = new JLabel("Shipping Method");
		shipping.setFont(new Font("Arial", Font.PLAIN, 20));
		shipping.setSize(200, 25);
		shipping.setLocation(100, 350);
		c.add(shipping);

		shippingtype = new JComboBox(ship);
		shippingtype.setFont(new Font("Arial", Font.PLAIN, 15));
		shippingtype.setSize(100, 20);
		shippingtype.setLocation(300, 350);
		c.add(shippingtype);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(b1Event);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(b1Event);
		c.add(reset);

		
		title2 = new JLabel("Inches to Pounds:");
		title2.setFont(new Font("Arial", Font.PLAIN, 20));
		title2.setSize(300, 20);
		title2.setLocation(550, 100);
		c.add(title2);
		
		
		length = new JLabel("L");
		length.setFont(new Font("Arial", Font.PLAIN, 20));
		length.setSize(50, 25);
		length.setLocation(550, 150);
		c.add(length);

		tlength = new JTextField();
		tlength.setFont(new Font("Arial", Font.PLAIN, 15));
		tlength.setSize(50, 25);
		tlength.setLocation(575, 150);
		c.add(tlength);
		
		bredth = new JLabel("B");
		bredth.setFont(new Font("Arial", Font.PLAIN, 20));
		bredth.setSize(50, 25);
		bredth.setLocation(635, 150);
		c.add(bredth);

		tbredth = new JTextField();
		tbredth.setFont(new Font("Arial", Font.PLAIN, 15));
		tbredth.setSize(50, 25);
		tbredth.setLocation(660, 150);
		c.add(tbredth);
		
		height = new JLabel("H");
		height.setFont(new Font("Arial", Font.PLAIN, 20));
		height.setSize(50, 25);
		height.setLocation(720, 150);
		c.add(height);

		theight = new JTextField();
		theight.setFont(new Font("Arial", Font.PLAIN, 15));
		theight.setSize(50, 25);
		theight.setLocation(745, 150);
		c.add(theight);
		
		sub2 = new JButton("Submit");
		sub2.setFont(new Font("Arial", Font.PLAIN, 15));
		sub2.setSize(90, 20);
		sub2.setLocation(575, 200);
		sub2.addActionListener(b2Event);
		c.add(sub2);

		reset2 = new JButton("Reset");
		reset2.setFont(new Font("Arial", Font.PLAIN, 15));
		reset2.setSize(90, 20);
		reset2.setLocation(675, 200);
		reset2.addActionListener(b2Event);
		c.add(reset2);
		
		res2 = new JLabel("");
		res2.setFont(new Font("Arial", Font.PLAIN, 20));
		res2.setSize(500, 25);
		res2.setLocation(550, 225);
		c.add(res2);

		setVisible(true);
		
		
		tout = new JTextArea("*NOTE*                                                       1. IF items have eau de, parfum,Perfume,edp,edt,spray,Rogaine,Rust oleum,paint,par-feme,body mist,fragrance mist,cologne,nail polish keywords in name then add 18$ in shipping price.                   2. If items have battery,batteries,li ion,li-ion, lithium ion, lithium metal,corrosive,flammable,aerosol,hazardous,hazard,rust oleum,paint,Co2,Pistol keywords in name then add 20$ in shipping price.");
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 200);
		tout.setLocation(575, 350);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly

	double y;
	double z;
	double sum = 0;
	double china;
	double v;
	
	ActionListener b1Event = new ActionListener() {

	public void actionPerformed(ActionEvent e) {

		String text = num1.getText();
		int nnum1 = Integer.parseInt(text);
		String nnum2 = (String) num2.getSelectedItem();
		String sshippingtype = (String) shippingtype.getSelectedItem();
		String sstores = (String) stores.getSelectedItem();

		if (e.getSource() == sub) {
			if (nnum2.equals("kuwait")) {

				if (sshippingtype.equals("5-9 days")) {
					if (sstores.equals("us")) {

						y = (nnum1 - 1) * 2.5 + 9;
						y = Math.ceil(y) + 1;
						Margine();
					} else if (sstores.equals("uk")) {

						y = (nnum1 - 1) * 2.5 + 9 + 5;
						y = Math.ceil(y) + 1;
						Margine();
					} else if (sstores.equals("hk")) {

						china = (nnum1 - 1) * 2.5 + 9;
						china = Math.ceil(china);
						y = (china * .15) + china;
						y = Math.ceil(y) + 1;
						Margine();
					}
				} else {
					if (sstores.equals("us")) {

						y = (nnum1 - 1) * 2.5 + 9;
						y = Math.ceil(y);
						Margine();
						z = (z * .05) + z + 3;
						z = Math.ceil(z);
					} else if (sstores.equals("uk")) {

						y = (nnum1 - 1) * 2.5 + 9 + 5;
						y = Math.ceil(y);
						Margine();
						z = (z * .05) + z + 3;
						z = Math.ceil(z);

					} else if (sstores.equals("hk")) {

						china = (nnum1 - 1) * 2.5 + 9;
						china = Math.ceil(china);
						y = (china * .15) + china;
						y = Math.ceil(y);
						Margine();
						z = (z * .05) + z + 3;
						z = Math.ceil(z);
					}
				}

			}

			else if (nnum2.equals("oman") || (nnum2.equals("saudi")
					|| (nnum2.equals("uae") || (nnum2.equals("qatar") || (nnum2.equals("bahrain")))))) {

				if (sshippingtype.equals("5-9 days")) {
					if (sstores.equals("us")) {

						y = (nnum1 - 1) * 3 + 12;
						y = Math.ceil(y) + 1;
						Margine();
					} else if (sstores.equals("uk")) {

						y = (nnum1 - 1) * 3 + 12 + 5;
						y = Math.ceil(y) + 1;
						Margine();
					} else if (sstores.equals("hk")) {

						china = (nnum1 - 1) * 3 + 12;
						china = Math.ceil(china);
						y = (china * .15) + china;
						y = Math.ceil(y) + 1;
						Margine();

					}
				} else {
					if (sstores.equals("us")) {

						y = (nnum1 - 1) * 3 + 12;
						y = Math.ceil(y);
						Margine();
						z = (z * .15) + z + 5;
						z = Math.ceil(z);
					} else if (sstores.equals("uk")) {

						y = (nnum1 - 1) * 3 + 12 + 5;
						y = Math.ceil(y);
						Margine();
						z = (z * .15) + z + 5;
						z = Math.ceil(z);
					} else if (sstores.equals("hk")) {

						china = (nnum1 - 1) * 3 + 12;
						china = Math.ceil(china);
						y = (china * .15) + china;
						y = Math.ceil(y);
						Margine();
						z = (z * .15) + z + 5;
						z = Math.ceil(z);

					}
				}

			} else {

				if (sshippingtype.equals("5-9 days")) {
					if (sstores.equals("us")) {

						y = (nnum1 - 1) * 3 + 15;
						y = Math.ceil(y) + 1;
						Margine();
					} else if (sstores.equals("uk")) {

						y = (nnum1 - 1) * 3 + 15 + 5;
						y = Math.ceil(y) + 1;
						Margine();
					} else if (sstores.equals("hk")) {

						china = (nnum1 - 1) * 3 + 15;
						china = Math.ceil(china);
						y = (china * .15) + china;
						y = Math.ceil(y) + 1;
						Margine();
					}
				} else {

					if (sstores.equals("us")) {

						y = (nnum1 - 1) * 3 + 15;
						y = Math.ceil(y);
						Margine();
						z = (z * .25) + z + 5;
						z = Math.ceil(z);
					} else if (sstores.equals("uk")) {

						y = (nnum1 - 1) * 3 + 15 + 5;
						y = Math.ceil(y);
						Margine();
						z = (z * .25) + z + 5;
						z = Math.ceil(z);
					} else if (sstores.equals("hk")) {

						china = (nnum1 - 1) * 3 + 15;
						china = Math.ceil(china);
						y = (china * .15) + china;
						y = Math.ceil(y);
						Margine();
						z = (z * .25) + z + 5;
						z = Math.ceil(z);
					}

				}
			}

			res.setText("Shipping Price($)" + z);
		}

		else if (e.getSource() == reset) {
			String def = "";
			num1.setText(def);
			num3.setText(def);

			num2.setSelectedIndex(0);
			shippingtype.setSelectedIndex(0);
			stores.setSelectedIndex(0);
			nonprime.setSelectedIndex(0);
			res.setText(def);
		}

	}
	};
	ActionListener b2Event = new ActionListener() {

	public void actionPerformed(ActionEvent t) {
		
		String text2 = tlength.getText();
		
		double ttlength = Integer.parseInt(text2);
		
		String text3 = tbredth.getText();
		double ttbredth = Integer.parseInt(text3);
		
		String text4 = theight.getText();
		double ttheight = Integer.parseInt(text4);
		
		if (t.getSource() == sub2) {
			v = ttlength*ttbredth*ttheight/166;
			v = Math.ceil(v);
			res2.setText("Weight(Pounds)" + v);
		}
		else if (t.getSource() == reset2) {
			String f = "";
			tlength.setText(f);
			tbredth.setText(f);
			theight.setText(f);
			
			res2.setText(f);
		}

		
	}
	
	};
	
	public void Margine() {
		String text2 = num3.getText();
		int nnum3 = Integer.parseInt(text2);

		String nnonprime = (String) nonprime.getSelectedItem();
		if (y <= 20) {

			sum = (y * .20) + y;
			sum = Math.ceil(sum);
		} else if (y > 20 && y <= 70) {
			sum = (y * .15) + y;
			sum = Math.ceil(sum);

		} else if (y > 70 && y <= 100) {
			sum = (y * .10) + y;
			sum = Math.ceil(sum);

		} else if (y > 100 && y <= 300) {
			sum = (y * .08) + y;
			sum = Math.ceil(sum);

		} else {
			sum = (y * .05) + y;
			sum = Math.ceil(sum);
		}

		if (nnum3 == 2) {
			if (nnonprime.equals("yes")) {
				z = sum + 2;
			} else {
				z = sum + 1;
			}

		} else if (nnum3 == 1) {
			if (nnonprime.equals("yes")) {
				z = sum;
			} else {
				z = sum;
			}
		} else if (nnum3 == 3) {
			if (nnonprime.equals("yes")) {
				z = sum + 3;
			} else {
				z = sum + 2;
			}
		} else if (nnum3 > 3 && nnum3 < 10) {
			if (nnonprime.equals("yes")) {
				z = (nnum3 * 2) + sum;
			} else {
				z = (nnum3 * 1) + sum;
			}
		} else if (nnum3 >= 10) {
			if (nnonprime.equals("yes")) {
				z = (nnum3 * 3) + sum;
			} else {
				z = (nnum3 * 2) + sum;
			}
		}

	}

// Driver Code 
}


public class Ubuyshipping {
	public static void main(String[] args) throws Exception {
		MyFrame f = new MyFrame();

	}

}