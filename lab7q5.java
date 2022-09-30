class File extends FileComponent {
    private String contents;
    public File(String newName, String newString) {
        super(newName);
        contents = newString;
    }
    public String getContents() {
        return contents;
    }
    public void display(String indent) {
        int count = 0;
        count++;
        String space="";
        for(int i=0; i<count; i++) {
            space += " ";
        }
        System.out.println(space + super.toString() + " contents : " + contents.toString());
        
    }
}
