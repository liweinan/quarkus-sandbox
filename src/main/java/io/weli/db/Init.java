package io.weli.db;

import io.quarkus.runtime.StartupEvent;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class Init {

    @Inject
    Commons c;

    private final boolean schemaCreate;

    public Init(@ConfigProperty(name = "schema.create", defaultValue = "true") boolean schemaCreate) {
        this.schemaCreate = schemaCreate;
    }

    void onStart(@Observes StartupEvent ev) {
        if (schemaCreate) {
            initdb();
        }
    }

    @ConfigProperty(name = "quarkus.datasource.jdbc.url")
    String datasourceUrl;

    @ConfigProperty(name = "quarkus.datasource.username")
    String datasourceUsername;

//    @ConfigProperty(name = "quarkus.datasource.password")
//    String datasourcePassword;

    @Inject
    Logger logger;


    @Transactional
    void initdb() {
        logger.info("...I.N.I.T...");
        logger.debug("datasourceUrl -> " + datasourceUrl);
        logger.debug("datasourceUsername -> " + datasourceUsername);
//        logger.debug("datasourcePassword -> " + datasourcePassword);

        var user1 = new User(c.uuid(), "张三");
        var user2 = new User(c.uuid(), "李四");
        var user3 = new User(c.uuid(), "王五");
        var user4 = new User(c.uuid(), "小李");
        var user5 = new User(c.uuid(), "木老师");
        var user6 = new User(c.uuid(), "buddy");
        var user7 = new User(c.uuid(), "阿男");

        user1.persistAndFlush();
        user2.persistAndFlush();
        user3.persistAndFlush();
        user4.persistAndFlush();
        user5.persistAndFlush();
        user6.persistAndFlush();
        user7.persistAndFlush();
    }

}
