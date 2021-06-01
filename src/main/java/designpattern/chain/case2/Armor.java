package designpattern.chain.case2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Armor implements Defense {

    private Defense nextDefense;
    private int def = 10;

    public Armor(int def) {
        this.def = def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {
        process(attack);
        if (nextDefense != null) {
            nextDefense.defense(attack);
        }
    }

    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
}
