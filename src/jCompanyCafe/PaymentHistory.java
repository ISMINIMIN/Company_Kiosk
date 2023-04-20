package jCompanyCafe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaymentHistory extends Logo {

	public static JLabel lblSum, lblDiscount, lblTotlal;
	private JLabel lbl1, lbl2, lbl3, lbl4;
	private JButton btnPay;

	public PaymentHistory(MainFrame f) {

		super(f);

		lbl1 = new JLabel("Receipt"); // 라벨 생성
		lbl1.setFont(new Font("함초롬돋움", Font.BOLD, 33)); // 폰트 설정
		lbl1.setBounds(300, 160, 270, 50); // 절대 위치 지정
        add(lbl1);

		lbl2 = new JLabel("총 합계");
		lbl2.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		lbl2.setBounds(245, 280, 100, 30);
		add(lbl2);

		lbl3 = new JLabel("할인 금액");
		lbl3.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		lbl3.setBounds(245, 380, 200, 30);
		add(lbl3);

		lbl4 = new JLabel("결제 금액");
		lbl4.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		lbl4.setBounds(245, 475, 200, 30);
		lbl4.setForeground(new Color(26,116,2));
		add(lbl4);

		lblSum = new JLabel(); // 할인을 받기 전 총 금액이 출력됨
		lblSum.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblSum.setBounds(400, 280, 200, 30);
		add(lblSum);

		lblDiscount = new JLabel(); // 할인 금액이 출력됨
		lblDiscount.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblDiscount.setBounds(400, 380, 200, 30);
		add(lblDiscount);

		lblTotlal = new JLabel(); // 할인 받은 후 결제 금액이 출력됨
		lblTotlal.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblTotlal.setBounds(400, 475, 200, 30);
		lblTotlal.setForeground(new Color(26,116,2));
		add(lblTotlal);

		btnPay = new JButton("결제하기");
		// 버튼이 눌렸을 때 이벤트 지정
		btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// 다음 패널로 넘어감
            	F.nextPanel();
            }
        });

		btnPay.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnPay.setBackground(new Color(217,242,192));
		btnPay.setForeground(new Color(26,116,2));
		btnPay.setBounds(255, 610, 200, 50);
		add(btnPay);

		setVisible(true);
	}
}