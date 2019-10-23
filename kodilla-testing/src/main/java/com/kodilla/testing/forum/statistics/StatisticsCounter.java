package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double meanPostsPerUser;
    private double meanCommentsPerUser;
    private double meanCommentsPerPost;

    public StatisticsCounter(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        meanPostsPerUser = statistics.postsCount()/statistics.usersNames().size();
        meanCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
        meanCommentsPerPost = statistics.commentsCount()/statistics.postsCount();
    }

}
