package com.urbanairship.api.push.parse.notification.actions;

import com.urbanairship.api.push.model.notification.actions.DeepLinkAction;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;

public final class DeepLinkSerializer extends JsonSerializer<DeepLinkAction> {
    @Override
    public void serialize(DeepLinkAction value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        try {
            jgen.writeObjectField("type", "deep_link");
            jgen.writeObjectField("content", value.getLink());
        }
        finally {
            jgen.writeEndObject();
        }
    }
}