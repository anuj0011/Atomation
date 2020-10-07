package calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {

	// Components of the Form
	private Container c;

//shipping	Finder

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

	private String nonprimes[] = { "yes", "no" };

	private String countrys[] = { "kuwait", "uae", "saudi", "oman", "bahrain", "qatar", "OTHER" };

	private String str[] = { "us", "uk", "hk" };

	private String ship[] = { "5-9 days", "3-6 days" };

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

// Price Finder

	private JLabel title5;
	private JLabel pric;
	private JTextField tpric;
	private JLabel st;
	private JComboBox tst;
	private JLabel que;
	private JComboBox tque;
	private JButton sub5;
	private JButton reset5;
	private JLabel res5;

	private String sts[] = { "US", "UK", "HK", "Ebay/Walmart" };
	private String avail[] = { "Yes", "No" };

// Customs Finder

	private JLabel title6;
	private JLabel price;
	private JTextField tprice;
	private JLabel shipp;
	private JTextField tshipp;
	private JLabel cntry;
	private JComboBox tcntry;
	private JButton sub6;
	private JButton reset6;
	private JLabel res6;

	private String cntrys[] = { "Kuwait", "Qatar", "Saudi Arabia", "UAE", "Bahrain", "Egypt", "Oman", "Turkey",
			"Singapore", "Australia", "Malaysia", "Russia", "Brazil", "SouthAfrica", "Morocco", "Lebanon", "Jordan",
			"NewZealand", "India", "Chile", "USA", "Argentina", "Austria", "Italy", "Belgium", "Philippines", "Germany",
			"Japan", "Mexico", "Netherlands", "Colombia", "Indonesia", "Spain", "Switzerland", "CzechRepublic",
			"Denmark", "Norway", "Poland", "Portugal", "France", "Ireland", "Canada", "UK", "Taiwan", "Vietnam",
			"SouthKorea", "Israel", "Sweden", "Thailand", "Ukraine", "HongKong", "China", "Finland", "Iceland",
			"Maldives", "Peru", "Hungary", "Iran", "Algeria", "Angola", "Bangladesh", "Belarus", "Cambodia", "Cameroon",
			"CostaRica", "CotedIvoire", "DominicanRepublic", "Ecuador", "ElSalvador", "Ethiopia", "Georgia", "Ghana",
			"Greece", "Guatemala", "Kazakhstan", "Kenya", "Madagascar", "Mauritius", "Mozambique", "Myanmar", "Nepal",
			"Nicaragua", "Nigeria", "Pakistan", "Panama", "Paraguay", "PuertoRico", "Romania", "Senegal", "Slovakia",
			"SriLanka", "Tanzania", "Tunisia", "Uganda", "Uzbekistan", "Venezuela", "Zambia", "Zimbabwe" };

//note	
	private JTextArea tout;

	// constructor, to initialize the components
	// with default values.
	public MyFrame() {
		setTitle("UBUY TOOLS");
		setBounds(300, 90, 1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);

// Shipping	Finder

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

		title2 = new JLabel("INCHES TO POUNDS:");
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

		title3 = new JLabel("KG TO POUNDS:");
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

		title4 = new JLabel("OPERATION ANALYSIS:");
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
		res4.setLocation(550, 515);
		c.add(res4);

		setVisible(true);

// Price Finder

		title5 = new JLabel("PRICE FINDER:");
		title5.setFont(new Font("Arial", Font.PLAIN, 20));
		title5.setSize(300, 30);
		title5.setLocation(925, 20);
		c.add(title5);

		pric = new JLabel("Amazon Price");
		pric.setFont(new Font("Arial", Font.PLAIN, 18));
		pric.setSize(200, 25);
		pric.setLocation(925, 60);
		c.add(pric);

		tpric = new JTextField();
		tpric.setFont(new Font("Arial", Font.PLAIN, 15));
		tpric.setSize(80, 25);
		tpric.setLocation(1050, 60);
		c.add(tpric);

		st = new JLabel("Store");
		st.setFont(new Font("Arial", Font.PLAIN, 18));
		st.setSize(250, 25);
		st.setLocation(925, 100);
		c.add(st);

		tst = new JComboBox(sts);
		tst.setFont(new Font("Arial", Font.PLAIN, 15));
		tst.setSize(125, 25);
		tst.setLocation(1050, 100);
		c.add(tst);

		que = new JLabel("Shipping/Dimension/Weight Available?");
		que.setFont(new Font("Arial", Font.PLAIN, 15));
		que.setSize(300, 25);
		que.setLocation(925, 140);
		c.add(que);

		tque = new JComboBox(avail);
		tque.setFont(new Font("Arial", Font.PLAIN, 15));
		tque.setSize(125, 25);
		tque.setLocation(1050, 165);
		c.add(tque);

		sub5 = new JButton("Submit");
		sub5.setFont(new Font("Arial", Font.PLAIN, 15));
		sub5.setSize(90, 20);
		sub5.setLocation(950, 205);
		sub5.addActionListener(b5Event);
		c.add(sub5);

		reset5 = new JButton("Reset");
		reset5.setFont(new Font("Arial", Font.PLAIN, 15));
		reset5.setSize(90, 20);
		reset5.setLocation(1050, 205);
		reset5.addActionListener(b5Event);
		c.add(reset5);

		res5 = new JLabel("");
		res5.setFont(new Font("Arial", Font.PLAIN, 20));
		res5.setSize(500, 25);
		res5.setLocation(925, 240);
		c.add(res5);

		setVisible(true);

// Customs Finder

		title6 = new JLabel("CUSTOMS FINDER:");
		title6.setFont(new Font("Arial", Font.PLAIN, 20));
		title6.setSize(300, 30);
		title6.setLocation(925, 280);
		c.add(title6);

		price = new JLabel("Price($)");
		price.setFont(new Font("Arial", Font.PLAIN, 18));
		price.setSize(200, 25);
		price.setLocation(925, 320);
		c.add(price);

		tprice = new JTextField();
		tprice.setFont(new Font("Arial", Font.PLAIN, 15));
		tprice.setSize(80, 25);
		tprice.setLocation(1050, 320);
		c.add(tprice);

		shipp = new JLabel("Shipping($)");
		shipp.setFont(new Font("Arial", Font.PLAIN, 18));
		shipp.setSize(200, 25);
		shipp.setLocation(925, 360);
		c.add(shipp);

		tshipp = new JTextField();
		tshipp.setFont(new Font("Arial", Font.PLAIN, 15));
		tshipp.setSize(80, 25);
		tshipp.setLocation(1050, 360);
		c.add(tshipp);

		cntry = new JLabel("Country");
		cntry.setFont(new Font("Arial", Font.PLAIN, 18));
		cntry.setSize(250, 25);
		cntry.setLocation(925, 400);
		c.add(cntry);

		tcntry = new JComboBox(cntrys);
		tcntry.setFont(new Font("Arial", Font.PLAIN, 15));
		tcntry.setSize(125, 25);
		tcntry.setLocation(1050, 400);
		c.add(tcntry);

		sub6 = new JButton("Submit");
		sub6.setFont(new Font("Arial", Font.PLAIN, 15));
		sub6.setSize(90, 20);
		sub6.setLocation(950, 440);
		sub6.addActionListener(b6Event);
		c.add(sub6);

		reset6 = new JButton("Reset");
		reset6.setFont(new Font("Arial", Font.PLAIN, 15));
		reset6.setSize(90, 20);
		reset6.setLocation(1050, 440);
		reset6.addActionListener(b6Event);
		c.add(reset6);

		res6 = new JLabel("");
		res6.setFont(new Font("Arial", Font.PLAIN, 20));
		res6.setSize(500, 25);
		res6.setLocation(925, 480);
		c.add(res6);

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
	double a;
	double cust;
// Shipping Finder

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

// inches to pounds

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

// kg to pounds	

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

// quality analysis

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
						res4.setText("New Weight(Pounds)" + f + ",Add extra $" + j + " in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 1000 && ttamz <= 2000) {
					f = ttwei * 2.5;
					if (f < ttdwei) {
						j = ttamz * .06;
						j = j + 50;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $" + j + " in shipping price");

					} else {
						res4.setText("Weight(Pounds)" + ttdwei);
					}

				} else if (ttamz > 2000 && ttamz <= 5000) {
					f = ttwei * 2.5;
					if (f < ttdwei) {
						j = ttamz * .06;
						j = j + 100;
						res4.setText("New Weight(Pounds)" + f + ",Add extra $" + j + " in shipping price");

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

// Price Finder

	ActionListener b5Event = new ActionListener() {

		public void actionPerformed(ActionEvent v) {
			double margine = .18;
			int fixed = 5;
			String text9 = tpric.getText();
			double ttpric = Double.parseDouble(text9);
			String sst = (String) tst.getSelectedItem();
			String qque = (String) tque.getSelectedItem();

			double ukttpric = ttpric * 1.5; // converting euro to usd for uk
			double ukmargine = .18;
			int ukfixed = 5;

			if (v.getSource() == sub5) {

				if (sst.equals("US")) {
					if (qque.equals("Yes")) {
						a = (ttpric * margine) + ttpric + fixed;
					} else {
						if (ttpric <= 175) {

							a = (ttpric * margine) + ttpric + 12 + fixed;

						} else {
							a = (ttpric + (ttpric / 2) + 11) * margine + ttpric + fixed;
						}
					}

				} else if (sst.equals("Ebay/Walmart")) {

					if (qque.equals("Yes")) {
						a = (ttpric * .22) + ttpric + 3;
					} else {

						a = (ttpric * .55) + ttpric + 3;
					}
				} else if (sst.equals("HK")) {

					a = (ttpric * .16) + ttpric + 10;

				} else if (sst.equals("UK")) {

					if (qque.equals("Yes")) {
						a = (ukttpric * ukmargine) + ukttpric + ukfixed;
					} else {
						if (ukttpric <= 175) {

							a = (ukttpric * ukmargine) + ukttpric + 12 + ukfixed;

						} else {
							a = (ukttpric + (ukttpric / 2) + 11) * ukmargine + ukttpric + ukfixed;
						}
					}
				}

				res5.setText("Ubuy Price ($)" + a);
			} else if (v.getSource() == reset5) {
				String d = "";
				tpric.setText(d);
				tst.setSelectedIndex(0);
				tque.setSelectedIndex(0);
				res5.setText(d);
			}

		}
	};

// Custom Finder

	ActionListener b6Event = new ActionListener() {

		public void actionPerformed(ActionEvent j) {
			String text10 = tprice.getText();
			double ttprice = Double.parseDouble(text10);
			String text11 = tshipp.getText();
			double ttshipp = Double.parseDouble(text11);
			String ttcntry = (String) tcntry.getSelectedItem();

			double tot = ttprice + ttshipp;

			if (j.getSource() == sub6) {
				if (ttcntry.equals("Kuwait")) {

					cust = tot * .08 + 10;

				}

				else if (ttcntry.equals("Qatar")) {

					cust = tot * .08 + 7;

				}

				else if (ttcntry.equals("Saudi Arabia")) {

					cust = tot * .20;

				}

				else if (ttcntry.equals("UAE")) {

					cust = tot * .10;

				}

				else if (ttcntry.equals("Bahrain")) {

					cust = tot * .06;

				}

				else if (ttcntry.equals("Egypt")) {

					cust = tot * .60 + 17;

				}

				else if (ttcntry.equals("Oman")) {

					cust = tot * .08;

				}

				else if (ttcntry.equals("Turkey")) {

					cust = tot * .20;

				}

				else if (ttcntry.equals("Singapore")) {

					cust = tot * .08;

				}

				else if (ttcntry.equals("Australia")) {

					cust = tot * .14;

				} else if (ttcntry.equals("Malaysia")) {

					cust = tot * .20;

				} else if (ttcntry.equals("Russia")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Brazil")) {

					cust = tot * .22;

				} else if (ttcntry.equals("SouthAfrica")) {

					cust = tot * .25;

				} else if (ttcntry.equals("Morocco")) {

					cust = tot * .30;

				} else if (ttcntry.equals("Lebanon")) {

					cust = tot * .17 + 3.5;

				} else if (ttcntry.equals("Jordan")) {

					cust = tot * .30;

				} else if (ttcntry.equals("NewZealand")) {

					cust = tot * .18;

				} else if (ttcntry.equals("India")) {

					cust = tot * .40;

				} else if (ttcntry.equals("Chile")) {

					cust = tot * .18;

				} else if (ttcntry.equals("USA")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Argentina")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Austria")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Italy")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Belgium")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Philippines")) {

					cust = tot * .10;

				} else if (ttcntry.equals("Germany")) {

					cust = tot * .13;

				} else if (ttcntry.equals("Japan")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Mexico")) {

					cust = tot * .10;

				} else if (ttcntry.equals("Netherlands")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Colombia")) {

					cust = tot * .24;

				} else if (ttcntry.equals("Indonesia")) {

					cust = tot * .20;

				} else if (ttcntry.equals("Spain")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Switzerland")) {

					cust = tot * .09;

				} else if (ttcntry.equals("CzechRepublic")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Denmark")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Norway")) {

					cust = tot * .28;

				} else if (ttcntry.equals("Poland")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Portugal")) {

					cust = tot * .10 + 14;

				} else if (ttcntry.equals("France")) {

					cust = tot * .20;

				} else if (ttcntry.equals("Ireland")) {

					cust = tot * .14;

				} else if (ttcntry.equals("Canada")) {

					cust = tot * .10;

				} else if (ttcntry.equals("UK")) {

					cust = tot * .20;

				} else if (ttcntry.equals("Taiwan")) {

					cust = tot * .10;

				} else if (ttcntry.equals("Vietnam")) {

					cust = tot * .20;

				} else if (ttcntry.equals("SouthKorea")) {

					cust = tot * .10;

				} else if (ttcntry.equals("Israel")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Sweden")) {

					cust = tot * .25;

				} else if (ttcntry.equals("Thailand")) {

					cust = tot * .30;

				} else if (ttcntry.equals("Ukraine")) {

					cust = tot * .15;

				} else if (ttcntry.equals("HongKong")) {

					cust = tot * .03;

				} else if (ttcntry.equals("China")) {

					cust = tot * .15;

				} else if (ttcntry.equals("Finland")) {

					cust = tot * .15;

				} else if (ttcntry.equals("Iceland")) {

					cust = tot * .15;

				} else if (ttcntry.equals("Maldives")) {

					cust = tot * .20;

				} else if (ttcntry.equals("Peru")) {

					cust = tot * .25;

				} else if (ttcntry.equals("Hungary")) {

					cust = tot * .35;

				} else if (ttcntry.equals("Iran")) {

					cust = tot * .100;

				} else if (ttcntry.equals("Algeria")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Angola")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Bangladesh")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Belarus")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Cambodia")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Cameroon")) {

					cust = tot * .08;

				} else if (ttcntry.equals("CostaRica")) {

					cust = tot * .08;

				} else if (ttcntry.equals("CotedIvoire")) {

					cust = tot * .08;

				} else if (ttcntry.equals("DominicanRepublic")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Ecuador")) {

					cust = tot * .08;

				} else if (ttcntry.equals("ElSalvador")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Ethiopia")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Georgia")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Ghana")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Greece")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Guatemala")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Kazakhstan")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Kenya")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Madagascar")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Mauritius")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Mozambique")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Myanmar")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Nepal")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Nicaragua")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Nigeria")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Pakistan")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Panama")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Paraguay")) {

					cust = tot * .08;

				} else if (ttcntry.equals("PuertoRico")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Romania")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Senegal")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Slovakia")) {

					cust = tot * .08;

				} else if (ttcntry.equals("SriLanka")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Tanzania")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Tunisia")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Uganda")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Uzbekistan")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Venezuela")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Zambia")) {

					cust = tot * .08;

				} else if (ttcntry.equals("Zimbabwe")) {

					cust = tot * .08;

				}

				res6.setText("Custom Charges($)" + cust);

			} else if (j.getSource() == reset6) {
				String h = "";
				tprice.setText(h);
				tshipp.setText(h);
				tcntry.setSelectedIndex(0);
				res6.setText(h);
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

}

public class Ubuyshipping {
	public static void main(String[] args) throws Exception {
		MyFrame f = new MyFrame();

	}

}