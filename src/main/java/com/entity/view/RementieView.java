package com.entity.view;

import com.entity.RementieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门贴
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
@TableName("rementie")
public class RementieView  extends RementieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RementieView(){
	}
 
 	public RementieView(RementieEntity rementieEntity){
 	try {
			BeanUtils.copyProperties(this, rementieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
