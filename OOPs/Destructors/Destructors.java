class Resource {
    public void destroy() {
        System.out.println("Resource is destroyed");
    }
}

public class Destructors {
    public static void main(String[] args) {
        Resource res = new Resource();

        // Explicitly clean up the resource
        res.destroy();
    }
}
