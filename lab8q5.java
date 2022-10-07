class MessageChannelObserver implements Observer {
    public void update(Observable o, Object message) {
        System.out.printf("MessageChannel:%s\n", message);
    }
}
