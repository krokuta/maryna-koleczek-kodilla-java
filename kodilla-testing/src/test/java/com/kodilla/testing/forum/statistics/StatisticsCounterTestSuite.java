package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterTestSuite {
    @Test
    public void testCalculateAdvStatisticsMock1(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add(0, "u1");
        users.add(1, "u2");
        users.add(2, "u3");
        users.add(3, "u4");
        users.add(4, "u5");
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 5;
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }

    @Test
    public void testCalculateAdvStatisticsMock2(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add(0, "u1");
        users.add(1, "u2");
        users.add(2, "u3");
        users.add(3, "u4");
        users.add(4, "u5");
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 5;
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }

    @Test
    public void testCalculateAdvStatisticsMock3(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add(0, "u1");
        users.add(1, "u2");
        users.add(2, "u3");
        users.add(3, "u4");
        users.add(4, "u5");
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts = 5;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }

    @Test
    public void testCalculateAdvStatisticsMock4(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add(0, "u1");
        users.add(1, "u2");
        users.add(2, "u3");
        users.add(3, "u4");
        users.add(4, "u5");
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts = 6;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 5;
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }

    @Test
    public void testCalculateAdvStatisticsMock5(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        users.add(0, "u1");
        users.add(1, "u2");
        users.add(2, "u3");
        users.add(3, "u4");
        users.add(4, "u5");
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts = 5;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 6;
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }

    @Test
    public void testCalculateAdvStatisticsMock6(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for(int n = 0; n < 100; n++){
            users.add("u"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts = 5;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 5;
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }

    @Test
    public void testCalculateAdvStatisticsMock7(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        int posts = 5;
        when(statisticsMock.postsCount()).thenReturn(posts);
        int comments = 5;
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }
}
