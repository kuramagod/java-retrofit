package com.campus.retrofit.response;

public class PostResponse {

    private Integer id;

    private Integer userid;

    private String title;

    private String body;

    @Override
    public String toString() {
        return "PostResponse{" +
                "body='" + body + '\'' +
                ", id=" + id +
                ", userid=" + userid +
                ", title='" + title + '\'' +
                '}';
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
