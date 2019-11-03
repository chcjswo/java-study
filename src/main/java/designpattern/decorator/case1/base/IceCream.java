package designpattern.decorator.case1.base;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public abstract class IceCream {
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public abstract int price();
}
