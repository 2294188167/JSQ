package com.example.jsq;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Stack;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText edit=null;
	private Button but1=null;
	private Button but2=null;
	private Button but3=null;
	private Button but4=null;
	private Button but5=null;
	private Button but6=null;
	private Button but7=null;
	private Button but8=null;
	private Button but9=null;
	private Button but0=null;
	private Button butJia=null;
	private Button butJian=null;
	private Button butCheng=null;
	private Button butChu=null;
	private Button butDian=null;
	private Button butZuo=null;
	private Button butYou=null;
	private Button butTui=null;
	private Button butBack=null;
	private Button butx=null;
	private Button butDeng=null;
	static boolean ok=false;
	static String jieguo="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.main);
		this.edit=(EditText)super.findViewById(R.id.myEdit);
		this.but0=(Button)super.findViewById(R.id.a0);
		this.but1=(Button)super.findViewById(R.id.a1);
		this.but2=(Button)super.findViewById(R.id.a2);
		this.but3=(Button)super.findViewById(R.id.a3);
		this.but4=(Button)super.findViewById(R.id.a4);
		this.but5=(Button)super.findViewById(R.id.a5);
		this.but6=(Button)super.findViewById(R.id.a6);
		this.but7=(Button)super.findViewById(R.id.a7);
		this.but8=(Button)super.findViewById(R.id.a8);
		this.but9=(Button)super.findViewById(R.id.a9);
		this.butJia=(Button)super.findViewById(R.id.jia);
		this.butJian=(Button)super.findViewById(R.id.jian);
		this.butCheng=(Button)super.findViewById(R.id.cheng);
		this.butChu=(Button)super.findViewById(R.id.chu);
		this.butZuo=(Button)super.findViewById(R.id.zuokuohao);
		this.butYou=(Button)super.findViewById(R.id.youkuohao);
		this.butTui=(Button)super.findViewById(R.id.tuibu);
		this.butBack=(Button)super.findViewById(R.id.back);
		this.butx=(Button)super.findViewById(R.id.ax);
		this.butDeng=(Button)super.findViewById(R.id.deng);
		this.butDian=(Button)super.findViewById(R.id.dian);
		this.but0.setOnClickListener(new Ja0());
		this.but1.setOnClickListener(new Ja1());
		this.but2.setOnClickListener(new Ja2());
		this.but3.setOnClickListener(new Ja3());
		this.but4.setOnClickListener(new Ja4());
		this.but5.setOnClickListener(new Ja5());
		this.but6.setOnClickListener(new Ja6());
		this.but7.setOnClickListener(new Ja7());
		this.but8.setOnClickListener(new Ja8());
		this.but9.setOnClickListener(new Ja9());
		this.butZuo.setOnClickListener(new JaZuo());
		this.butYou.setOnClickListener(new JaYou());
		this.butDian.setOnClickListener(new JaDian());
		this.butJia.setOnClickListener(new Jia());
		this.butJian.setOnClickListener(new Jian());
		this.butCheng.setOnClickListener(new cheng());
		this.butChu.setOnClickListener(new chu());
		this.butDeng.setOnClickListener(new deng());
		this.butx.setOnClickListener(new jax());
		this.butTui.setOnClickListener(new tui());
		this.butBack.setOnClickListener(new back());
	}
	private class jax implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(MainActivity.this.edit.getText().toString().equals(""))
				return;
			if(ok){
				MainActivity.this.edit.setText(jieguo);
				ok=false;
			}
			String s=MainActivity.this.edit.getText().toString()+"=";
			//text1.setText("√("+text1.getText()+")=");
			s=s.replace("×", "*");
			s=s.replace("÷", "/");
			qiuzhi(s);
		//	MainActivity.deng.this.qiuzhi(s);
			jieguo=Math.sqrt(Double.parseDouble(jieguo))+"";
			jieguo=huajian(jieguo);
			MainActivity.this.edit.setText("√("+MainActivity.this.edit.getText()+")="+jieguo);
			ok=true;
		}
	}
	private class back implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			MainActivity.this.edit.setText("0");
			ok=false;
		}
		
	}
	private class tui implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			String str=MainActivity.this.edit.getText().toString();
			MainActivity.this.edit.setText(str.substring(0, str.length()-1<0?0: str.length()-1));
		}
		
	}
	private class Ja0 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("0");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"0");
			}
		}
		
	}
	private class Ja1 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("1");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"1");
			}
		}
		
	}
	private class Ja2 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("2");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"2");
			}
		}
		
	}
	private class Ja3 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("3");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"3");
			}
		}
		
	}
	private class Ja4 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("4");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"4");
			}
		}
		
	}
	private class Ja5 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("5");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"5");
			}
		}
		
	}
	private class Ja6 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("6");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"6");
			}
		}
		
	}
	private class Ja7 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("7");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"7");
			}
		}
		
	}
	private class Ja8 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("8");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"8");
			}
		}
		
	}
	private class Ja9 implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("9");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"9");
			}
		}
		
	}
	private class JaDian implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+".");
		}
		
	}
	private class JaYou implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+")");
		}
		
	}
	private class JaZuo implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText("0");
				ok=false;
			}
			if(MainActivity.this.edit.getText().toString().equals("0")){
				MainActivity.this.edit.setText("(");
			}
			else{
				MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"(");
			}
		}
		
	}
	private class Jia implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText(jieguo);
				ok=false;
			}
			MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"+");
		}
		
	}
	private class Jian implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText(jieguo);
				ok=false;
			}
			MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"-");
		}
		
	}
	private class cheng implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText(jieguo);
				ok=false;
			}
			MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"x");
		}
		
	}
	private class chu implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			if(ok){
				MainActivity.this.edit.setText(jieguo);
				ok=false;
			}
			MainActivity.this.edit.setText(MainActivity.this.edit.getText().toString()+"÷");
		}
		
	}
	private class deng implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			try {
				String s=MainActivity.this.edit.getText().toString()+"=";
				String s1=s;
				MainActivity.this.edit.setText(s);
				s=s.replace("x", "*");
				s=s.replace("÷", "/");
				qiuzhi(s);
				MainActivity.this.edit.setText(s1+jieguo);
				ok=true;
			} catch (Exception e1) {
				MainActivity.this.edit.setText("式子不合法");
				ok=true;
				e1.printStackTrace();
			}
		}

		
		
	}
	public void qiuzhi(String s) {
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();//存运算符的优先级
		Stack<BigDecimal> sk1=new Stack<BigDecimal>();//存数字
		Stack<Character> sk2=new Stack<Character>();//存运算符
		map=SUM(map);
		boolean okk=true;
		int x=0;
		for(int i=0;i<s.length();i++){
			char a=s.charAt(i);
			if((a>='0'&&a<='9'||a=='.')&&okk){
				x=i;
				okk=false;
			}
			else if(!(a>='0'&&a<='9'||a=='.')){//是运算符
				//System.out.println(s.substring(x, i));
				if(i>0&&s.charAt(i-1)<='9'&&s.charAt(i-1)>='0')//防止两个运算符一块，1*(..)
					sk1.push(new BigDecimal(s.substring(x, i)));//将数字部分变成浮点型
				okk=true;
				if(sk2.isEmpty()){//运算符栈是空，运算符直接进栈
					sk2.push(a);
				}
				else{//运算符栈不为空
					if(map.get(sk2.peek())<map.get(a)){//如果来的运算符优先级较高，直接进栈
						sk2.push(a);
						continue;
					}
					while(!sk2.isEmpty()&&(map.get(sk2.peek())>=map.get(a)&&sk2.peek()!='(')){//运算符栈不为空，且来的运算符级别较低，
						switch(sk2.pop()){//最后进的运算符出栈，执行运算
						case '+':{
							BigDecimal c=sk1.pop();//数字栈后进的两个数字出栈开始运算，然后再进栈
							BigDecimal d=sk1.pop();
							c=c.add(d);sk1.push(c);break;
						}
						case '-':{
							BigDecimal c=sk1.pop();
							BigDecimal d=sk1.pop();
							c=d.subtract(c);sk1.push(c);break;
						}
						case '*':{
							BigDecimal c=sk1.pop();
							BigDecimal d=sk1.pop();
							c=c.multiply(d);sk1.push(c);break;
						}
						case '/':{
							BigDecimal c=sk1.pop();
							BigDecimal d=sk1.pop();
							c=d.divide(c, 100, BigDecimal.ROUND_HALF_UP);sk1.push(c);break;
						}
						}
					}
					if(!sk2.isEmpty()&&sk2.peek()=='('&&a==')'){//消除运算之后的无意义括号
						sk2.pop();
					}
					else
						sk2.push(a);//其他来的运算符继续进栈
				}
			}
		}
		jieguo=sk1.pop().toPlainString();
		jieguo=huajian(jieguo);
	}

	private String huajian(String j) {
		if(j.indexOf(".")!=-1){
			for(int i=j.length()-1;i>=0;i--){
				if(j.endsWith("0")){
					j=j.substring(0,j.length()-1);
				}
				else
					break;
			}
		}
		if(j.endsWith(".")){
			j=j.substring(0,j.length()-1);
		}
		
		return j;
	}

	private HashMap<Character, Integer> SUM(HashMap<Character, Integer> map) {
		map.put('=', 1);
		map.put(')', 2);
		map.put('+', 3);
		map.put('-', 3);
		map.put('*', 4);
		map.put('/', 4);
		map.put('(', 5);
		return map;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
