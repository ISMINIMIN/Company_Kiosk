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

		lbl1 = new JLabel("Discount"); // 라벨 생성
		lbl1.setFont(new Font("함초롬돋움", Font.BOLD, 33)); // 폰트 설정
		lbl1.setBounds(290, 165, 270, 40); // 절대 위치 지정
		add(lbl1);

		lbl2 = new JLabel("해당 할인을 선택해주세요");
		lbl2.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lbl2.setBounds(250, 210, 300, 30);
		add(lbl2);

		btnSKT = new JButton("T 멤버십"); // 버튼 생성
		// 버튼이 눌렸을 때 이벤트 생성
		btnSKT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// skt 변수에 0.1을 저장함
            	skt = 0.1;
            	// 할인 금액을 계산함 - double형으로 선언된 변수이므로 GUI 출력을 위해 int형으로 강제 변환함
            	discountPrice = (int)(MenuSelect.totalPrice*skt);
            	// PaymentHistory의 라벨에 할인 금액 출력됨
            	PaymentHistory.lblDiscount.setText(discountPrice+"원");
            	// 결제 금액을 계산함  (원래 선택 금액 - 할인 금액)
            	price = MenuSelect.totalPrice-discountPrice;
            	// PaymentHistory의 라벨에 결제 금액 출력됨
            	PaymentHistory.lblTotlal.setText(price+"원");
            	// 다음 패널로 넘어감
            	F.nextPanel();
            }
        });

		btnSKT.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnSKT.setBackground(new Color(217,242,192)); // 배경색 지정
		btnSKT.setForeground(new Color(26,116,2)); // 폰트색 지정
		btnSKT.setBounds(225, 270, 260, 60);
		add(btnSKT);

		btnLG = new JButton("LG U+ 멤버십");
		// 버튼이 눌렸을 때 이벤트 생성
		btnLG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// lg 변수에 0.05을 저장함
            	lg = 0.05;  
            	discountPrice = (int)(MenuSelect.totalPrice*lg);
            	PaymentHistory.lblDiscount.setText(discountPrice+"원");
            	price = MenuSelect.totalPrice-discountPrice;
            	PaymentHistory.lblTotlal.setText(price+"원");           	
            	F.nextPanel();
            }
        });

		btnLG.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnLG.setBackground(new Color(217,242,192));
		btnLG.setForeground(new Color(26,116,2));
		btnLG.setBounds(225, 370, 260, 60);
		add(btnLG);

		btnKT = new JButton("KT 멤버십");
		// 버튼이 눌렸을 때 이벤트 생성
		btnKT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// kt 변수에 0.15을 저장함
            	kt = 0.15;            	
            	discountPrice = (int)(MenuSelect.totalPrice*kt);           	
            	PaymentHistory.lblDiscount.setText(discountPrice+"원");
            	price = MenuSelect.totalPrice-discountPrice;           	
            	PaymentHistory.lblTotlal.setText(price+"원");           	
            	F.nextPanel();
            }
        });

		btnKT.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnKT.setBackground(new Color(217,242,192));
		btnKT.setForeground(new Color(26,116,2));
		btnKT.setBounds(225, 470, 260, 60);
		add(btnKT);

		btnPay = new JButton("바로 결제");
		// 버튼이 눌렸을 때 이벤트 생성
		btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// PaymentHistory의 할인 금액을 보여주는 라벨에 0원이 출력됨 (할인을 받지 않고 바로 결제한 경우이므로)
            	PaymentHistory.lblDiscount.setText("0원");   	
            	discountPrice = 0;
            	price = MenuSelect.totalPrice-discountPrice;
            	PaymentHistory.lblTotlal.setText(price+"원");
            	F.nextPanel();
            }
        });

		btnPay.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnPay.setBackground(new Color(217,242,192));
		btnPay.setForeground(new Color(26,116,2));
		btnPay.setBounds(225, 570, 260, 60);
		add(btnPay);

		setVisible(true);
	}
}