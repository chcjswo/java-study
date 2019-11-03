package designpattern.decorator.case1.base;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class IceCreamCone extends IceCream {
	public IceCreamCone() {
		this.description = "아이스크림(콘)";
	}

	@Override
	public int price() {
		return 1300;
	}
}
