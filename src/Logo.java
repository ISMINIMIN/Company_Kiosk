package jCompanyCafe;

import java.awt.*;
import javax.swing.*;

// 각 패널에 공통 부분인 로고를 각 패널에 상속시키기위해 부모 클래스 생성
public class Logo extends JPanel {
	protected MainFrame F;
	protected JLabel lbltitle;

	public Logo(MainFrame f) {
		setSize(720, 750); // 패널 크기 720x750
		setLayout(null);
		setBackground(new Color(255,255,255)); // 배경색 지정

		F = f;

		lbltitle = new JLabel("J Company Cafe"); // 로고 라벨 생성
		lbltitle.setFont(new Font("함초롬돋움", Font.BOLD, 40));  // 로고 폰트 설정
		lbltitle.setForeground(new Color(26,116,2)); // 폰트색 지정
 		lbltitle.setBounds(200, 50, 320, 50); // 절대 위치 지정
		add(lbltitle);
	} 
}
