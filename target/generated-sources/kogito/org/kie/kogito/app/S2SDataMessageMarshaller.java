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

public class S2SDataMessageMarshaller implements MessageMarshaller<life.genny.kogito.common.models.S2SData> {

    public java.lang.Class<life.genny.kogito.common.models.S2SData> getJavaClass() {
        return life.genny.kogito.common.models.S2SData.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.S2SData";
    }

    public life.genny.kogito.common.models.S2SData readFrom(ProtoStreamReader reader) throws IOException {
        life.genny.kogito.common.models.S2SData value = new life.genny.kogito.common.models.S2SData();
        value.setAbortReason(reader.readObject("abortReason", life.genny.kogito.common.models.S2SData.EAbortReason.class));
        value.setButtonEvents(reader.readString("buttonEvents"));
        value.setLocation(reader.readString("location"));
        value.setParent(reader.readString("parent"));
        value.setPcmCode(reader.readString("pcmCode"));
        value.setProductCode(reader.readString("productCode"));
        value.setQuestionCode(reader.readString("questionCode"));
        value.setSourceCode(reader.readString("sourceCode"));
        value.setTargetCode(reader.readString("targetCode"));
        value.setTimerData(reader.readObject("timerData", life.genny.kogito.common.models.TimerData.class));
        value.setToken(reader.readString("token"));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, life.genny.kogito.common.models.S2SData t) throws IOException {
        writer.writeObject("abortReason", t.getAbortReason(), life.genny.kogito.common.models.S2SData.EAbortReason.class);
        writer.writeString("buttonEvents", t.getButtonEvents());
        writer.writeString("location", t.getLocation());
        writer.writeString("parent", t.getParent());
        writer.writeString("pcmCode", t.getPcmCode());
        writer.writeString("productCode", t.getProductCode());
        writer.writeString("questionCode", t.getQuestionCode());
        writer.writeString("sourceCode", t.getSourceCode());
        writer.writeString("targetCode", t.getTargetCode());
        writer.writeObject("timerData", t.getTimerData(), life.genny.kogito.common.models.TimerData.class);
        writer.writeString("token", t.getToken());
    }
}
