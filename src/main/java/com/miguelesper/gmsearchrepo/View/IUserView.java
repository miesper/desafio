package com.miguelesper.gmsearchrepo.View;

import com.miguelesper.gmsearchrepo.Model.Repository;
import com.miguelesper.gmsearchrepo.Model.User;

import java.util.List;

public interface IUserView {
    void getUserDetailResult(User user);
    void getUserRepositories(List<Repository> repositories);
}
