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

		lbl1 = new JLabel("Receipt"); // �� ����
		lbl1.setFont(new Font("���ʷҵ���", Font.BOLD, 33)); // ��Ʈ ����
		lbl1.setBounds(300, 160, 270, 50); // ���� ��ġ ����
        add(lbl1);

		lbl2 = new JLabel("�� �հ�");
		lbl2.setFont(new Font("���� ���", Font.PLAIN, 23));
		lbl2.setBounds(245, 280, 100, 30);
		add(lbl2);

		lbl3 = new JLabel("���� �ݾ�");
		lbl3.setFont(new Font("���� ���", Font.PLAIN, 23));
		lbl3.setBounds(245, 380, 200, 30);
		add(lbl3);

		lbl4 = new JLabel("���� �ݾ�");
		lbl4.setFont(new Font("���� ���", Font.PLAIN, 23));
		lbl4.setBounds(245, 475, 200, 30);
		lbl4.setForeground(new Color(26,116,2));
		add(lbl4);

		lblSum = new JLabel(); // ������ �ޱ� �� �� �ݾ��� ��µ�
		lblSum.setFont(new Font("���� ���", Font.BOLD, 23));
		lblSum.setBounds(400, 280, 200, 30);
		add(lblSum);

		lblDiscount = new JLabel(); // ���� �ݾ��� ��µ�
		lblDiscount.setFont(new Font("���� ���", Font.BOLD, 23));
		lblDiscount.setBounds(400, 380, 200, 30);
		add(lblDiscount);

		lblTotlal = new JLabel(); // ���� ���� �� ���� �ݾ��� ��µ�
		lblTotlal.setFont(new Font("���� ���", Font.BOLD, 23));
		lblTotlal.setBounds(400, 475, 200, 30);
		lblTotlal.setForeground(new Color(26,116,2));
		add(lblTotlal);

		btnPay = new JButton("�����ϱ�");
		// ��ư�� ������ �� �̺�Ʈ ����
		btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// ���� �гη� �Ѿ
            	F.nextPanel();
            }
        });

		btnPay.setFont(new Font("���� ���", Font.BOLD, 20));
		btnPay.setBackground(new Color(217,242,192));
		btnPay.setForeground(new Color(26,116,2));
		btnPay.setBounds(255, 610, 200, 50);
		add(btnPay);

		setVisible(true);
	}
}