package com.legou.modules;

import org.springframework.beans.factory.InitializingBean;

import com.legou.interfaces.Axe;
import com.legou.interfaces.People;

public class America implements People, InitializingBean {
	private Axe axe;
	private String name;

	public America() {
		System.out.println("Spring实例化主调Bean:America...");
	}

	public void setAxe(Axe axe) {
		System.out.println("Spring依赖关系注入axe...");
		this.axe = axe;
	}

	public void setName(String name) {
		System.out.println("Spring依赖关系注入name...");
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化Bean之后afterPropertiesSet....");
	}

	public void init() {
		System.out.println("正在执行初始化方法init...");
	}

	@Override
	public void userAxe() {
		System.out.println(name + axe.chop());
	}
}
