package designpattern.decorator.case1.base;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class IceCreamPop extends IceCream {
	public IceCreamPop() {
		this.description = "아이스크림(바)";
	}

	@Override
	public int price() {
		return 1530;
	}
}
