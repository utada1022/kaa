/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.operations.service.akka.messages.core.user;

import org.kaaproject.kaa.server.operations.service.event.GlobalRouteInfo;

public class GlobalRouteInfoMessage implements GlobalUserAwareMessage, TenantAwareMessage {
    
    private final GlobalRouteInfo message;

    public GlobalRouteInfoMessage(GlobalRouteInfo message) {
        this.message = message;
    }
    
    @Override
    public String getUserId() {
        return message.getUserId();
    }

    @Override
    public String getTenantId() {
        return message.getTenantId();
    }

    public GlobalRouteInfo getMessage() {
        return message;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GlobalRouteInfoMessage [message=");
        builder.append(message);
        builder.append("]");
        return builder.toString();
    }
}
