package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsQuantity;

    public ForumUser(final int userID, final String username, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postsQuantity) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQuantity = postsQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsQuantity=" + postsQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (getUserID() != forumUser.getUserID()) return false;
        if (getSex() != forumUser.getSex()) return false;
        if (getPostsQuantity() != forumUser.getPostsQuantity()) return false;
        if (!getUsername().equals(forumUser.getUsername())) return false;
        return getBirthdate().equals(forumUser.getBirthdate());
    }

    @Override
    public int hashCode() {
        int result = getUserID();
        result = 31 * result + getUsername().hashCode();
        result = 31 * result + (int) getSex();
        result = 31 * result + getBirthdate().hashCode();
        result = 31 * result + getPostsQuantity();
        return result;
    }
}
