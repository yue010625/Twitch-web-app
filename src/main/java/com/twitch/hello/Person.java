package com.twitch.hello;


public record Person(
        String name,
        String company,
        Address homeAddress,
        Book favoriteBook
) {
}

