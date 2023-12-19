package com.exam.userms.builder;

import com.exam.userms.model.UserPage;

public class UserPageBuilder {
    private UserPage userPage = new UserPage();
    
    public UserPageBuilder setPage (int page){
        userPage.setPage(page);
        return this;
    }
    public UserPageBuilder setTotalPages (int totalPages){
        userPage.setTotalPages(totalPages);
        return this;
    }
    public UserPageBuilder setSize (int size){
        userPage.setSize(size);
        return this;
    }
    public UserPageBuilder setTotalElement (Long totalElement){
        userPage.setTotalElement(totalElement);
        return this;
    }
    public UserPageBuilder setNext (Integer page,Integer size,Long totalElement){
        userPage.setNext(page,size,totalElement);
        return this;
    }
    public UserPageBuilder setPrevious (Integer page,Integer size,Long totalElement){
        userPage.setPrevious(page,size,totalElement);
        return this;
    }
    public UserPageBuilder setData (Object data){
        userPage.setData(data);
        return this;
    }
    public UserPage build (){
        return userPage;
    }
}
