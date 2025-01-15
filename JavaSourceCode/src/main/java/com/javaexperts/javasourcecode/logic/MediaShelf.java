package com.javaexperts.javasourcecode.logic;

import com.javaexperts.javasourcecode.models.Book;

import java.util.Optional;

// Stack
final public class MediaShelf<T> {
    private T[] mediaArray;
    private int index;
    final private int capacity;

    public MediaShelf(int capacity) {
        this.index = 0;
        this.capacity = capacity;
        this.mediaArray = (T[]) new Object[capacity];
    }

    public boolean push(T media) {
        if (index >= capacity) {
            return false;
        }

        mediaArray[index] = media;
        index++;

        return true;
    }

    public boolean pop() {
        if (index <= 0) {
            return false;
        } else {
            mediaArray[index] = null;
            index--;
            return true;
        }
    }

    public Optional<T> getMedia(int index) {
        if (index >= capacity || index < 0 || mediaArray[index] == null) {
            return Optional.empty();
        }

        return Optional.of(mediaArray[index]);
    }
}
