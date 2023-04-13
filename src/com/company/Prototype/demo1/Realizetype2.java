package com.company.Prototype.demo1;

/**
 * @author mjn
 * @date 2022-6-19
 */
public class Realizetype2 implements Cloneable {

    private User user;

    public Realizetype2() {
    }

    public Realizetype2(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Realizetype2 r = (Realizetype2) super.clone();
        User user = new User();
        user.setName(r.user.getName());
        r.setUser(user);
        return r;
    }
}
