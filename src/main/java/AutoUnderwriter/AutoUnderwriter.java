package AutoUnderwriter;

public class AutoUnderwriter {

    private final long id;
    private final String content;

    public AutoUnderwriter(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}