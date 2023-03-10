/**
 * Represents the search simulator.
 */

package computation;


import utils.ResponseGenerator;

public class SearchSimulator {
    public static void processClientRequest() throws Exception {
        long time1 = System.currentTimeMillis();
        System.out.println("Request processing started at: " + time1);
        Thread.sleep(10 * 1000);
        long time2 = System.currentTimeMillis();
        System.out.println("Request processing ended at: " + time2);

        ResponseGenerator.generatorResponseHTML(time1, time2);

    }
}