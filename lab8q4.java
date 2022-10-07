class MessageAgencyObservable extends Observable {
    private String message;
    public void setMessage(String newMessage) {
        setChanged();
        message = newMessage;
        notifyObservers(message);
    }
}
