package jCompanyCafe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Membership extends Logo {

	private JLabel lbl1, lbl2;
	private JButton btnSKT, btnLG, btnKT, btnPay;
	public static double skt, lg, kt;
	public static int discountPrice, price;

	public Membership(MainFrame f) {

		super(f);

		lbl1 = new JLabel("Discount"); // �� ����
		lbl1.setFont(new Font("���ʷҵ���", Font.BOLD, 33)); // ��Ʈ ����
		lbl1.setBounds(290, 165, 270, 40); // ���� ��ġ ����
		add(lbl1);

		lbl2 = new JLabel("�ش� ������ �������ּ���");
		lbl2.setFont(new Font("���� ���", Font.PLAIN, 18));
		lbl2.setBounds(250, 210, 300, 30);
		add(lbl2);

		btnSKT = new JButton("T �����"); // ��ư ����
		// ��ư�� ������ �� �̺�Ʈ ����
		btnSKT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// skt ������ 0.1�� ������
            	skt = 0.1;
            	// ���� �ݾ��� ����� - double������ ����� �����̹Ƿ� GUI ����� ���� int������ ���� ��ȯ��
            	discountPrice = (int)(MenuSelect.totalPrice*skt);
            	// PaymentHistory�� �󺧿� ���� �ݾ� ��µ�
            	PaymentHistory.lblDiscount.setText(discountPrice+"��");
            	// ���� �ݾ��� �����  (���� ���� �ݾ� - ���� �ݾ�)
            	price = MenuSelect.totalPrice-discountPrice;
            	// PaymentHistory�� �󺧿� ���� �ݾ� ��µ�
            	PaymentHistory.lblTotlal.setText(price+"��");
            	// ���� �гη� �Ѿ
            	F.nextPanel();
            }
        });

		btnSKT.setFont(new Font("���� ���", Font.BOLD, 19));
		btnSKT.setBackground(new Color(217,242,192)); // ���� ����
		btnSKT.setForeground(new Color(26,116,2)); // ��Ʈ�� ����
		btnSKT.setBounds(225, 270, 260, 60);
		add(btnSKT);

		btnLG = new JButton("LG U+ �����");
		// ��ư�� ������ �� �̺�Ʈ ����
		btnLG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// lg ������ 0.05�� ������
            	lg = 0.05;  
            	discountPrice = (int)(MenuSelect.totalPrice*lg);
            	PaymentHistory.lblDiscount.setText(discountPrice+"��");
            	price = MenuSelect.totalPrice-discountPrice;
            	PaymentHistory.lblTotlal.setText(price+"��");           	
            	F.nextPanel();
            }
        });

		btnLG.setFont(new Font("���� ���", Font.BOLD, 19));
		btnLG.setBackground(new Color(217,242,192));
		btnLG.setForeground(new Color(26,116,2));
		btnLG.setBounds(225, 370, 260, 60);
		add(btnLG);

		btnKT = new JButton("KT �����");
		// ��ư�� ������ �� �̺�Ʈ ����
		btnKT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// kt ������ 0.15�� ������
            	kt = 0.15;            	
            	discountPrice = (int)(MenuSelect.totalPrice*kt);           	
            	PaymentHistory.lblDiscount.setText(discountPrice+"��");
            	price = MenuSelect.totalPrice-discountPrice;           	
            	PaymentHistory.lblTotlal.setText(price+"��");           	
            	F.nextPanel();
            }
        });

		btnKT.setFont(new Font("���� ���", Font.BOLD, 19));
		btnKT.setBackground(new Color(217,242,192));
		btnKT.setForeground(new Color(26,116,2));
		btnKT.setBounds(225, 470, 260, 60);
		add(btnKT);

		btnPay = new JButton("�ٷ� ����");
		// ��ư�� ������ �� �̺�Ʈ ����
		btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// PaymentHistory�� ���� �ݾ��� �����ִ� �󺧿� 0���� ��µ� (������ ���� �ʰ� �ٷ� ������ ����̹Ƿ�)
            	PaymentHistory.lblDiscount.setText("0��");   	
            	discountPrice = 0;
            	price = MenuSelect.totalPrice-discountPrice;
            	PaymentHistory.lblTotlal.setText(price+"��");
            	F.nextPanel();
            }
        });

		btnPay.setFont(new Font("���� ���", Font.BOLD, 19));
		btnPay.setBackground(new Color(217,242,192));
		btnPay.setForeground(new Color(26,116,2));
		btnPay.setBounds(225, 570, 260, 60);
		add(btnPay);

		setVisible(true);
	}
}