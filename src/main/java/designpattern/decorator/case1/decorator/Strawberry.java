package designpattern.decorator.case1.decorator;

import designpattern.decorator.case1.base.IceCream;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class Strawberry extends Decorator {
	private IceCream iceCream;

	public Strawberry(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription() + " 딸기";
	}

	@Override
	public int price() {
		return 20000 + iceCream.price();
	}
}
