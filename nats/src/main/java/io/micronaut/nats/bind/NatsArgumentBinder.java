/*
 * Copyright 2017-2019 original authors
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

package io.micronaut.nats.bind;

import io.micronaut.core.bind.ArgumentBinder;
import io.nats.client.Message;

/**
 * An interface for Nats argument binding.
 *
 * @param <T> The type of argument to be bound
 * @author jgrimm
 * @since 1.0.0
 */
public interface NatsArgumentBinder<T> extends ArgumentBinder<T, Message> { }