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

		CheckDB.lbltimer.setBounds(335, 540, 50, 50); // ���� ��ġ ����
		CheckDB.lbltimer.setForeground(new Color(26,116,2)); // ��Ʈ�� ����
		add(CheckDB.lbltimer);

		lbl1 = new JLabel("������ �Ϸ�Ǿ����ϴ�."); // �� �߰�
		lbl1.setFont(new Font("���� ���", Font.PLAIN, 18)); // ��Ʈ ����
		lbl1.setBounds(265, 250, 200, 50);
		add(lbl1);

		lbl2 = new JLabel("�ش� ��ȣ�� �ҷ��帮�ڽ��ϴ�.");
		lbl2.setFont(new Font("���� ���", Font.PLAIN, 18));
		lbl2.setBounds(230, 290, 300, 50);
		add(lbl2);

		// ��� ��ȣ ���
		lblWaitNumber = new JLabel(waitNum+ "��");
		lblWaitNumber.setFont(new Font("���� ���", Font.BOLD, 40));
		lblWaitNumber.setBounds(325,370, 100, 50);
		add(lblWaitNumber);

		btnReset = new JButton("ó��ȭ������ ���ư���");
		// ��ư�� ������ �� �̺�Ʈ ����
		btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// ��� ��ȣ�� 1���̸� 
            	if(waitNum==1) {
            		// ��� ��ȣ�� 1�� ������
            		waitNum++;
            		// ��� ��ȣ�� �����
            		lblWaitNumber.setText(waitNum+ "��");
            	}
            	// Ÿ�̸� ������ ���� ����
            	CheckDB.thread.interrupt();
            	MenuInfomation.count = 1;
            	// ó�� �гη� �Ѿ
            	F.nextPanel();
            }
        });
		btnReset.setFont(new Font("���� ���", Font.BOLD, 17));
		btnReset.setBackground(new Color(217,242,192));
		btnReset.setForeground(new Color(26,116,2));
		btnReset.setBounds(200, 610, 300, 60);
		add(btnReset);

		setVisible(true);		
	}
}
