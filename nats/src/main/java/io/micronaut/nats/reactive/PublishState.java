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
package io.micronaut.nats.reactive;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/**
 * Stores the state of a RabbitMQ message to be published.
 *
 * @author James Kleeh
 * @since 1.1.0
 */
@Immutable
public class PublishState {

    private final String subject;
    private final byte[] body;

    /**
     * Default constructor.
     *
     * @param subject The subject
     * @param body The body
     */
    public PublishState(String subject,  @Nullable byte[] body) {
        this.subject = subject;
        this.body = body;
    }

    /**
     * @return The subject to publish the message to
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @return The message body
     */
    @Nullable
    public byte[] getBody() {
        return body;
    }
}
