package designpattern.builder.step1;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class TestPattern {
	public static void main(String[] args) {
		Person person1 = createPersonForTesting();
		System.out.println(person1.getFirstName());
	}

	private static Person createPersonForTesting() {
		Person person =  new Person();
		person.setFirstName("FirstName");
		person.setLastName("LastName");
		person.setAddressOne("Address1");
		person.setAddressTwo("Address2");
		person.setSex("Man");
		person.setDriverLicense(false);
		person.setMarried(false);

		return person;
	}
}
