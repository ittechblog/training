package com.huaxun.flyway;

import org.flywaydb.core.Flyway;

/**
 * Created by Administrator on 2016/2/26.
 */
public class DBMigration {
    public static void main(String[] args) {
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:mysql://localhost:3306/fly", "root", "clds");

        //clean
//        flyway.clean();

        // Start the db.migration
        flyway.migrate();
    }
}
