package calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {

	// Components of the Form
	private Container c;
//main shipping	
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
	private JLabel res;

// inches to pounds

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
// kg to pounds
	private JLabel title3;
	private JLabel kg;
	private JTextField tkg;
	private JButton sub3;
	private JButton reset3;
	private JLabel res3;

// quality analysis

	private JLabel title4;
	private JLabel dwei;
	private JTextField tdwei;

	private JLabel wei;
	private JTextField twei;
	private JLabel amz;
	private JTextField tamz;

	private JButton sub4;
	private JButton reset4;
	private JLabel res4;
//note	
	private JTextArea tout;

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
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);

//main shipping	

		title = new JLabel("SHIPPING FINDER:");
		title.setFont(new Font("Arial", Font.PLAIN, 20));
		title.setSize(300, 30);
		title.setLocation(100, 20);
		c.add(title);

		weight = new JLabel("Weight(pounds)");
		weight.setFont(new Font("Arial", Font.PLAIN, 18));
		weight.setSize(200, 25);
		weight.setLocation(100, 60);
		c.add(weight);

		num1 = new JTextField();
		num1.setFont(new Font("Arial", Font.PLAIN, 15));
		num1.setSize(80, 25);
		num1.setLocation(350, 60);
		c.add(num1);

		cart = new JLabel("No. of Items in Cart");
		cart.setFont(new Font("Arial", Font.PLAIN, 18));
		cart.setSize(200, 25);
		cart.setLocation(100, 100);
		c.add(cart);

		num3 = new JTextField();
		num3.setFont(new Font("Arial", Font.PLAIN, 15));
		num3.setSize(80, 25);
		num3.setLocation(350, 100);
		c.add(num3);

		prime = new JLabel("Any Non-Prime item?");
		prime.setFont(new Font("Arial", Font.PLAIN, 18));
		prime.setSize(250, 25);
		prime.setLocation(100, 140);
		c.add(prime);

		nonprime = new JComboBox(nonprimes);
		nonprime.setFont(new Font("Arial", Font.PLAIN, 15));
		nonprime.setSize(75, 25);
		nonprime.setLocation(350, 140);
		c.add(nonprime);

		country = new JLabel("Country");
		country.setFont(new Font("Arial", Font.PLAIN, 18));
		country.setSize(100, 25);
		country.setLocation(100, 180);
		c.add(country);

		num2 = new JComboBox(countrys);
		num2.setFont(new Font("Arial", Font.PLAIN, 15));
		num2.setSize(125, 25);
		num2.setLocation(200, 180);
		c.add(num2);

		store = new JLabel("Store");
		store.setFont(new Font("Arial", Font.PLAIN, 18));
		store.setSize(100, 25);
		store.setLocation(100, 220);
		c.add(store);

		stores = new JComboBox(str);
		stores.setFont(new Font("Arial", Font.PLAIN, 15));
		stores.setSize(50, 25);
		stores.setLocation(200, 220);
		c.add(stores);

		shipping = new JLabel("Shipping Method");
		shipping.setFont(new Font("Arial", Font.PLAIN, 18));
		shipping.setSize(200, 25);
		shipping.setLocation(100, 260);
		c.add(shipping);

		shippingtype = new JComboBox(ship);
		shippingtype.setFont(new Font("Arial", Font.PLAIN, 15));
		shippingtype.setSize(100, 20);
		shippingtype.setLocation(300, 260);
		c.add(shippingtype);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 300);
		sub.addActionListener(b1Event);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 300);
		reset.addActionListener(b1Event);
		c.add(reset);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(125, 335);
		c.add(res);

		setVisible(true);

// inches to pounds

		title2 = new JLabel("Inches to Pounds:");
		title2.setFont(new Font("Arial", Font.PLAIN, 20));
		title2.setSize(300, 20);
		title2.setLocation(550, 20);
		c.add(title2);

		length = new JLabel("L");
		length.setFont(new Font("Arial", Font.PLAIN, 18));
		length.setSize(50, 25);
		length.setLocation(550, 60);
		c.add(length);

		tlength = new JTextField();
		tlength.setFont(new Font("Arial", Font.PLAIN, 15));
		tlength.setSize(50, 25);
		tlength.setLocation(575, 60);
		c.add(tlength);

		bredth = new JLabel("B");
		bredth.setFont(new Font("Arial", Font.PLAIN, 18));
		bredth.setSize(50, 25);
		bredth.setLocation(635, 60);
		c.add(bredth);

		tbredth = new JTextField();
		tbredth.setFont(new Font("Arial", Font.PLAIN, 15));
		tbredth.setSize(50, 25);
		tbredth.setLocation(660, 60);
		c.add(tbredth);

		height = new JLabel("H");
		height.setFont(new Font("Arial", Font.PLAIN, 18));
		height.setSize(50, 25);
		height.setLocation(720, 60);
		c.add(height);

		theight = new JTextField();
		theight.setFont(new Font("Arial", Font.PLAIN, 15));
		theight.setSize(50, 25);
		theight.setLocation(745, 60);
		c.add(theight);

		sub2 = new JButton("Submit");
		sub2.setFont(new Font("Arial", Font.PLAIN, 15));
		sub2.setSize(90, 20);
		sub2.setLocation(575, 100);
		sub2.addActionListener(b2Event);
		c.add(sub2);

		reset2 = new JButton("Reset");
		reset2.setFont(new Font("Arial", Font.PLAIN, 15));
		reset2.setSize(90, 20);
		reset2.setLocation(675, 100);
		reset2.addActionListener(b2Event);
		c.add(reset2);

		res2 = new JLabel("");
		res2.setFont(new Font("Arial", Font.PLAIN, 20));
		res2.setSize(500, 25);
		res2.setLocation(550, 125);
		c.add(res2);

		setVisible(true);

// kg to pounds

		title3 = new JLabel("Kg to Pounds:");
		title3.setFont(new Font("Arial", Font.PLAIN, 20));
		title3.setSize(300, 25);
		title3.setLocation(550, 180);
		c.add(title3);

		kg = new JLabel("Kg");
		kg.setFont(new Font("Arial", Font.PLAIN, 18));
		kg.setSize(50, 25);
		kg.setLocation(550, 220);
		c.add(kg);

		tkg = new JTextField();
		tkg.setFont(new Font("Arial", Font.PLAIN, 15));
		tkg.setSize(50, 25);
		tkg.setLocation(585, 220);
		c.add(tkg);

		sub3 = new JButton("Submit");
		sub3.setFont(new Font("Arial", Font.PLAIN, 15));
		sub3.setSize(90, 20);
		sub3.setLocation(575, 260);
		sub3.addActionListener(b3Event);
		c.add(sub3);

		reset3 = new JButton("Reset");
		reset3.setFont(new Font("Arial", Font.PLAIN, 15));
		reset3.setSize(90, 20);
		reset3.setLocation(675, 260);
		reset3.addActionListener(b3Event);
		c.add(reset3);

		res3 = new JLabel("");
		res3.setFont(new Font("Arial", Font.PLAIN, 20));
		res3.setSize(500, 25);
		res3.setLocation(550, 295);
		c.add(res3);

		setVisible(true);

// operation analysis

		title4 = new JLabel("Operation Analysis:");
		title4.setFont(new Font("Arial", Font.PLAIN, 20));
		title4.setSize(300, 25);
		title4.setLocation(550, 330);
		c.add(title4);

		dwei = new JLabel("Dimentional(Weight)");
		dwei.setFont(new Font("Arial", Font.PLAIN, 18));
		dwei.setSize(250, 25);
		dwei.setLocation(550, 370);
		c.add(dwei);

		tdwei = new JTextField();
		tdwei.setFont(new Font("Arial", Font.PLAIN, 15));
		tdwei.setSize(70, 25);
		tdwei.setLocation(750, 370);
		c.add(tdwei);

		wei = new JLabel("Weight");
		wei.setFont(new Font("Arial", Font.PLAIN, 18));
		wei.setSize(100, 25);
		wei.setLocation(550, 410);
		c.add(wei);

		twei = new JTextField();
		twei.setFont(new Font("Arial", Font.PLAIN, 15));
		twei.setSize(75, 25);
		twei.setLocation(550, 440);
		c.add(twei);

		amz = new JLabel("Price(Amazon)");
		amz.setFont(new Font("Arial", Font.PLAIN, 18));
		amz.setSize(150, 25);
		amz.setLocation(700, 410);
		c.add(amz);

		tamz = new JTextField();
		tamz.setFont(new Font("Arial", Font.PLAIN, 15));
		tamz.setSize(75, 25);
		tamz.setLocation(700, 440);
		c.add(tamz);

		sub4 = new JButton("Submit");
		sub4.setFont(new Font("Arial", Font.PLAIN, 15));
		sub4.setSize(90, 20);
		sub4.setLocation(575, 480);
		sub4.addActionListener(b4Event);
		c.add(sub4);

		reset4 = new JButton("Reset");
		reset4.setFont(new Font("Arial", Font.PLAIN, 15));
		reset4.setSize(90, 20);
		reset4.setLocation(675, 480);
		reset4.addActionListener(b4Event);
		c.add(reset4);

		res4 = new JLabel("");
		res4.setFont(new Font("Arial", Font.PLAIN, 11));
		res4.setSize(500, 25);
		res4.setLocation(475, 515);
		c.add(res4);

		setVisible(true);

// note

		tout = new JTextArea(
				"*NOTE* 1. IF items have eau de, parfum,Perfume,edp,edt,spray,Rogaine,Rust oleum,paint,par-feme,body mist,fragrance mist,cologne,nail polish keywords in name then add 18$ in shipping price.                   2. If items have battery,batteries,li ion,li-ion, lithium ion, lithium metal,corrosive,flammable,aerosol,hazardous,hazard,rust oleum,paint,Co2,Pistol keywords in name then add 20$ in shipping price.");
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(350, 250);
		tout.setLocation(100, 390);
		tout.setLineWrap(true);
		tout.setEditable(true);
		c.add(tout);

	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly

	double y;
	double z;
	double sum = 0;
	double china;
	double v;
	double g;
	double f;
	double j;

	ActionListener b1Event = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			String text = num1.getText();
			double nnum1 = Double.parseDouble(text);
			String nnum2 = (String) num2.getSelectedItem();
			String sshippingtype = (String) shippingtype.getSelectedItem();
			String sstores = (String) stores.getSelectedItem();

			if (e.getSource() == sub) {
				if (nnum2.equals("kuwait")) {

					if (sshippingtype.equals("5-9 days")) {
						if (sstores.equals("us")) {

							y = (nnum1 - 1) * 2.5 + 9;
							y = Math.ceil(y);
							Margine();
							z = z + 1;
						} else if (sstores.equals("uk")) {

							y = (nnum1 - 1) * 2.5 + 9 + 5;
							y = Math.ceil(y);
							Margine();
							z = z + 1;
						} else if (sstores.equals("hk")) {

							china = (nnum1 - 1) * 2.5 + 9;
							china = Math.ceil(china);
							y = (china * .15) + china;
							y = Math.ceil(y);
							Margine();
							z = z + 1;
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
							y = Math.ceil(y);
							Margine();
							z = z + 1;
						} else if (sstores.equals("uk")) {

							y = (nnum1 - 1) * 3 + 12 + 5;
							y = Math.ceil(y);
							Margine();
							z = z + 1;
						} else if (sstores.equals("hk")) {

							china = (nnum1 - 1) * 3 + 12;
							china = Math.ceil(china);
							y = (china * .15) + china;
							y = Math.ceil(y);
							Margine();
							z = z + 1;
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
							y = Math.ceil(y);
							Margine();
							z = z + 1;
						} else if (sstores.equals("uk")) {

							y = (nnum1 - 1) * 3 + 15 + 5;
							y = Math.ceil(y);
							Margine();
							z = z + 1;
						} else if (sstores.equals("hk")) {

							china = (nnum1 - 1) * 3 + 15;
							china = Math.ceil(china);
							y = (china * .15) + china;
							y = Math.ceil(y);
							Margine();
							z = z + 1;
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

//inches to pounds

	ActionListener b2Event = new ActionListener() {

		public void actionPerformed(ActionEvent t) {

			String text2 = tlength.getText();

			double ttlength = Double.parseDouble(text2);
			ttlength = Math.ceil(ttlength);

			String text3 = tbredth.getText();
			double ttbredth = Double.parseDouble(text3);
			ttbredth = Math.ceil(ttbredth);

			String text4 = theight.getText();
			double ttheight = Double.parseDouble(text4);
			ttheight = Math.ceil(ttheight);

			if (t.getSource() == sub2) {
				v = ttlength * ttbredth * ttheight / 166;
				v = Math.ceil(v);
				res2.setText("Weight(Pounds)" + v);
			} else if (t.getSource() == reset2) {
				String f = "";
				tlength.setText(f);
				tbredth.setText(f);
				theight.setText(f);

				res2.setText(f);
			}
		}
	};

//kg to pounds	

	ActionListener b3Event = new ActionListener() {

		public void actionPerformed(ActionEvent w) {

			String text5 = tkg.getText();
			double ttkg = Double.parseDouble(text5);

			if (w.getSource() == sub3) {
				g = ttkg * 2.205;
				g = Math.ceil(g);
				res3.setText("Weight(Pounds)" + g);
			} else if (w.getSource() == reset3) {
				String p = "";
				tkg.setText(p);
				res3.setText(p);
			}

		}

	};

//quality analysis

	ActionListener b4Event = new ActionListener() {

		public void actionPerformed(ActionEvent z) {

			String text6 = tdwei.getText();
			double ttdwei = Double.parseDouble(text6);

			String text7 = twei.getText();
			double ttwei = Double.parseDouble(text7);

			String text8 = tamz.getText();
			double ttamz = Double.parseDouble(text8);

			if (z.getSource() == sub4) {

				if (ttamz < 26) {

					f = 5 * ttwei;
					if (f < ttdwei) {

						res4.setText("New Weight(Pounds)" + f);

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz >= 26 && ttamz <= 50) {

					f = 5 * ttwei;
					if (f < ttdwei) {

						f = f + 3;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $10 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 50 && ttamz < 76) {
					f = ttwei * 4;
					if (f < ttdwei) {

						f = f + 5;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $15 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz >= 76 && ttamz <= 80) {
					f = ttwei * 4;
					if (f < ttdwei) {

						f = f + 6;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $20 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 80 && ttamz <= 100) {
					f = ttwei * 4;
					if (f < ttdwei) {

						f = f + 10;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $25 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 100 && ttamz <= 125) {
					f = ttwei * 3;
					if (f < ttdwei) {

						f = f + 13;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $30 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 125 && ttamz <= 150) {
					f = ttwei * 3;
					if (f < ttdwei) {

						f = f + 16;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $30 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 150 && ttamz <= 200) {
					f = ttwei * 3;
					if (f < ttdwei) {

						f = f + 20;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $30 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 200 && ttamz <= 300) {
					f = ttwei * 3;
					if (f < ttdwei) {

						f = f + 30;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $30 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 300 && ttamz <= 500) {
					f = ttwei * 2.5;
					if (f < ttdwei) {

						f = f + 25;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $50 in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 500 && ttamz <= 1000) {
					f = ttwei * 2.5;
					if (f < ttdwei) {
						j = ttamz * .05;
						j = j + 50;
						res4.setText("New Weight(Pounds)" + f + ",Add extra " + j + " product price in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 1000 && ttamz <= 2000) {
					f = ttwei * 2.5;
					if (f < ttdwei) {
						j = ttamz * .06;
						j = j + 50;
						res4.setText("New Weight(Pounds)" + f + ",Add extra " + j + " product price in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 2000 && ttamz <= 5000) {
					f = ttwei * 2.5;
					if (f < ttdwei) {
						j = ttamz * .06;
						j = j + 100;
						res4.setText("New Weight(Pounds)" + f + ",Add extra " + j + " product price in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				}

			} else if (z.getSource() == reset4) {

				String m = "";
				tdwei.setText(m);
				twei.setText(m);
				tamz.setText(m);
				res4.setText(m);
			}

		}

	};

//margine method to call 

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