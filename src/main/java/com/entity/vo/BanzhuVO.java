package com.entity.vo;

import com.entity.BanzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 版主
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public class BanzhuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 版主姓名
	 */
	
	private String banzhuxingming;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 管理模块
	 */
	
	private String guanlimokuai;
		
	/**
	 * 余额
	 */
	
	private Float money;
				
	
	/**
	 * 设置：版主姓名
	 */
	 
	public void setBanzhuxingming(String banzhuxingming) {
		this.banzhuxingming = banzhuxingming;
	}
	
	/**
	 * 获取：版主姓名
	 */
	public String getBanzhuxingming() {
		return banzhuxingming;
	}
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：管理模块
	 */
	 
	public void setGuanlimokuai(String guanlimokuai) {
		this.guanlimokuai = guanlimokuai;
	}
	
	/**
	 * 获取：管理模块
	 */
	public String getGuanlimokuai() {
		return guanlimokuai;
	}
				
	
	/**
	 * 设置：余额
	 */
	 
	public void setMoney(Float money) {
		this.money = money;
	}
	
	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}
			
}
