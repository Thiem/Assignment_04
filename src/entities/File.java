package entities;

public class File {
    private String path;
    private String content;

    public File(){

    }

    public File(String path, String content) {
        this.path = path;
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "File{" +
                "path='" + path + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
