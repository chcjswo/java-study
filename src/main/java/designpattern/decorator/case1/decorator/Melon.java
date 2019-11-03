package designpattern.decorator.case1.decorator;

import designpattern.decorator.case1.base.IceCream;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class Melon extends Decorator {
	private IceCream iceCream;

	public Melon(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription() + " + 멜론";
	}

	@Override
	public int price() {
		return 500 + iceCream.price();
	}
}
