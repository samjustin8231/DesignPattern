package com.example.designpattern.behavior.observer.general;

/**
 * @author sunyajun
 * @date 2020/4/14 3:59 PM
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}
