package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {

		int[] nums = {10,20,30,40};
		//System.out.println(nums[10]); ArrayIndexOutOfBoundException
		recieve(nums);
		int[] values = getArray();

		for(int val : values) {
			System.out.println(val);

			String[] names = {"aks","deepu","anju"};
			recieve1(names);

			String[] values1 = getArray1();

			for(String val1 : values1) {
				System.out.println(val1);



			}
		}
	}

		static void recieve(int[] numbers) {  //pass array as an argumenet

			for(int num : numbers) {
				System.out.println(num);
			}

		}

		static int[] getArray() {   // to return int array
			int[] values = {20,30,40,50};
			return values;
		}

		static void recieve1(String[] names) {

			for(String name :names) {
				System.out.println(name);
			}
		}

		static String[] getArray1() {
			String[] values1 = {"preethu", "manu"};
			return values1;

		}





	}


