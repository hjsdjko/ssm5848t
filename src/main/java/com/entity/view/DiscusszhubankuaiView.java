package com.entity.view;

import com.entity.DiscusszhubankuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 主版块评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
@TableName("discusszhubankuai")
public class DiscusszhubankuaiView  extends DiscusszhubankuaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhubankuaiView(){
	}
 
 	public DiscusszhubankuaiView(DiscusszhubankuaiEntity discusszhubankuaiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhubankuaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
