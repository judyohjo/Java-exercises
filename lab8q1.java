class MessageAgency {
    private String message;
    private boolean changed;
    private ArrayList<Channel> channels = new ArrayList<Channel>();
    public void addObserver(Channel channel) {
        channels.add(channel);
    }
    public void deleteObserver(Channel channel) {
        channels.remove(channel);
    }
    public void setChanged() {
        changed = true;
    }
    public void setMessage(String newMessage) {
        setChanged();
        message = newMessage;
        notifyObservers();
    }
    public void notifyObservers() {
        for(Channel channel : channels) {
            channel.update(message);
        }
    }
    public int countObservers() {
        return channels.size();
    }
}
