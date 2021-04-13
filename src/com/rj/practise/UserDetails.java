package com.rj.practise;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Id
    private int userId;
    //use of @Basic annotation to add some extra property to field apart from default one added by hibernate
    //@Basic(fetch = FetchType.LAZY,optional = true)
    private  String userName;
    //@Temporal is used to save part of date time
    @Temporal(TemporalType.TIMESTAMP)
    private Date joinedDate;
    private String address;
    //long object
    @Lob
    private String description;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
