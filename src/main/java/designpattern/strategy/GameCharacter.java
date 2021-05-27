package designpattern.strategy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-27
 **/
public class GameCharacter {

    // 접근점
    private Weapon weapon;

    // 교환 기능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        // 델리게이트
        if (weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }

}
