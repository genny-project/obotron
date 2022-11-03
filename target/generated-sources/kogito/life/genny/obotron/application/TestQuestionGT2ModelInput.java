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

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "testQuestionGT2", name = "TestQuestionGT2", hidden = true)
@ProcessInput(processName = "testQuestionGT2")
public class TestQuestionGT2ModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<TestQuestionGT2Model> {

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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "data")
    @javax.validation.Valid()
    private life.genny.kogito.common.models.S2SData data;

    public life.genny.kogito.common.models.S2SData getData() {
        return data;
    }

    public void setData(life.genny.kogito.common.models.S2SData data) {
        this.data = data;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "processId")
    @javax.validation.Valid()
    private java.lang.String processId;

    public java.lang.String getProcessId() {
        return processId;
    }

    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
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
    public TestQuestionGT2Model toModel() {
        TestQuestionGT2Model result = new TestQuestionGT2Model();
        result.setSourceCode(getSourceCode());
        result.setEntityCode(getEntityCode());
        result.setData(getData());
        result.setProcessId(getProcessId());
        result.setQuestionCode(getQuestionCode());
        result.setButtonEvents(getButtonEvents());
        result.setTargetCode(getTargetCode());
        result.setPcmCode(getPcmCode());
        return result;
    }
}
