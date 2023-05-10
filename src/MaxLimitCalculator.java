public class MaxLimitCalculator extends Calculator {
    int value;

    MaxLimitCalculator() {
        this.value = 0;
    }

    @Override
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}
