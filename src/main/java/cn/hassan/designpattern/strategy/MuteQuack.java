package cn.hassan.designpattern.strategy;

/**
 * Created with idea
 * Author: hss
 * Date: 2018/5/28 8:12
 * Description:
 */
public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("silence");
	}
}
