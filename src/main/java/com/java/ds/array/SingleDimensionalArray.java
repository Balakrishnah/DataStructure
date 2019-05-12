package com.java.ds.array;

public class SingleDimensionalArray {
	/*1.In Java all arrays are dynamically allocated.(discussed below)
	2. Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using sizeof.
	3. A Java array variable can also be declared like other variables with [] after the data type.
	4. The variables in the array are ordered and each have an index beginning from 0.
	5. Java array can be also be used as a static field, a local variable or a method parameter.
	6. The size of an array must be specified by an int value and not long or short.
	7. The direct superclass of an array type is Object.
	8. Every array type implements the interfaces Cloneable and java.io.Serializable*/
	
	public static void main(String[] args) {
		Student[] stu;
		stu = new Student[5];
		stu[0] = new Student(10, "babu");
		stu[1] = new Student(20, "Ravi");
		stu[2] = new Student(30, "bharath");
		stu[3] = new Student(40, "pk");
		stu[4] = new Student(50, "dasa");
		
		for(int i=0; i<stu.length; i++){
			System.out.println("Elements at "+ i+":"+stu[i].roll_no+" "+stu[i].name);
		}
	}
}
