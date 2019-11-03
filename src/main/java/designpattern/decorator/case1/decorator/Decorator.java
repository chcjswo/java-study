package designpattern.decorator.case1.decorator;

import designpattern.decorator.case1.base.IceCream;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public abstract class Decorator extends IceCream {
	public abstract String getDescription();
}
