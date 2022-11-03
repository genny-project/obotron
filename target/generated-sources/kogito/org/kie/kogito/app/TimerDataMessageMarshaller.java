/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.app;

import java.io.IOException;
import org.infinispan.protostream.MessageMarshaller;

public class TimerDataMessageMarshaller implements MessageMarshaller<life.genny.kogito.common.models.TimerData> {

    public java.lang.Class<life.genny.kogito.common.models.TimerData> getJavaClass() {
        return life.genny.kogito.common.models.TimerData.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.TimerData";
    }

    public life.genny.kogito.common.models.TimerData readFrom(ProtoStreamReader reader) throws IOException {
        life.genny.kogito.common.models.TimerData value = new life.genny.kogito.common.models.TimerData();
        value.setCurrentMilestone(reader.readObject("currentMilestone", life.genny.kogito.common.models.TimerEvent.class));
        value.setElapsedMin(reader.readLong("elapsedMin"));
        value.setExpired(reader.readBoolean("expired"));
        value.setExpiryMin(reader.readLong("expiryMin"));
        value.setExpiryTimeStamp(reader.readLong("expiryTimeStamp"));
        value.setIntervalMin(reader.readLong("intervalMin"));
        value.setStartEpoch(reader.readLong("startEpoch"));
        value.setTimerEventsArray(reader.readArray("timerEventsArray", life.genny.kogito.common.models.TimerEvent.class));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, life.genny.kogito.common.models.TimerData t) throws IOException {
        writer.writeObject("currentMilestone", t.getCurrentMilestone(), life.genny.kogito.common.models.TimerEvent.class);
        writer.writeLong("elapsedMin", t.getElapsedMin());
        writer.writeBoolean("expired", t.isExpired());
        writer.writeLong("expiryMin", t.getExpiryMin());
        writer.writeLong("expiryTimeStamp", t.getExpiryTimeStamp());
        writer.writeLong("intervalMin", t.getIntervalMin());
        writer.writeLong("startEpoch", t.getStartEpoch());
        writer.writeArray("timerEventsArray", t.getTimerEventsArray(), life.genny.kogito.common.models.TimerEvent.class);
    }
}
