package org.kdea.mybatis;

public class PushTest {
	public static void main(String[] args) {
		System.out.println("10시 41분");
		System.out.println("10시 48분");
		System.out.println("11시 12분");
		
		Emp emp = new Emp();
		
		emp.setDeptno(1);
		
		System.out.println(emp.getDeptno());
		
		emp.setEmpno(1);
		System.out.println(emp.getEmpno());
		
		System.out.println("11시 02분");
		System.out.println("11시 09분");
		
		
		System.out.println( "11시 13분 작업중");
	}
}
