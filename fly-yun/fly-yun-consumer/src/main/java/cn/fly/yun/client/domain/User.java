package cn.fly.yun.client.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -3984873076822688758L;

    @NotEmpty(message = "isv.User.id.is.null")
    private String id ;
    @NotEmpty(message = "isv.User.name.is.null")
    private String name ;

    private int score ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
