package org.sci_web.api_springboot.pages.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class Page {
    @Id
    private long page_id;

    @Column("title")
    private String title;

    @Column("content")
    private String content;

    public Page(long page_id, String title, String content) {
        this.page_id = page_id;
        this.title = title;
        this.content = content;
    }
    public Page() {}
    public long getPage_id() {
        return page_id;
    }
    public void setPage_id(long page_id) {
        this.page_id = page_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
