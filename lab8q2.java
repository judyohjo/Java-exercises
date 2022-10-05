class NewsChannel implements Channel {
    public void update(String message) {
        System.out.printf("NewsChannel:%s\n", message);
    }
}
