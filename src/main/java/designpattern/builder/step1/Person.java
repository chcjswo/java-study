package designpattern.builder.step1;

import java.time.LocalDate;

/**
 * Created by chcjswo@gmail.com on 2019/11/03
 * Blog : https://mocadev.tistory.com
 * Github : http://github.com/duelteam
 */
public class Person {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String addressOne;
	private String addressTwo;
	private String sex;
	private boolean driverLicense;
	private boolean married;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
	}

	public boolean getMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
}
