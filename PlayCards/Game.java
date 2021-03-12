package PlayCards;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        //1、初始化一副牌
        ArrayList<Card> cardList= initCardList();

        //2、洗牌
        shuffle(cardList);//这里也可以使用 Collections.shuffle(cardList);

        //测试黑桃K在不在这副牌中,期望打印true
        Card spadeK = new Card(13, "♠");
        System.out.println(cardList);//能看到是存在的
        System.out.println(cardList.contains(spadeK));
        //结果为true 原因是contains用indexOf 而indexOf实际用的equals(Object)
        //默认比较两个引用是否指向同一个对象 所以需要重写equals()

       // 3. 准备三名玩家的手牌（存在牌的容器，通过 ArrayList<Card> 来表示）
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();

        System.out.println("抓牌前:");
        System.out.println(cardList);

        //4、轮流抓牌 从牌堆中删除一张牌(头删) 把该牌放入玩家对应的手牌中
        for (int i=0;i<5;i++){
            //玩家1抓牌
            Card card = cardList.remove(0);
            player1.add(card);

            //玩家2抓牌
            card = cardList.remove(0);
            player2.add(card);

            //玩家3抓牌
            card = cardList.remove(0);
            player3.add(card);
        }
        System.out.println("抓牌后");
        System.out.println(cardList);
        System.out.println("玩家1："+player1);
        System.out.println("玩家2："+player2);
        System.out.println("玩家3："+player3);

    }

    private static void shuffle(ArrayList<Card> cardList) {
        Random rd=new Random();
        for (int i=cardList.size()-1;i>0;i--){
            //[0,i-1]位置中随机生成一个下标，其对应元素与下标为[i]的元素交换
            int rdIndex=rd.nextInt(i);

            Card temp1=cardList.get(i);//得到i位置的元素
            Card temp2=cardList.get(rdIndex);//得到随机位置的元素
            cardList.set(i,temp2);//值重置
            cardList.set(rdIndex,temp1);
        }
    }

    private static ArrayList<Card> initCardList() {
        ArrayList<Card> cardList=new ArrayList<>();
        String[] suits={"♥","♠","♣","♦"};
        for (String suit:suits){
            for (int rank=1;rank<=13;rank++){
                Card card=new Card(rank,suit);
                cardList.add(card);
            }
        }
        return cardList;
    }
}
