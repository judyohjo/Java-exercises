class Folder extends FileComponent {
    private ArrayList<FileComponent> elements = new ArrayList<FileComponent>();
    public Folder(String newName) {
        super(newName);
    }
    public void addFileComponent(FileComponent fc) {
        elements.add(fc);
        fc.setParent(this);
    }
    public void removeFileComponent(FileComponent fc) {
        elements.remove(fc);
        fc.setParent(null);
        
    }
    public void display(String indent) {
        indent += " ";
        System.out.println(indent + name);
        for(int i=0; i<elements.size(); i++) {
            elements.get(i).display(indent);
            
        }
        
    }
}
