package com.zhenliang.object;

import java.util.Scanner;

public class ShoppingCar {
    public static void main(String[] args) {
        Goods[] goods = new Goods[100];

        while(true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车商品展示：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品金额：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令：");
            String command = sc.next();

            switch (command) {
                case "add":
                    addGoods(sc, goods);
                    break;
                case "query":
                    queryGoods(sc, goods);
                    break;
                case "update":
                    updateGoods(sc, goods);
                    break;
                case "pay":
                    payGoods(goods);
                    break;
                default:
                    System.out.println("您输入的命令有误！");
            }
        }
    }

    public static void addGoods(Scanner sc, Goods[] goods) {
        System.out.println("请输入商品id(id不能重复)：");
        int id = sc.nextInt();
        System.out.println("请输入商品名称：");
        String name = sc.next();
        System.out.println("请输入商品价格：");
        double price = sc.nextDouble();
        System.out.println("请输入商品数量：");
        int num = sc.nextInt();

        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNum = num;

        for (int i = 0; i < goods.length; i++) {
            if(goods[i] == null) { // 该位置没有商品
                goods[i] = g;
                break;
            }
        }
        System.out.println("您的商品" + name + "添加到购物车成功！");
    }

    public static void queryGoods(Scanner sc, Goods[] goods) {
        System.out.println("请输入您要查询商品信息的方式（1：查询所有；2：查询单个）：");
        int command = sc.nextInt();
        boolean flag = false;
        while(true) {
            switch (command) {
                case 1:
                    System.out.println("商品id\t\t名称\t\t\t价格\t\t\t数量");
                    for (int i = 0; i < goods.length; i++) {
                        if(goods[i] != null) {
                            System.out.println(goods[i].id + "\t\t" + goods[i].name + "\t\t" + goods[i].price + "\t\t" + goods[i].buyNum + "\t\t");
                        } else {
                            System.out.println("商品信息不存在！");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("请输入您要查询的商品id：");
                    int id = sc.nextInt();
                    System.out.println("商品id\t\t名称\t\t\t价格\t\t\t数量");
                    for (int i = 0; i < goods.length; i++) {
                        if (goods[i] != null && goods[i].id == id) {
                            System.out.println(id + "\t\t" + goods[i].name + "\t\t" + goods[i].price + "\t\t" + goods[i].buyNum + "\t\t");
                            break;
                        }
                    }
                    break;
                default:
                    flag = true;
                    System.out.println("您输入的查询方式有误！");
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void updateGoods(Scanner sc, Goods[] goods) {
        System.out.println("请输入您要修改的商品id：");
        int id = sc.nextInt();
        System.out.println("请输入您要修改的商品数量：");
        int num = sc.nextInt();
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] != null && goods[i].id == id) {
                goods[i].buyNum = num;
                System.out.println(goods[i].name + "商品数量修改成功！最新购买数量为" + num + "个");
                break;
            }
        }
    }

    public static void payGoods(Goods[] goods) {
        double totalPrice = 0.0;
        for (int i = 0; i < goods.length; i++) {
            if(goods[i] != null) {
                double price = goods[i].buyNum * goods[i].price;
                totalPrice += price;
            }
        }
        System.out.println("购物车商品总价为：" + totalPrice);
    }
}
