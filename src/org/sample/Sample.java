package org.sample;

public class Sample {
	public void set(String name,char gender ){
		System.out.println(name+ "\n" + gender);
		}
		public void set(long phno, float avg){
		System.out.println(phno+ "\n" + avg);
		}
		public void set(float avg, long phno){
		System.out.println(avg+ "\n" +phno);
		}
		public void set(char gender,String name){
		System.out.println(gender+ "\n" +name);
		}
		public static void main(String[]args){
		Sample s = new Sample();
		s.set("chennai",'m');
		s.set(123456789l,98.456654f);
		s.set(96.546566f,456198729l);
		s.set('m',"madurai");
		
		System.out.println("not ready");
		}
}
