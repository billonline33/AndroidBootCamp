package com.example.bhuang.mvp.user;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;


/**
 * Created by bhuang on 7/19/2017.
 */

public class ProfileViewModel extends BaseObservable {

    private boolean isLoaded;
    private boolean isFriend;

    public ProfileViewModel(boolean isLoaded, boolean isFriend) {
        this.isLoaded = isLoaded;
        this.isFriend = isFriend;
    }

    @Bindable
    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
        //notifyPropertyChanged(BR);
    }

    @Bindable
    public boolean isFriend() {
        return isFriend;
    }

    public void setFriend(boolean friend) {
        isFriend = friend;
    }


    @Override
    public void notifyPropertyChanged(int fieldId) {
        super.notifyPropertyChanged(fieldId);
    }

    public void changeFriendshipStatus()
    {
        Log.d("ChangeFriendShip","ChangeFriendshipStatus Changed");
    }
}
