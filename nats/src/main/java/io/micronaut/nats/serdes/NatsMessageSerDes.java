/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.nats.serdes;

import javax.annotation.Nullable;

import io.micronaut.core.order.Ordered;
import io.micronaut.core.type.Argument;
import io.nats.client.Message;

/**
 * Responsible for serializing and deserializing Nats message bodies.
 *
 * @param <T> The type to be serialized/deserialized
 * @author jgrimm
 * @since 1.0.0
 */
public interface NatsMessageSerDes<T> extends Ordered {

    /**
     * Deserializes the message into the requested type.
     *
     * @param message The message to deserialize
     * @param argument The type to be returned
     * @return The deserialized body
     */
    @Nullable
    T deserialize(Message message, Argument<T> argument);

    /**
     * Serializes the data into a byte[] to be published
     * to nats.
     *
     * @param data The data to serialize
     * @return The message body
     */
    @Nullable
    byte[] serialize(@Nullable T data);

    /**
     * Determines if this serdes supports the given type.
     *
     * @param type The type
     * @return True if the type is supported
     */
    boolean supports(Argument<T> type);
}
