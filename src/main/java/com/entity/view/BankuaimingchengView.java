package com.entity.view;

import com.entity.BankuaimingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 版块名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
@TableName("bankuaimingcheng")
public class BankuaimingchengView  extends BankuaimingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BankuaimingchengView(){
	}
 
 	public BankuaimingchengView(BankuaimingchengEntity bankuaimingchengEntity){
 	try {
			BeanUtils.copyProperties(this, bankuaimingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
