package com.entity.view;

import com.entity.FatiebiaobingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发帖标兵
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
@TableName("fatiebiaobing")
public class FatiebiaobingView  extends FatiebiaobingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FatiebiaobingView(){
	}
 
 	public FatiebiaobingView(FatiebiaobingEntity fatiebiaobingEntity){
 	try {
			BeanUtils.copyProperties(this, fatiebiaobingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
