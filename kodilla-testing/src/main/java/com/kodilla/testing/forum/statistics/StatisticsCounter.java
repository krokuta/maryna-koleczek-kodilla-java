package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class StatisticsCounter {
    Statistics statistics;
    public double usersCount;
    public double postsCount;
    public double commentsCount;
    public double meanPostsPerUser;
    public double meanCommentsPerUser;
    public double meanCommentsPerPost;

    public StatisticsCounter(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        int usersNb = statistics.usersNames().size();
        usersCount = (double)usersNb;
        int postsNb = statistics.postsCount();
        postsCount = (double)postsNb;
        int commentsNb = statistics.commentsCount();
        commentsCount = (double)commentsNb;
        meanPostsPerUser = postsCount/usersCount;
        meanCommentsPerUser = commentsCount/usersCount;
        meanCommentsPerPost = commentsCount/postsCount;
    }

    public ArrayList<String> showStatistics(){
        return null;
    }

    public double getUsersCount(){
        return usersCount;
    }

    public double getPostsCount(){
        return postsCount;
    }

    public double getCommentsCount(){
        return commentsCount;
    }

}
