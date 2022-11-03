/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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
package life.genny.obotron.application;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "callProcessQuestionsGT", name = "CallProcessQuestionsGT", hidden = true)
@ProcessInput(processName = "callProcessQuestionsGT")
public class CallProcessQuestionsGTModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<CallProcessQuestionsGTModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sourceCode")
    @javax.validation.Valid()
    private java.lang.String sourceCode;

    public java.lang.String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(java.lang.String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "entityCode")
    @javax.validation.Valid()
    private java.lang.String entityCode;

    public java.lang.String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(java.lang.String entityCode) {
        this.entityCode = entityCode;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "questionCode")
    @javax.validation.Valid()
    private java.lang.String questionCode;

    public java.lang.String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(java.lang.String questionCode) {
        this.questionCode = questionCode;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "buttonEvents")
    @javax.validation.Valid()
    private java.lang.String buttonEvents;

    public java.lang.String getButtonEvents() {
        return buttonEvents;
    }

    public void setButtonEvents(java.lang.String buttonEvents) {
        this.buttonEvents = buttonEvents;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "targetCode")
    @javax.validation.Valid()
    private java.lang.String targetCode;

    public java.lang.String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(java.lang.String targetCode) {
        this.targetCode = targetCode;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "timerData")
    @javax.validation.Valid()
    private life.genny.kogito.common.models.TimerData timerData;

    public life.genny.kogito.common.models.TimerData getTimerData() {
        return timerData;
    }

    public void setTimerData(life.genny.kogito.common.models.TimerData timerData) {
        this.timerData = timerData;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "pcmCode")
    @javax.validation.Valid()
    private java.lang.String pcmCode;

    public java.lang.String getPcmCode() {
        return pcmCode;
    }

    public void setPcmCode(java.lang.String pcmCode) {
        this.pcmCode = pcmCode;
    }

    @Override()
    public CallProcessQuestionsGTModel toModel() {
        CallProcessQuestionsGTModel result = new CallProcessQuestionsGTModel();
        result.setSourceCode(getSourceCode());
        result.setEntityCode(getEntityCode());
        result.setQuestionCode(getQuestionCode());
        result.setButtonEvents(getButtonEvents());
        result.setTargetCode(getTargetCode());
        result.setTimerData(getTimerData());
        result.setPcmCode(getPcmCode());
        return result;
    }
}
