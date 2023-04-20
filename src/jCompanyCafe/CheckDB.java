package jCompanyCafe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CheckDB extends Logo {

	String tfid, tfpw, id, pw;
	public static int totalprice;
	
	Connection connection = null;
	ResultSet resultset = null;
	Statement statement = null;

	int result = 1;

	String url = "jdbc:mysql://localhost:3306/jcompany?characterEncoding=UTF-8&serverTimezone=UTC";

	void check(String tfid, String tfpw) {

		this.tfid = tfid;
		this.tfpw = tfpw;

		try {
			// �������� MySQL�� JDBC ����̹� Ŭ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// �ڹ� ���ø����̼��� JDBC ����̹��� ��������ִ� Ŭ����
			connection = DriverManager.getConnection(url, "root","1111");
			// SQL���� �����Ͽ� ���� ����� �Ѱ���
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from employeeinfo");
			
			while(resultset.next()) { // ���� ������ �̵�
				id = resultset.getString("employeenum");
				pw = resultset.getString("password");
				// DB�� �����ȣ�� �Է��� �����ȣ�� ��ġ�ϸ�
				if (id.equals(tfid)) {
					// DB�� ��й�ȣ�� �Է��� ��й�ȣ�� ��ġ�ϸ�
					if (pw.equals(tfpw)) {
						thread.start();
						lbl2.setText("");
						// ���� �гη� �Ѿ
						F.nextPanel();
					} else { // ��й�ȣ�� ��ġ���� ������
						// �˸� �޼��� ���
						lbl2.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
				} else { // �����ȣ�� ��ġ���� ������
					// �˸� �޼��� ���
					lbl2.setText("�����ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("SQL ���� ����");
		}
	}

	public static Thread thread;
	public static int delayTime;
	private JLabel lbl1, lblID, lblPW;
	public static JLabel lbltimer;
	private JButton btnOK, btnReInput;
	private JTextField tfID, tfPW;
	public static JLabel lbl2;

	public CheckDB(MainFrame f) {

		super(f);

		lbltimer = new JLabel(); // �� ����
		lbltimer.setFont(new Font("���ʷҵ���", Font.ITALIC, 30)); // ��Ʈ ����

		TimerRunnable runnable = new TimerRunnable(lbltimer); // ������ ��ü ����

		lbl1 = new JLabel("�����ȣ�� ��й�ȣ�� �Է����ּ���");
		lbl1.setFont(new Font("���� ���", Font.PLAIN, 20));
		lbl1.setBounds(180, 200, 400, 40); // ���� ��ġ ����
		add(lbl1);

		lbl2 = new JLabel();
		lbl2.setFont(new Font("���� ���", Font.PLAIN, 20));
		lbl2.setForeground(new Color(255,0,0));
		lbl2.setBounds(230 , 240, 400, 40);
		add(lbl2);

		lblID = new JLabel("�����ȣ");
		lblID.setFont(new Font("���� ���", Font.BOLD, 23));
		lblID.setBounds(150, 300, 100, 70);
		add(lblID);

		lblPW = new JLabel("��й�ȣ");
		lblPW.setFont(new Font("���� ���", Font.BOLD, 23));
		lblPW.setBounds(150, 380, 100, 70);
		add(lblPW);

		tfID = new JTextField(20); // �ؽ�Ʈ �ʵ� ����
		tfID.setFont(new Font("���� ���", Font.PLAIN, 23));
		tfID.setBounds(280, 315, 250, 40);
		add(tfID);

		tfPW = new JTextField(20);
		tfPW.setFont(new Font("���� ���", Font.PLAIN, 23));
		tfPW.setBounds(280, 395, 250, 40);
		add(tfPW);

		btnOK = new JButton("Ȯ��");
		// ��ư�� ������ �� �̺�Ʈ ����
		btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	for(int i=1; i<2; i++) {
            		thread = new Thread(runnable); // ������ ����
            	}
            	// ���� �ð��� 1�� �ʱ�ȭ
            	delayTime=1;
            	// �����带 �����Ϸ� ������ �ʱ�ȭ �ϴ� ����� �˾Ƴ��� ���Ͽ� Ű����ũ�� �ѹ��� �����ϴ� ������ �߻��Ͽ� �ּ� ó����
            	// ù ��° �ֹ������� ������ ���� ����
            	//thread.start();

            	tfid = tfID.getText(); // �ؽ�Ʈ �ʵ忡 �Է��� �����ȣ�� tfid�� ����
            	tfpw = tfPW.getText(); // �ؽ�Ʈ �ʵ忡 �Է��� ��й�ȣ�� tfpw�� ����
            	
            	check(tfid,tfpw); // check() �޼��� ȣ��
            	
            	// ���Է��� ���� �ؽ�Ʈ �ʵ� �ʱ�ȭ
            	tfID.setText("");
            	tfPW.setText("");
            }
        });
		btnOK.setFont(new Font("���� ���", Font.BOLD, 17));
		btnOK.setBackground(new Color(217,242,192));
		btnOK.setForeground(new Color(26,116,2));
		btnOK.setBounds(210, 610, 120, 50);
		add(btnOK);

		btnReInput = new JButton("���Է�");
		// ��Ʋ�� ������ �� �̺�Ʈ ����
		btnReInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	// �ؽ�Ʈ �ʵ�� ���� �˸� �� �ʱ�ȭ ��Ŵ
            	tfID.setText("");
            	tfPW.setText("");
            	lbl2.setText("");
            }
        });
		btnReInput.setFont(new Font("���� ���", Font.BOLD, 17));
		btnReInput.setBackground(new Color(217,242,192));
		btnReInput.setForeground(new Color(26,116,2));
		btnReInput.setBounds(370, 610, 120, 50);
		add(btnReInput);
		
		setVisible(true);
	}

	class TimerRunnable implements Runnable {

		private JLabel lblTimer;
		
		public TimerRunnable(JLabel lblTimer) {
			this.lblTimer = lblTimer;
		}

		@Override
		public void run( ) {
			
			delayTime = 1;

			while(true) {
				lblTimer.setText(Integer.toString(delayTime));
				delayTime++;

				try {
					Thread.sleep(1000); // �����尡 1�� ������ ����
				} catch(InterruptedException e) {
					return; // ���ܰ� �߻��ϸ� ������ ������
				}
				
				// ���ð��� 10�� �Ǹ�
				if(delayTime==10) {
					// PayComplete�� ��� ��ȣ�� 1�� ������
					PayComplete.waitNum++;
					// PayComplete�� ��� ��ȣ ���
					PayComplete.lblWaitNumber.setText(PayComplete.waitNum+ "��");
					// Ÿ�̸� ������ ���� ����
	        		thread.interrupt();
	        		// ���� �гη� �Ѿ
	        		F.nextPanel();
				}
			}
		}
	}
}