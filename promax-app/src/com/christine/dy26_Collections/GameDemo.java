package com.christine.dy26_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDemo {
    /**
     * 1. 定义静态集合存储54张牌对象
     */
    public static List<Card> allCards = new ArrayList<>();

    /**
     * 2. 做牌：定义静态代码块初始化牌数据
     */
    static {
        // 3. 定义点数：个数确定，类型确定，使用数组
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        
        // 4. 定义花色：花色确定，类型确定，使用数组
        String[] colors = new String[]{"♥", "♦", "♠", "♣"};
        int index = 0;
        // 5. 组合点数和花色
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6. 封装成一个牌对象
                Card c = new Card(size, color, index);

                // 7. 存入到集合容器中
                allCards.add(c);
            }
        }

        // 8. 将大小王存入到集合对象中去
        Card c1 = new Card("", "小王", ++index);
        Card c2 = new Card("", "大王", ++index);
        Collections.addAll(allCards, c1, c2);

        System.out.println(allCards);
    }

    public static void main(String[] args) {
        // 9. 洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        // 10. 发牌（定义3个玩家，每个玩家的牌也是一个集合容器）
        List<Card> christine = new ArrayList<>();
        List<Card> picker = new ArrayList<>();
        List<Card> chris = new ArrayList<>();

        // 11. 开始发牌（从牌集合中发出51张牌给3个玩家，剩余3张作为底牌）
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                christine.add(c);
            } else if (i % 3 == 1) {
                picker.add(c);
            } else if (i % 3 == 2) {
                chris.add(c);
            }
        }
        System.out.println(allCards);

        // 12. 拿到最后三张底牌（把最后三张牌截取成一个集合）
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println(lastThreeCards);

        // 13. 给玩家的牌排序
        sortCards(christine);
        sortCards(picker);
        sortCards(chris);
        sortCards(lastThreeCards);

        // 14. 打印3个玩家的牌
        System.out.println("christine的牌：" + christine);
        System.out.println("picker的牌：" + picker);
        System.out.println("chris的牌：" + chris);
        System.out.println("最后三张底牌：" + lastThreeCards);
    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
