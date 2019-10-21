package com.leetcode.practise;

import java.util.HashMap;

import javax.swing.Spring;

public class Solution {
	public static void main(String[] args){
		int dataone[] = {1,2,3,4,5};
		int datatwo = 7;
		int datathree[] = twoSum(dataone, datatwo);
		for(int i : datathree){
			System.out.println("z++++++++++"+i);
		}
        for (int i = 0; i < datathree.length; i++)  
            System.out.println("p+++++++++++++++"+datathree[i]);  
        for (int i = 0;i < datathree.length;i++);
	
	}
	
	/**
	 * twoSum spring
	 */
	public static int[] twoSum(int[] nums, int target){
		int[] res = new int[2];
		if(nums==null || nums.length <= 1) return res;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int val = target-num;
			if(map.containsKey(val)){
				res[0]=i;
				res[1]=map.get(val);
				return res;
			}else map.put(num, i);
		}
		return res;
	}

}
