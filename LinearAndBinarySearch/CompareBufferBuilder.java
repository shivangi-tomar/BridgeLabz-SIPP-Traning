class CompareBufferBuilder {
    public static void main(String[] args) {
        int n = 1000000; // 1 million

        // ------------ StringBuffer ------------
        long startBuffer = System.nanoTime(); // Start time

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }

        long endBuffer = System.nanoTime(); // End time
        long timeBuffer = endBuffer - startBuffer;

        // ------------ StringBuilder ------------
        long startBuilder = System.nanoTime(); // Start time

        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbd.append("hello");
        }

        long endBuilder = System.nanoTime(); // End time
        long timeBuilder = endBuilder - startBuilder;

        // ------------ Result ------------
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " nanoseconds");

        // Optional comparison:
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster!");
        } else {
            System.out.println("StringBuffer is faster (rare, but possible in low thread contention).");
        }
    }
}
