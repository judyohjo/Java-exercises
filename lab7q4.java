abstract class FileComponent {
    protected FileComponent parent;
    protected String name;
    public FileComponent(String newName) {
        name = newName;
    }
    public void setParent(FileComponent NewParent) {
        parent = NewParent;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public FileComponent getParent() {
        return parent;
    }
    public String toString() {
        String line = "";
        if(parent == null) {
            line = name;
        } else {
            line = name;
            System.out.print(parent.toString() + "->");
        }
        return line;
    }
    abstract void display(String indent);
}
