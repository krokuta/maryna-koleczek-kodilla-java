package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfFilteredUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthdate().getYear() < 1999)
                .filter(user -> user.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("size of the result map: " + mapOfFilteredUsers.size());
        mapOfFilteredUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " >> " + entry.getValue())
                .forEach(entry -> System.out.println(entry));
    }
}