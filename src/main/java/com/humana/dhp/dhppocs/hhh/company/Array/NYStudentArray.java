package com.humana.dhp.dhppocs.hhh.company.Array;

public class NYStudentArray {

		public static void main(String[] args) {
			NYStudent ny=new NYStudent();
			ny.name = "saroj";
			ny.semester = 1;
			System.out.println(ny.name);
			System.out.println(ny.semester);

			// array holds group of references, uninitialized
			NYStudent [] nyArr = new NYStudent[100]; //declaration
			nyArr[0] =new NYStudent();//initialization
			// initialize each index in the array
			for(int i=0;  i<nyArr.length ; i++ ) {
				nyArr[i]=new NYStudent();
				System.out.println(nyArr[89]);
			}
			

//			NYStudent [][] nyArr2=new NYStudent [2][3];
//			for(int i=0; i < nyArr2.length; i++) { // length as 2
//
//				for(int j=0; j < nyArr2[i].length; j++) { // lenght as 3
//					nyArr2[i][j]=new NYStudent();
//				}
//
//			}
			// i=0, j=0,1,2
			// [0][0] , [0][1] , [0][2]
			// i=1, j=0,1,2		
			// [1][0] , [1][1] , [1][2]
		}

	}

