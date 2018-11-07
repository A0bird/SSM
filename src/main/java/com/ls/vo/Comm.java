package com.ls.vo;


/*
 * 报销单状态的设置
 */

public class Comm {
	//报销单作废
	public static final String EXPENSE_DEL="del";
	//初始状态
	public static final String EXPENSE_ZERO="0";
	//部门经理审核
	public static final String EXPENSE_ONE="1";
	//部门经理审核不通过
	public static final String EXPENSE_REONE="-1";
	//财务经理审核
	public static final String EXPENSE_TWO="2";
	//财务经理审核不通过
	public static final String EXPENSE_RETWO="-2";
	//财务经理审核通过
	public static final String EXPENSE_THREE="3";
}
