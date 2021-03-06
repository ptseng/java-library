package com.urbanairship.api.push.parse;

import com.urbanairship.api.common.parse.DateFormats;
import com.urbanairship.api.push.model.PushOptions;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import java.util.Map;
import java.io.IOException;

public class PushOptionsSerializer extends JsonSerializer<PushOptions> {
    @Override
    public void serialize(PushOptions payload, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();

        if (payload.getExpiry().isPresent()) {
            jgen.writeObjectField("expiry", payload.getExpiry().get());
        }

        jgen.writeEndObject();
    }
}
