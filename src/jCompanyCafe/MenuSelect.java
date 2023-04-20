package jCompanyCafe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuSelect extends Logo {

	public static JLabel lblList;
	private JLabel lblMenu1, lblMenu2, lblMenu3, lblMenu4, lblMenu5, lblMenu6, lbl1;
	private JButton btnMenu1, btnMenu2, btnMenu3, btnMenu4, btnMenu5, btnMenu6, btnPay;
	private int price; // �ش� �޴��� ����
	public static int totalPrice;

	public MenuSelect(MainFrame f) {

		super(f);

		// ��ư�� �̹��� ������ ���� ��ü ����
		ImageIcon americano = new ImageIcon("image/americano.jpg");
		ImageIcon cafelatte = new ImageIcon("image/cafelatte.jpg");
		ImageIcon cafemoca = new ImageIcon("image/cafemoca.jpg");
		ImageIcon espresso = new ImageIcon("image/espresso.jpg");
		ImageIcon greentealatte = new ImageIcon("image/greentealatte.jpg");
		ImageIcon chocolatte = new ImageIcon("image/chocolatte.jpg");

		btnMenu1 = new JButton(americano); // ��ư ����
		// ��ư�� ������ �� �̺�Ʈ ����
		btnMenu1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
            	// MenuInfomation�� �󺧿� ���õ� �޴��� ���
            	MenuInfomation.lblMenuName.setText("�Ƹ޸�ī��");
            	MenuInfomation.selectedMenu="�Ƹ޸�ī��";
            	price=2500;
            	// ���ֹ��� ���� �ʱ�ȭ��
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	// ���� �гη� �Ѿ
            	F.nextPanel();
            }
        });
		btnMenu1.setBackground(new Color(255,255,255)); // ���� ����
		btnMenu1.setBounds(75, 140, 150, 150); // ���� ��ġ ����
		add(btnMenu1);

		lblMenu1 = new JLabel("<html>�Ƹ޸�ī��<br> &nbsp; 2500��</html>"); // �� ����
		lblMenu1.setFont(new Font("���� ���", Font.BOLD, 15)); // ��Ʈ ����
		lblMenu1.setBounds(110, 295, 100, 50); // ���� ��ġ ����
		add(lblMenu1);

		btnMenu2 = new JButton(cafelatte);
		btnMenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText(" ī���");
            	MenuInfomation.selectedMenu="ī���";
            	price=3000;	
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu2.setBackground(new Color(255,255,255));
		btnMenu2.setBounds(280, 140, 150, 150);
		add(btnMenu2);

		lblMenu2 = new JLabel("<html>ī���<br> &nbsp;3000��</html>");
		lblMenu2.setFont(new Font("���� ���", Font.BOLD, 15));
		lblMenu2.setBounds(320, 295, 100, 50);
		add(lblMenu2);

		btnMenu3 = new JButton(cafemoca);		
		btnMenu3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText(" ī���ī");
            	MenuInfomation.selectedMenu="ī���ī";
            	price=3500;           	
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu3.setBackground(new Color(255,255,255));
		btnMenu3.setBounds(485, 140, 150, 150);
		add(btnMenu3);

		lblMenu3 = new JLabel("<html>ī���ī<br> &nbsp;3500��</html>");
		lblMenu3.setFont(new Font("���� ���", Font.BOLD, 15));
		lblMenu3.setBounds(530, 295, 100, 50);
		add(lblMenu3);

		btnMenu4 = new JButton(espresso);		
		btnMenu4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText("����������");
            	MenuInfomation.selectedMenu="����������";
            	price=2000;
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu4.setBackground(new Color(255,255,255));
		btnMenu4.setBounds(75, 370, 150, 150);
		add(btnMenu4);

		lblMenu4 = new JLabel("<html>����������<br> &nbsp; 2000��</html>");
		lblMenu4.setFont(new Font("���� ���", Font.BOLD, 15));
		lblMenu4.setBounds(110, 530, 100, 50);
		add(lblMenu4);

		btnMenu5 = new JButton(greentealatte);		
		btnMenu5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {           	
            	MenuInfomation.lblMenuName.setText(" ������");
            	MenuInfomation.selectedMenu="������";
            	price=3000;           	
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);           	
            	F.nextPanel();
            }
        });
		btnMenu5.setBackground(new Color(255,255,255));
		btnMenu5.setBounds(280, 370, 150, 150);
		add(btnMenu5);

		lblMenu5 = new JLabel("<html>������<br> &nbsp;3000��</html>");
		lblMenu5.setFont(new Font("���� ���", Font.BOLD, 15));
		lblMenu5.setBounds(320, 530, 100, 50);
		add(lblMenu5);

		btnMenu6 = new JButton(chocolatte);		
		btnMenu6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	MenuInfomation.lblMenuName.setText(" ���ڶ�");
            	MenuInfomation.selectedMenu="���ڶ�";
            	price=3000;
            	MenuInfomation.lblMenuCount.setText("1");
            	MenuInfomation.rbtnSize[0].setSelected(true);
            	MenuInfomation.rbtnHotIce[0].setSelected(true);
            	F.nextPanel();
            }
        });
		btnMenu6.setBackground(new Color(255,255,255));
		btnMenu6.setBounds(490, 370, 150, 150);
		add(btnMenu6);	

		lblMenu6 = new JLabel("<html>���ڶ�<br> &nbsp;3000��</html>");
		lblMenu6.setFont(new Font("���� ���", Font.BOLD, 15));
		lblMenu6.setBounds(530, 530, 100, 50);
		add(lblMenu6);

		btnPay = new JButton("�����ϱ�");
		// '�����ϱ�' ��ư�� ������ �� �̺�Ʈ ����
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				// ���� �ݾ��� ����ؼ� ������
				totalPrice = (price*MenuInfomation.count)+(MenuInfomation.sizePay*MenuInfomation.count);
				// PaymentHistory�� �󺧿� ���� �ݾ� �����
            	PaymentHistory.lblSum.setText(totalPrice+"��");
            	// ���ֹ��� ���� �ֹ����� �ʱ�ȭ ��Ŵ
            	lblList.setText("");
            	// �ΰ��� �г��� �Ѿ (MenuInfomation �г��� ������� ����)
            	F.jumpPanel();
            }
        });
		btnPay.setFont(new Font("���� ���", Font.BOLD, 20));
		btnPay.setBackground(new Color(217,242,192));
		btnPay.setForeground(new Color(26,116,2));
		btnPay.setBounds(440, 630, 200, 50);
		add(btnPay);

		lbl1 = new JLabel("�ֹ�����");
		lbl1.setFont(new Font("���� ���", Font.BOLD, 17));
		lbl1.setBounds(75, 630, 80, 50);
		add(lbl1);
		
		// ������ �޴��� ������ ����ϴ� ��
		lblList = new JLabel();
		lblList.setFont(new Font("���� ���", Font.BOLD, 17));
		lblList.setBounds(170, 630, 250, 50);
		lblList.setForeground(new Color(26,116,2));
		add(lblList);

		setVisible(true);
	}
}
