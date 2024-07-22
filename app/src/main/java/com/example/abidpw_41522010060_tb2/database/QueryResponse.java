package com.example.abidpw_41522010060_tb2.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}
