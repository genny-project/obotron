package life.genny.obotron.application;

import life.genny.obotron.application.TestQuestionGT2Model;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("testQuestionGT2")
@io.quarkus.runtime.Startup()
public class TestQuestionGT2Process extends org.kie.kogito.process.impl.AbstractProcess<life.genny.obotron.application.TestQuestionGT2Model> {

    @javax.inject.Inject()
    @javax.inject.Named("callProcessQuestionsGT")
    org.kie.kogito.process.Process<CallProcessQuestionsGTModel> processcallProcessQuestionsGT;

    public TestQuestionGT2Process(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        this(app, correlations, factory, new org.kie.kogito.handlers.NavigationService_redirectByQuestionCode_6_Handler(), new org.kie.kogito.handlers.GennyService_abort_1_Handler(), new org.kie.kogito.handlers.GennyService_abort_2_Handler());
    }

    @javax.inject.Inject()
    public TestQuestionGT2Process(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory, org.kie.kogito.handlers.NavigationService_redirectByQuestionCode_6_Handler navigationService_redirectByQuestionCode_6_Handler, org.kie.kogito.handlers.GennyService_abort_1_Handler gennyService_abort_1_Handler, org.kie.kogito.handlers.GennyService_abort_2_Handler gennyService_abort_2_Handler) {
        super(app, java.util.Arrays.asList(navigationService_redirectByQuestionCode_6_Handler, gennyService_abort_1_Handler, gennyService_abort_2_Handler), correlations, factory);
        activate();
    }

    public TestQuestionGT2Process() {
    }

    @Override()
    public life.genny.obotron.application.TestQuestionGT2ProcessInstance createInstance(life.genny.obotron.application.TestQuestionGT2Model value) {
        return new life.genny.obotron.application.TestQuestionGT2ProcessInstance(this, value, this.createProcessRuntime());
    }

    public life.genny.obotron.application.TestQuestionGT2ProcessInstance createInstance(java.lang.String businessKey, life.genny.obotron.application.TestQuestionGT2Model value) {
        return new life.genny.obotron.application.TestQuestionGT2ProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public life.genny.obotron.application.TestQuestionGT2ProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, life.genny.obotron.application.TestQuestionGT2Model value) {
        return new life.genny.obotron.application.TestQuestionGT2ProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public life.genny.obotron.application.TestQuestionGT2Model createModel() {
        return new life.genny.obotron.application.TestQuestionGT2Model();
    }

    public life.genny.obotron.application.TestQuestionGT2ProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((life.genny.obotron.application.TestQuestionGT2Model) value);
    }

    public life.genny.obotron.application.TestQuestionGT2ProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (life.genny.obotron.application.TestQuestionGT2Model) value);
    }

    public life.genny.obotron.application.TestQuestionGT2ProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.obotron.application.TestQuestionGT2ProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public life.genny.obotron.application.TestQuestionGT2ProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.obotron.application.TestQuestionGT2ProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("testQuestionGT2", true);
        factory.variable("sourceCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("data", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(life.genny.kogito.common.models.S2SData.class), null, "customTags", null);
        factory.variable("entityCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("questionCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("targetCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("buttonEvents", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("pcmCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("processId", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", "input");
        factory.name("TestQuestionGT2");
        factory.packageName("life.genny.obotron.application");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.addCompensationContext("testQuestionGT2");
        factory.metaData("Compensation", true);
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("life.genny.obotron.setupBaseEntitys.GennyService");
        factory.imports("life.genny.kogito.common.service.BaseEntityService");
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode1 = factory.workItemNode(1);
        workItemNode1.name("Abort");
        workItemNode1.workName("life.genny.obotron.setupBaseEntitys.GennyService_abort_1_Handler");
        workItemNode1.workParameter("NodeName", "Abort");
        workItemNode1.workParameter("Interface", "life.genny.obotron.setupBaseEntitys.GennyService");
        workItemNode1.workParameter("Operation", "abort");
        workItemNode1.workParameter("interfaceImplementationRef", "life.genny.obotron.setupBaseEntitys.GennyService");
        workItemNode1.workParameter("operationImplementationRef", "abort");
        workItemNode1.workParameter("implementation", "Java");
        workItemNode1.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("entityCode", "entityCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_82225491-ECAA-4896-A550-89ADBB14A7C7_codeInputX", "code", "String", null), null, null));
        workItemNode1.done();
        workItemNode1.metaData("UniqueId", "_82225491-ECAA-4896-A550-89ADBB14A7C7");
        workItemNode1.metaData("Implementation", "Java");
        workItemNode1.metaData("elementname", "Abort");
        workItemNode1.metaData("Type", "Service Task");
        workItemNode1.metaData("OperationRef", "_82225491-ECAA-4896-A550-89ADBB14A7C7_ServiceOperation");
        workItemNode1.metaData("x", 850);
        workItemNode1.metaData("width", 154);
        workItemNode1.metaData("y", 365);
        workItemNode1.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode2 = factory.workItemNode(2);
        workItemNode2.name("Abort");
        workItemNode2.workName("life.genny.obotron.setupBaseEntitys.GennyService_abort_2_Handler");
        workItemNode2.workParameter("NodeName", "Abort");
        workItemNode2.workParameter("Interface", "life.genny.obotron.setupBaseEntitys.GennyService");
        workItemNode2.workParameter("Operation", "abort");
        workItemNode2.workParameter("interfaceImplementationRef", "life.genny.obotron.setupBaseEntitys.GennyService");
        workItemNode2.workParameter("operationImplementationRef", "abort");
        workItemNode2.workParameter("implementation", "Java");
        workItemNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("entityCode", "entityCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_B610EFF6-40C8-426B-8117-016A6AD5CDE0_codeInputX", "code", "String", null), null, null));
        workItemNode2.done();
        workItemNode2.metaData("UniqueId", "_B610EFF6-40C8-426B-8117-016A6AD5CDE0");
        workItemNode2.metaData("Implementation", "Java");
        workItemNode2.metaData("elementname", "Abort");
        workItemNode2.metaData("Type", "Service Task");
        workItemNode2.metaData("isForCompensation", true);
        workItemNode2.metaData("OperationRef", "_B610EFF6-40C8-426B-8117-016A6AD5CDE0_ServiceOperation");
        workItemNode2.metaData("x", 648);
        workItemNode2.metaData("width", 154);
        workItemNode2.metaData("y", 365);
        workItemNode2.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode3 = factory.joinNode(3);
        joinNode3.name("Join");
        joinNode3.type(2);
        joinNode3.metaData("UniqueId", "_17FAB812-786A-423F-A1D6-5B101104F64B");
        joinNode3.metaData("x", 1323);
        joinNode3.metaData("width", 56);
        joinNode3.metaData("y", 186);
        joinNode3.metaData("height", 56);
        joinNode3.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode4 = factory.actionNode(4);
        actionNode4.name("log");
        actionNode4.action(kcontext -> {
            java.lang.String entityCode = (java.lang.String) kcontext.getVariable("entityCode");
            java.lang.String questionCode = (java.lang.String) kcontext.getVariable("questionCode");
            System.out.println("testquestion log:entityCode -> " + entityCode);
            System.out.println("testquestion log:questionCode -> " + questionCode);
        });
        actionNode4.metaData("UniqueId", "_6E831FBF-88D7-457E-87C8-EC8AD5938FA3");
        actionNode4.metaData("elementname", "log");
        actionNode4.metaData("NodeType", "ScriptTask");
        actionNode4.metaData("x", 289);
        actionNode4.metaData("width", 154);
        actionNode4.metaData("y", 163);
        actionNode4.metaData("height", 102);
        actionNode4.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode5 = factory.splitNode(5);
        splitNode5.name("Split");
        splitNode5.type(2);
        splitNode5.metaData("UniqueId", "_3E00185C-12C3-4C05-A0B1-30151368EF59");
        splitNode5.metaData("x", 899);
        splitNode5.metaData("width", 56);
        splitNode5.metaData("y", 186);
        splitNode5.metaData("Default", "_D75DBD4E-22D1-4454-8987-9ADAB180025C");
        splitNode5.metaData("height", 56);
        splitNode5.constraint(1, "_E31E92E0-8DCB-48B5-89F8-01BD0AF87980", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String sourceCode = (java.lang.String) kcontext.getVariable("sourceCode");
            life.genny.kogito.common.models.S2SData data = (life.genny.kogito.common.models.S2SData) kcontext.getVariable("data");
            java.lang.String entityCode = (java.lang.String) kcontext.getVariable("entityCode");
            java.lang.String questionCode = (java.lang.String) kcontext.getVariable("questionCode");
            java.lang.String targetCode = (java.lang.String) kcontext.getVariable("targetCode");
            java.lang.String buttonEvents = (java.lang.String) kcontext.getVariable("buttonEvents");
            java.lang.String pcmCode = (java.lang.String) kcontext.getVariable("pcmCode");
            java.lang.String processId = (java.lang.String) kcontext.getVariable("processId");
            return data.isAborted();
        }, 0, false);
        splitNode5.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode6 = factory.workItemNode(6);
        workItemNode6.name("Redirect to ProcessPage");
        workItemNode6.workName("life.genny.kogito.common.service.NavigationService_redirectByQuestionCode_6_Handler");
        workItemNode6.workParameter("NodeName", "Redirect to ProcessPage");
        workItemNode6.workParameter("Interface", "life.genny.kogito.common.service.NavigationService");
        workItemNode6.workParameter("Operation", "redirectByQuestionCode");
        workItemNode6.workParameter("interfaceImplementationRef", "life.genny.kogito.common.service.NavigationService");
        workItemNode6.workParameter("operationImplementationRef", "redirectByQuestionCode");
        workItemNode6.workParameter("implementation", "Java");
        workItemNode6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("questionCode", "questionCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_36327FA0-851B-403E-99CD-C7783DB8F648_questionCodeInputX", "questionCode", "String", null), null, null));
        workItemNode6.done();
        workItemNode6.metaData("UniqueId", "_36327FA0-851B-403E-99CD-C7783DB8F648");
        workItemNode6.metaData("Implementation", "Java");
        workItemNode6.metaData("elementname", "Redirect to ProcessPage");
        workItemNode6.metaData("Type", "Service Task");
        workItemNode6.metaData("OperationRef", "_36327FA0-851B-403E-99CD-C7783DB8F648_ServiceOperation");
        workItemNode6.metaData("x", 1462);
        workItemNode6.metaData("width", 154);
        workItemNode6.metaData("y", 162);
        workItemNode6.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode7 = factory.subProcessNode(7);
        subProcessNode7.name("CallProcessQuestions");
        subProcessNode7.processId("callProcessQuestionsGT");
        subProcessNode7.processName("");
        subProcessNode7.waitForCompletion(true);
        subProcessNode7.independent(true);
        subProcessNode7.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<CallProcessQuestionsGTModel>() {

            public CallProcessQuestionsGTModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                life.genny.obotron.application.CallProcessQuestionsGTModel model = new life.genny.obotron.application.CallProcessQuestionsGTModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.setSourceCode((java.lang.String) (inputs.get("sourceCode")));
                model.setButtonEvents((java.lang.String) (inputs.get("buttonEvents")));
                model.setTargetCode((java.lang.String) (inputs.get("targetCode")));
                model.setPcmCode((java.lang.String) (inputs.get("pcmCode")));
                model.setQuestionCode((java.lang.String) (inputs.get("questionCode")));
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<CallProcessQuestionsGTModel> createInstance(CallProcessQuestionsGTModel model) {
                return processcallProcessQuestionsGT.createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, CallProcessQuestionsGTModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                outputs.put("data", model.getData());
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("questionCode", "questionCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_questionCodeInputX", "questionCode", "String", null), null, null));
        subProcessNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("sourceCode", "sourceCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_sourceCodeInputX", "sourceCode", "String", null), null, null));
        subProcessNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("entityCode", "entityCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_targetCodeInputX", "targetCode", "String", null), null, null));
        subProcessNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_pcmCodeInputX", "pcmCode", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("cc41f4bf-a60f-4cfc-a215-1250dcddc905", "EXPRESSION (PCM_FORM)", "java.lang.Object", "PCM_FORM"), new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_pcmCodeInputX", "pcmCode", "String", null))), null));
        subProcessNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_buttonEventsInputX", "buttonEvents", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("e9536db5-2459-4118-90b0-6c8382d72cf8", "EXPRESSION (Cancel,Submit)", "java.lang.Object", "Cancel,Submit"), new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_buttonEventsInputX", "buttonEvents", "String", null))), null));
        subProcessNode7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF_dataOutputX", "data", "life.genny.kogito.common.models.S2SData", null)), new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null), null, null));
        subProcessNode7.metaData("UniqueId", "_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF");
        subProcessNode7.metaData("elementname", "CallProcessQuestions");
        subProcessNode7.metaData("x", 654);
        subProcessNode7.metaData("width", 195);
        subProcessNode7.metaData("y", 163);
        subProcessNode7.metaData("height", 101);
        subProcessNode7.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode8 = factory.actionNode(8);
        actionNode8.name("Display Info");
        actionNode8.action(kcontext -> {
            java.lang.String questionCode = (java.lang.String) kcontext.getVariable("questionCode");
            java.lang.String processId = (java.lang.String) kcontext.getVariable("processId");
            System.out.println("Test Question Workflow with Parent processId=" + processId);
            kcontext.setVariable("questionCode", questionCode);
        });
        actionNode8.metaData("UniqueId", "_FC338808-B471-484D-A00C-B04AF775BE7D");
        actionNode8.metaData("elementname", "Display Info");
        actionNode8.metaData("NodeType", "ScriptTask");
        actionNode8.metaData("x", 160);
        actionNode8.metaData("width", 103);
        actionNode8.metaData("y", 163);
        actionNode8.metaData("height", 102);
        actionNode8.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode9 = factory.endNode(9);
        endNode9.name("Completed Test Question IM");
        endNode9.terminate(false);
        endNode9.metaData("UniqueId", "_E0234AD1-628F-46FA-A420-3F70E06B6D8F");
        endNode9.metaData("elementname", "Completed Test Question IM");
        endNode9.metaData("x", 1720);
        endNode9.metaData("width", 56);
        endNode9.metaData("y", 185);
        endNode9.metaData("height", 56);
        endNode9.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode10 = factory.actionNode(10);
        actionNode10.name("Display Details");
        actionNode10.action(kcontext -> {
            java.lang.String entityCode = (java.lang.String) kcontext.getVariable("entityCode");
            System.out.println("testQuestion:entityCode = " + entityCode);
        });
        actionNode10.metaData("UniqueId", "_009CB7C4-A7C4-48D3-AE38-9B10CE8EF951");
        actionNode10.metaData("elementname", "Display Details");
        actionNode10.metaData("NodeType", "ScriptTask");
        actionNode10.metaData("x", 1070);
        actionNode10.metaData("width", 154);
        actionNode10.metaData("y", 163);
        actionNode10.metaData("height", 102);
        actionNode10.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode11 = factory.startNode(11);
        startNode11.name("Start");
        startNode11.interrupting(true);
        startNode11.metaData("UniqueId", "_95D34FBC-5FED-45C7-B24F-59B03477DCA4");
        startNode11.metaData("x", 78);
        startNode11.metaData("width", 56);
        startNode11.metaData("y", 186);
        startNode11.metaData("height", 56);
        startNode11.done();
        org.jbpm.ruleflow.core.factory.EventSubProcessNodeFactory<?> eventSubProcessNode12 = factory.eventSubProcessNode(12);
        eventSubProcessNode12.name("Event Sub-process");
        eventSubProcessNode12.metaData("UniqueId", "_0263E2DC-BC5A-45D5-864D-35BBC388F0DC");
        eventSubProcessNode12.metaData("elementname", "Event Sub-process");
        eventSubProcessNode12.metaData("x", 454);
        eventSubProcessNode12.metaData("width", 653);
        eventSubProcessNode12.metaData("y", 642);
        eventSubProcessNode12.metaData("height", 253);
        eventSubProcessNode12.keepActive(true);
        eventSubProcessNode12.event("Error-CANCEL");
        eventSubProcessNode12.addCompensationContext("testQuestionGT2");
        eventSubProcessNode12.autoComplete(true);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode13 = eventSubProcessNode12.endNode(13);
        endNode13.name("End");
        endNode13.terminate(false);
        endNode13.metaData("UniqueId", "_40B781B4-9857-434A-85A0-55F2521A24AE");
        endNode13.metaData("x", 512);
        endNode13.metaData("width", 56);
        endNode13.metaData("y", 99);
        endNode13.metaData("height", 56);
        endNode13.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode14 = eventSubProcessNode12.startNode(14);
        startNode14.name("Canceled");
        startNode14.interrupting(true);
        startNode14.metaData("FaultCode", "CANCEL");
        startNode14.metaData("UniqueId", "_23D6D634-666A-4046-8F62-BF7157ED592C");
        startNode14.metaData("elementname", "Canceled");
        startNode14.metaData("TriggerType", "Signal");
        startNode14.metaData("x", 64);
        startNode14.metaData("width", 56);
        startNode14.metaData("y", 99);
        startNode14.metaData("TriggerRef", "CANCEL");
        startNode14.metaData("MessageType", "CANCEL");
        startNode14.metaData("height", 56);
        startNode14.done();
        startNode14.trigger("CANCEL", java.util.Arrays.asList());
        eventSubProcessNode12.connection(14, 13, "_AFBC153C-2E94-4A78-85F1-EF0E9B5490F0");
        eventSubProcessNode12.done();
        org.jbpm.ruleflow.core.factory.BoundaryEventNodeFactory<?> boundaryEventNode15 = factory.boundaryEventNode(15);
        boundaryEventNode15.name("BoundaryEvent");
        boundaryEventNode15.eventType("Compensation");
        boundaryEventNode15.attachedTo("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF");
        boundaryEventNode15.scope(null);
        boundaryEventNode15.addCompensationHandler("_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF");
        boundaryEventNode15.metaData("UniqueId", "_B90E1377-E7E5-4F5F-B96E-5F9136087F68");
        boundaryEventNode15.metaData("EventType", "compensation");
        boundaryEventNode15.metaData("x", 697);
        boundaryEventNode15.metaData("width", 56);
        boundaryEventNode15.metaData("y", 236);
        boundaryEventNode15.metaData("AttachedTo", "_88FB1C4E-8D79-4C9C-8248-73AD65F0F8FF");
        boundaryEventNode15.metaData("height", 56);
        boundaryEventNode15.done();
        factory.errorExceptionHandler("Error-CANCEL", "CANCEL", null);
        factory.connection(5, 1, "_E31E92E0-8DCB-48B5-89F8-01BD0AF87980");
        factory.association(15, 2, "");
        factory.connection(1, 3, "_C62E1412-F64C-486D-816F-E6A9760795F1");
        factory.connection(10, 3, "_E8BE0E52-742A-4043-8A61-2DBDC1035CA5");
        factory.connection(8, 4, "_4FC3AD61-0BAD-43D2-B0AE-BCF0AFB485B0");
        factory.connection(7, 5, "_1E4A591D-6E6D-4490-AB25-B0CB1DFF421E");
        factory.connection(3, 6, "_0E9A5DDA-A295-450C-85CB-E77C5C93943B");
        factory.connection(4, 7, "_5362CEFB-38FC-4CD3-BB32-71D9FCCCBFF8");
        factory.connection(11, 8, "_6B9AFC5C-9AD0-4EBC-8EAF-3F66B488C960");
        factory.connection(6, 9, "_2221D1B1-EC35-48B4-9C5F-2C3FA0B4434E");
        factory.connection(5, 10, "_D75DBD4E-22D1-4454-8987-9ADAB180025C");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("callProcessQuestionsGT", completionEventListener);
    }
}
