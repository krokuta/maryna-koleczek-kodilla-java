package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
//    private final ForumUser forumUser;
//
//    public Forum(final ForumUser forumUser) {
//        this.forumUser = forumUser;
//    }

    public static List<ForumUser> getUserList(){
        ForumUser forumUser1 = new ForumUser(12301, "username1", 'M', 1990, 7, 24, 20);
        ForumUser forumUser2 = new ForumUser(12302, "username2", 'K', 1990, 5, 24, 0);
        ForumUser forumUser3 = new ForumUser(12303, "username3", 'M', 2005, 6, 24, 0);
        ForumUser forumUser4 = new ForumUser(12304, "username4", 'K', 2006, 7, 24, 33);
        ForumUser forumUser5 = new ForumUser(12305, "username5", 'M', 1990, 8, 24, 60);
        ForumUser forumUser6 = new ForumUser(12306, "username6", 'K', 1990, 10, 24, 0);
        ForumUser forumUser7 = new ForumUser(12307, "username7", 'M', 2003, 11, 24, 0);
        ForumUser forumUser8 = new ForumUser(12308, "username8", 'K', 2003, 2, 24, 46);
        ForumUser forumUser9 = new ForumUser(12309, "username9", 'M', 1990, 3, 24, 25);
        ForumUser forumUser10 = new ForumUser(12310, "username10", 'K', 2004, 4, 24, 0);
        final List<ForumUser> listOfUsers = new ArrayList<>();
        listOfUsers.add(forumUser1);
        listOfUsers.add(forumUser2);
        listOfUsers.add(forumUser3);
        listOfUsers.add(forumUser4);
        listOfUsers.add(forumUser5);
        listOfUsers.add(forumUser6);
        listOfUsers.add(forumUser7);
        listOfUsers.add(forumUser8);
        listOfUsers.add(forumUser9);
        listOfUsers.add(forumUser10);
        return new ArrayList<ForumUser>(listOfUsers);
    }
}
