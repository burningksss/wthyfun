package com.wt.model;

import java.util.Set;

/**
 * Created by wt on 2018/7/10.
 */
public class Module {

    private Integer mid;

    private String mname;

    private Set<Role> roles;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
