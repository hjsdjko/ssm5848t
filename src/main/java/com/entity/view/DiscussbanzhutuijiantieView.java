package com.entity.view;

import com.entity.DiscussbanzhutuijiantieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 版主推荐贴评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
@TableName("discussbanzhutuijiantie")
public class DiscussbanzhutuijiantieView  extends DiscussbanzhutuijiantieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbanzhutuijiantieView(){
	}
 
 	public DiscussbanzhutuijiantieView(DiscussbanzhutuijiantieEntity discussbanzhutuijiantieEntity){
 	try {
			BeanUtils.copyProperties(this, discussbanzhutuijiantieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
