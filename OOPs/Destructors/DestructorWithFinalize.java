class Resource {
    @Override
    protected void finalize() {
        System.out.println("Resource is destroyed");
    }
}

public class DestructorWithFinalize {
    public static void main(String[] args) {
        Resource res = new Resource();
        System.out.println(res.toString()); // Use the variable
        res = null; // Make the object eligible for garbage collection

        // Request garbage collection
        System.gc();

        // Delay to allow garbage collection
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
