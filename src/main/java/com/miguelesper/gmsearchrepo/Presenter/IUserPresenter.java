package com.miguelesper.gmsearchrepo.Presenter;

public interface IUserPresenter{
    void getUserDetail(String userId);
    void getUserRepositories(String userName, int pageIndex);
}
