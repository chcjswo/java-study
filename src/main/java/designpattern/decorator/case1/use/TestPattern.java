package designpattern.decorator.case1.use;

import designpattern.decorator.case1.base.IceCream;
import designpattern.decorator.case1.base.IceCreamCake;
import designpattern.decorator.case1.base.IceCreamCone;
import designpattern.decorator.case1.base.IceCreamPop;
import designpattern.decorator.case1.decorator.Melon;
import designpattern.decorator.case1.decorator.Strawberry;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class TestPattern {
	public static void main(String[] args) {
		IceCream iceCream1 = new IceCreamCake();
		System.out.println(iceCream1.getDescription() + " cost: " + iceCream1.price());

		IceCream iceCream2 = new IceCreamCone();
		iceCream2 = new Strawberry(iceCream2);
		System.out.println(iceCream2.getDescription() + " cost: " + iceCream2.price());

		IceCream iceCream3 = new Melon(new Strawberry(new IceCreamPop()));
		System.out.println(iceCream3.getDescription() + " cost: " + iceCream3.price());
	}
}
