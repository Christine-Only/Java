package com.christine.dy22_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("肖生克的救赎", "1994", "弗兰克"));
        movies.add(new Movie("霸王别姬", "1993", "陈凯歌"));
        movies.add(new Movie("阿甘正传", "1994", "罗伯特"));

        System.out.println(movies);

        for (Movie movie : movies) {
            System.out.println("电影名称是：" + movie.getMovieName());
            System.out.println("电影上映日期是：" + movie.getDate());
            System.out.println("电影导演是：" + movie.getDirector());
        }
    }
}
