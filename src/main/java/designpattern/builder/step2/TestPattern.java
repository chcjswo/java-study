package designpattern.builder.step2;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class TestPattern {
	public static void main(String[] args) {
		Person p1 = Person.builder()
				.firstName("FirstName")
				.lastName("lastName")
				.addressOne("address1")
				.birthDate(LocalDate.of(1975, Month.OCTOBER, 3))
				.sex("mail")
				.driverLicense(true)
				.married(true)
				.build();

		System.out.println(p1.getMarried());
	}
}
