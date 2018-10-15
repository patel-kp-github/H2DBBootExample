package com.kp.H2DBProgram;

import java.util.Date;

public class Snippet {
 
    private String id;
    private String title;
    private String code;
 
    private Date created;
 
    private Date modified;
 
 
    public Snippet() {
        this.id = java.util.UUID.randomUUID().toString();
        this.title = title;
        this.code = code;
        this.created = new Date();
        this.modified = new Date();
    }
 
    public String getId() {
        return id;
    }
 
 
    public String getTitle() {
        return title;
    }
 
    public String getCode() {
        return code;
    }
 
    public Date getCreated() {
        return created;
    }
 
    public Date getModified() {
        return modified;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public void setCreated(java.sql.Date created) {
        this.created = created;
    }
 
    public void setModified(java.sql.Date modified) {
        this.modified = modified;
    }
}

