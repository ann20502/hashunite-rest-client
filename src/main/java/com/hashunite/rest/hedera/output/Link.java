package com.hashunite.rest.hedera.output;

public class Link {

    public final String next;

    public Link() {
        this.next = null;
    }

    public Link(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Link{" +
                "next='" + next + '\'' +
                '}';
    }
}
