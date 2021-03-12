package PlayCards;

import java.util.Objects;

public class Card {
    private final int rank;//定义牌面范围1-13
    private final String suit;//定义花色 红桃♥ 黑桃♠ 梅花♣ 方块♦

    public Card(int rank,String suit){
        this.rank=rank;
        this.suit=suit;
    }

    //重写toString()方法
    @Override
    public String toString() {
        return String.format("[%s %s]",suit,rankToString(rank));
    }

    //把rank等于1转为A 11-13部分转为J Q K
    private static String rankToString(int rank) {
        switch (rank){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(rank);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    //测试一下
    public static void main(String[] args) {
        Card c1=new Card(1,"♥");
        Card c2 = new Card(11, "♠");
        Card c3 = new Card(12, "♣");
        Card c4 = new Card(13, "♦");
        Card c5=new Card(10,"♥");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
