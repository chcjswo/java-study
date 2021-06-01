package designpattern.chain.case2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Main {

    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(2);

        armor1.setNextDefense(armor2);

        armor1.defense(attack);

        System.out.println("attack = " + attack.getAmount());
    }

}
