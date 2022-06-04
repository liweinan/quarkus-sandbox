package io.weli.db;


import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.core.Response;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static javax.ws.rs.core.Response.Status.CREATED;
import static javax.ws.rs.core.Response.Status.NO_CONTENT;

@ApplicationScoped
public class Commons {

    public String uuid() {
        return UUID.randomUUID().toString();
    }

    public Jsonb jsonb = JsonbBuilder.create();

    public LocalDateTime now() {
        return LocalDateTime.now();
    }


}
