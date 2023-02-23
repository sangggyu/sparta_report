class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 연습문제 7-1 의 답이므로 내용생략
    }

    void shuffle() {
        int x = 0;
        SutdaCard tmp;
        for (int i=0; i<CARD_NUM; i++){
            x = (int) Math.random() % CARD_NUM;
            tmp = cards[x];
            cards[x] = cards[i];
            cards[i] = tmp;
        }
    }

    SutdaCard pick(int index) {
        if (index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick() {
        int x = (int) Math.random() % CARD_NUM;
        return cards[x];
    }
} // SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과) 
// 1K
// 7 
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K, 
// 2