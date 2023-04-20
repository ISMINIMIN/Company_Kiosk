package jCompanyCafe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PayComplete extends Logo {

	private JLabel lbl1, lbl2;
	private JButton btnReset;
	public static int waitNum = 1;
	public static JLabel lblWaitNumber;

	public PayComplete(MainFrame f) {

		super(f);

		CheckDB.lbltimer.setBounds(335, 540, 50, 50); // 절대 위치 지정
		CheckDB.lbltimer.setForeground(new Color(26,116,2)); // 폰트색 지정
		add(CheckDB.lbltimer);

		lbl1 = new JLabel("결제가 완료되었습니다."); // 라벨 추가
		lbl1.setFont(new Font("맑은 고딕", Font.PLAIN, 18)); // 폰트 설정
		lbl1.setBounds(265, 250, 200, 50);
		add(lbl1);

		lbl2 = new JLabel("해당 번호로 불러드리겠습니다.");
		lbl2.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lbl2.setBounds(230, 290, 300, 50);
		add(lbl2);

		// 대기 번호 출력
		lblWaitNumber = new JLabel(waitNum+ "번");
		lblWaitNumber.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		lblWaitNumber.setBounds(325,370, 100, 50);
		add(lblWaitNumber);

		btnReset = new JButton("처음화면으로 돌아가기");
		// 버튼이 눌렸을 때 이벤트 지정
		btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// 대기 번호가 1번이면 
            	if(waitNum==1) {
            		// 대기 번호가 1씩 증가함
            		waitNum++;
            		// 대기 번호를 출력함
            		lblWaitNumber.setText(waitNum+ "번");
            	}
            	// 타이머 스레드 강제 종료
            	CheckDB.thread.interrupt();
            	MenuInfomation.count = 1;
            	// 처음 패널로 넘어감
            	F.nextPanel();
            }
        });
		btnReset.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnReset.setBackground(new Color(217,242,192));
		btnReset.setForeground(new Color(26,116,2));
		btnReset.setBounds(200, 610, 300, 60);
		add(btnReset);

		setVisible(true);		
	}
}
