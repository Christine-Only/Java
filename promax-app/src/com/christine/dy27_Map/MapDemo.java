package com.christine.dy27_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 添加键值对 (当键重复时，后面的值会覆盖前面)
        maps.put("牛仔裤", 100);
        maps.put("靴子", 300);
        maps.put("卫衣", 180);
        maps.put("牛仔裤", 180);
        maps.put("运动鞋", 450);

        System.out.println(maps); // {卫衣=180, 运动鞋=450, 牛仔裤=180, 靴子=300}

        // 移除键（返回该键对应的值）
        System.out.println(maps.remove("卫衣")); // 180
        System.out.println(maps); // {运动鞋=450, 牛仔裤=180, 靴子=300}
        maps.remove("卫衣", 100);
        System.out.println(maps); // {运动鞋=450, 牛仔裤=180, 靴子=300}

        // 清空键值对
//        maps.clear();
//        System.out.println(maps); // {}

        // 此映射未包含键-值映射关系
        System.out.println(maps.isEmpty()); // false

        // 获取该键对应的值
        System.out.println(maps.get("卫衣")); // null
        System.out.println(maps.get("运动鞋")); // 450

        // 此映射是否包含指定键的映射关系
        System.out.println(maps.containsKey("牛仔裤")); // true
        System.out.println(maps.containsKey("卫衣")); // false

        // 此映射是否将一个或多个键映射到指定值
        System.out.println(maps.containsValue(100)); // false
        System.out.println(maps.containsValue(180)); // true

        // 此映射中的键-值映射关系数
        System.out.println(maps.size()); // 3

        // 此映射中包含的键的 Set 视图
        Set<String> keys = maps.keySet();
        System.out.println(keys); // [运动鞋, 牛仔裤, 靴子]

        // 此映射中包含的值的 Collection 视图
        Collection values = maps.values();
        System.out.println(values); // [450, 180, 300]

        // 从指定映射中将所有映射关系复制到此映射中
        Map map2 = new HashMap();
        map2.put("雨衣", 90);
        map2.put("胶鞋", 40);
        maps.putAll(map2);
        System.out.println(maps); // {运动鞋=450, 胶鞋=40, 雨衣=90, 牛仔裤=180, 靴子=300}


        // 通过键找值
        for (String key : keys) {
            int v = maps.get(key);
            System.out.println(key + "=====>" + v);
        }

        // 通过forEach循环遍历
//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String k, Integer v) {
//                System.out.println(k + "=====>" + v);
//            }
//        });

        maps.forEach((k, v) -> System.out.println(k + "=====>" + v));
    }
}
