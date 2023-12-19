package com.exam.userms.model;

public class UserPage {
    private Integer page;
    private Integer totalPages;
    private Integer size;
    private Long totalElement;
    private String next;
    private String previous;
    private Object data;

    public UserPage() {
    }

    public UserPage(int page, int size, Object data) {
        setPage(page);
        this.size = size;
        this.data = data;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getNext() {
        return next;
    }

    public void setNext(Integer page, Integer size, Long totalElement) {
        if (page != null && size != null && totalElement > size) {
            StringBuilder builder = new StringBuilder("http://localhost:8080/api/user");
            builder.append("?page=" + (page + 1));
            builder.append("&size=" + size);
            this.next = builder.toString();
        }
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(Integer page, Integer size, Long totalElement) {
        if (page != null && size != null && totalElement > size && page > 1) {
            StringBuilder builder = new StringBuilder("http://localhost:8080/api/user");
            builder.append("?page=" + (page - 1));
            builder.append("&size=" + size);
            this.previous = builder.toString();
        }
    }

    public Long getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(Long totalElement) {
        this.totalElement = totalElement;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
