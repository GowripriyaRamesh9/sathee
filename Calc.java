# sathee
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public  class Calc extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b[] = new Button[10];
	int u, v;
	char op;
	int result;
	 TextField t;

	public void init()
	 {
		 Button add=new Button("Add");
		 Button sub=new Button("Sub");
		 Button mul=new Button("Mul");
		 Button div=new Button("Div");
		 Button eq=new Button("EQ");
		 Button clear=new Button("clear");
		 for(int i=0;i<10;i++)
		 {
			b[i]=new Button(""+i);
		 }
		
		 for(int i=0;i<10;i++)
		 {
			 add(b[i]);
		 }
		 add(add);
		 add(sub);
		 add(mul);
		 add(div);
		 add(eq);
		 add(clear);
		 for(int i=0;i<10;i++)
		 {
			 b[i].addActionListener(this);
		 }
		  t=new TextField(10);
		 t.addActionListener(this);
		 add(t);
		 add.addActionListener(this);
		 sub.addActionListener(this);
		 mul.addActionListener(this);
		 div.addActionListener(this);
		  eq.addActionListener(this);
		  clear.addActionListener(this);
		  }
	
		 public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

			 
		String str=e.getActionCommand();
		  char ch=str.charAt(0);
		  if(Character.isDigit(ch))
		  {
			  t.setText(t.getText()+str);
		  }
		  else if(str.equals("add"))
		  {
			  u=Integer.parseInt(t.getText());
			  op='+';
			  t.setText("");
		  }
		  else if(str.equals("sub"))
		  {
			  u=Integer.parseInt(t.getText());
			  op='-';
			  t.setText("");
		  }
	
		  else if(str.equals("mul"))
		  {
			  u=Integer.parseInt(t.getText());
			  op='*';
			  t.setText("");
		  }
	
		  else if(str.equals("div"))
		  {
			  u=Integer.parseInt(t.getText());
			  op='/';
			  t.setText("");
		  }
	  
	  if(str.equals("EQ"))
	  {
		  v=Integer.parseInt(t.getText());
		  if(op=='+'){
			  result=u+v;
		  t.setText(" "+result);}
		  else if(op=='-')
		  {
			  result=u-v;
			  t.setText(" "+result);
		  }
		  else if(op=='*')
		  {
			  result=u*v;
			  t.setText(" "+result);
		  }
		  else if(op=='/')
		  {
			  result=u/v;
			  t.setText(" "+result);
		  }
		  
	  }
	  if(str.equals("clear"))
	  {
		  t.setText("");
	  }
	  
	  
	  }
	
	}



