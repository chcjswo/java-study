package designpattern.builder.step2;

import java.time.LocalDate;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class PersonBuilder {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String addressOne;
	private String addressTwo;
	private String sex;
	private boolean driverLicense;
	private boolean married;

	PersonBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	PersonBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	PersonBuilder birthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	PersonBuilder addressOne(String addressOne) {
		this.addressOne = addressOne;
		return this;
	}

	public PersonBuilder addressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
		return this;
	}

	PersonBuilder sex(String sex) {
		this.sex = sex;
		return this;
	}

	PersonBuilder driverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
		return this;
	}

	PersonBuilder married(boolean married) {
		this.married = married;
		return this;
	}

	Person build() {
		Person person = new Person();

		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddressOne(addressOne);
		person.setAddressTwo(addressTwo);
		person.setBirthDate(birthDate);
		person.setSex(sex);
		person.setDriverLicense(driverLicense);
		person.setMarried(married);

		return person;
	}
}
