package item2;

class Unit {
    private final int power;
    private final int armor;
    private final int hp;
    private final int mp;

    public Unit(Builder builder) {
        this.power = builder.power;
        this.armor = builder.armor;
        this.hp = builder.hp;
        this.mp = builder.mp;
    }

    static class Builder {
        private int power = 0;
        private int armor = 0;
        private int hp = 0;
        private int mp = 0;

        public Builder() {}

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Builder armor(int armor) {
            this.armor = armor;
            return this;
        }

        public Builder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder mp(int mp) {
            this.mp = mp;
            return this;
        }

        public Unit build() {
            return new Unit(this);
        }
    }
}
