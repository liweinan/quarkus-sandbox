package io.weli;

import io.weli.db.User;

import java.util.List;

public class UsersWithTotalPage {
    public List<Object> users;
    public int totalPage;

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<Object> getUsers() {
        return users;
    }

    public void setUsers(List<Object> users) {
        this.users = users;
    }
}