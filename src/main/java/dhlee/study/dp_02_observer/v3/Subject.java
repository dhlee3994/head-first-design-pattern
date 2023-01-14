package dhlee.study.dp_02_observer.v3;

interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
