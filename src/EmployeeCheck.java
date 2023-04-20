package jCompanyCafe;

import java.awt.*;
import java.awt.event.*; // AWT 이벤트 사용을 위한 경로명
import javax.swing.*;

public class EmployeeCheck extends Logo {

	private JLabel lbl1, lbl2;
	private JButton btnorder;	

	public EmployeeCheck(MainFrame f) {

		super(f);

		lbl1 = new JLabel("해당 주문 시스템은 사원 전용입니다."); // 라벨 생성
		lbl1.setFont(new Font("맑은 고딕", Font.BOLD, 18)); // 폰트 설정
		lbl1.setBounds(200, 300, 320, 30); // 절대 위치 지정
		add(lbl1);

		lbl2 = new JLabel("사원이 아니신 분은 매장 직원을 통해 주문이 가능합니다.");
		lbl2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lbl2.setBounds(160, 350, 390, 30);
		add(lbl2);

		btnorder = new JButton("주문하기"); // 버튼 생성
		// 버튼이 눌렸을 때 이벤트 지정
		btnorder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// 다음 패널로 넘어감
            	F.nextPanel();
            }
        });
		btnorder.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnorder.setBackground(new Color(217,242,192));
		btnorder.setForeground(new Color(26,116,2));
		btnorder.setBounds(255, 610, 200, 50);
		add(btnorder);
		setVisible(true);
	}
}

