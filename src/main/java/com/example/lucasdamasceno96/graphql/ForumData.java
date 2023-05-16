package com.example.lucasdamasceno96.graphql;

record Post(String id, String content) {

}

record Comment(String id,String content , String postId) {}
