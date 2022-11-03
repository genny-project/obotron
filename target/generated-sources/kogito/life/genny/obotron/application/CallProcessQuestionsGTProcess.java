package life.genny.obotron.application;

import life.genny.obotron.application.CallProcessQuestionsGTModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("callProcessQuestionsGT")
@io.quarkus.runtime.Startup()
public class CallProcessQuestionsGTProcess extends org.kie.kogito.process.impl.AbstractProcess<life.genny.obotron.application.CallProcessQuestionsGTModel> {

    @javax.inject.Inject()
    life.genny.obotron.application.CallProcessQuestionsGTMessageProducer_10 producer_10;

    public CallProcessQuestionsGTProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        this(app, correlations, factory, new org.kie.kogito.handlers.Service2Service_initialiseScope_7_Handler(), new org.kie.kogito.handlers.Service2Service_initialiseScope_2_Handler(), new org.kie.kogito.handlers.Service2Service_addToken_8_Handler());
    }

    @javax.inject.Inject()
    public CallProcessQuestionsGTProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory, org.kie.kogito.handlers.Service2Service_initialiseScope_7_Handler service2Service_initialiseScope_7_Handler, org.kie.kogito.handlers.Service2Service_initialiseScope_2_Handler service2Service_initialiseScope_2_Handler, org.kie.kogito.handlers.Service2Service_addToken_8_Handler service2Service_addToken_8_Handler) {
        super(app, java.util.Arrays.asList(service2Service_initialiseScope_7_Handler, service2Service_initialiseScope_2_Handler, service2Service_addToken_8_Handler), correlations, factory);
        activate();
    }

    public CallProcessQuestionsGTProcess() {
    }

    @Override()
    public life.genny.obotron.application.CallProcessQuestionsGTProcessInstance createInstance(life.genny.obotron.application.CallProcessQuestionsGTModel value) {
        return new life.genny.obotron.application.CallProcessQuestionsGTProcessInstance(this, value, this.createProcessRuntime());
    }

    public life.genny.obotron.application.CallProcessQuestionsGTProcessInstance createInstance(java.lang.String businessKey, life.genny.obotron.application.CallProcessQuestionsGTModel value) {
        return new life.genny.obotron.application.CallProcessQuestionsGTProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public life.genny.obotron.application.CallProcessQuestionsGTProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, life.genny.obotron.application.CallProcessQuestionsGTModel value) {
        return new life.genny.obotron.application.CallProcessQuestionsGTProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public life.genny.obotron.application.CallProcessQuestionsGTModel createModel() {
        return new life.genny.obotron.application.CallProcessQuestionsGTModel();
    }

    public life.genny.obotron.application.CallProcessQuestionsGTProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((life.genny.obotron.application.CallProcessQuestionsGTModel) value);
    }

    public life.genny.obotron.application.CallProcessQuestionsGTProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (life.genny.obotron.application.CallProcessQuestionsGTModel) value);
    }

    public life.genny.obotron.application.CallProcessQuestionsGTProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.obotron.application.CallProcessQuestionsGTProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public life.genny.obotron.application.CallProcessQuestionsGTProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.obotron.application.CallProcessQuestionsGTProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("callProcessQuestionsGT", true);
        factory.variable("questionCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("sourceCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("targetCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("pcmCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("data", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(life.genny.kogito.common.models.S2SData.class), null, "customTags", "output");
        factory.variable("buttonEvents", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("entityCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("timerData", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(life.genny.kogito.common.models.TimerData.class), null, "customTags", null);
        factory.name("CallProcessQuestions");
        factory.packageName("life.genny.obotron.application");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("Documentation", "Call the ProcessQuestions workflow from another service");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode1 = factory.actionNode(1);
        actionNode1.name("Log");
        actionNode1.action(kcontext -> {
            life.genny.kogito.common.models.S2SData data = (life.genny.kogito.common.models.S2SData) kcontext.getVariable("data");
            System.out.println("Aborted Log:" + data);
        });
        actionNode1.metaData("UniqueId", "_BFCCDE24-4DAF-4CBC-A8E1-4CFE66F507EC");
        actionNode1.metaData("elementname", "Log");
        actionNode1.metaData("NodeType", "ScriptTask");
        actionNode1.metaData("x", 904);
        actionNode1.metaData("width", 154);
        actionNode1.metaData("y", 402);
        actionNode1.metaData("height", 102);
        actionNode1.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode2 = factory.workItemNode(2);
        workItemNode2.name("Scope Init");
        workItemNode2.workName("life.genny.kogito.common.service.Service2Service_initialiseScope_2_Handler");
        workItemNode2.workParameter("NodeName", "Scope Init");
        workItemNode2.workParameter("Interface", "life.genny.kogito.common.service.Service2Service");
        workItemNode2.workParameter("Operation", "initialiseScope");
        workItemNode2.workParameter("interfaceImplementationRef", "life.genny.kogito.common.service.Service2Service");
        workItemNode2.workParameter("operationImplementationRef", "initialiseScope");
        workItemNode2.workParameter("implementation", "Java");
        workItemNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_6A9F27A5-5A22-45C2-A35C-1D4907866C6D_dataInputX", "data", "life.genny.kogito.common.models.S2SData", null), null, null));
        workItemNode2.done();
        workItemNode2.metaData("UniqueId", "_6A9F27A5-5A22-45C2-A35C-1D4907866C6D");
        workItemNode2.metaData("Implementation", "Java");
        workItemNode2.metaData("elementname", "Scope Init");
        workItemNode2.metaData("Type", "Service Task");
        workItemNode2.metaData("OperationRef", "_6A9F27A5-5A22-45C2-A35C-1D4907866C6D_ServiceOperation");
        workItemNode2.metaData("x", 1166);
        workItemNode2.metaData("width", 154);
        workItemNode2.metaData("y", 402);
        workItemNode2.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EventNodeFactory<?> eventNode3 = factory.eventNode(3);
        eventNode3.name("Aborted");
        eventNode3.eventType("Message-abort_process_questions");
        eventNode3.variableName("data");
        eventNode3.inputVariableName("event");
        eventNode3.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_5E9A7B47-C0D3-4B51-81F4-CD2B9017EFA3_eventOutputX", "event", "life.genny.kogito.common.models.S2SData", null)), new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null), null, null));
        eventNode3.metaData("UniqueId", "_5E9A7B47-C0D3-4B51-81F4-CD2B9017EFA3");
        eventNode3.metaData("TriggerType", "ConsumeMessage");
        eventNode3.metaData("EventType", "message");
        eventNode3.metaData("TriggerRef", "abort_process_questions");
        eventNode3.metaData("elementname", "Aborted");
        eventNode3.metaData("x", 762);
        eventNode3.metaData("width", 56);
        eventNode3.metaData("y", 425);
        eventNode3.metaData("MappingVariable", "data");
        eventNode3.metaData("MessageType", "life.genny.kogito.common.models.S2SData");
        eventNode3.metaData("height", 56);
        eventNode3.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode4 = factory.splitNode(4);
        splitNode4.name("Split");
        splitNode4.type(4);
        splitNode4.metaData("UniqueId", "_4BF7AA5E-C4EA-49B0-833F-00ED4081066C");
        splitNode4.metaData("EventBased", "true");
        splitNode4.metaData("x", 762);
        splitNode4.metaData("width", 56);
        splitNode4.metaData("y", 149);
        splitNode4.metaData("height", 56);
        splitNode4.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode5 = factory.endNode(5);
        endNode5.name("Questions Aborted");
        endNode5.terminate(false);
        endNode5.action(kcontext -> {
            kcontext.getProcessInstance().signalEvent("Compensation", "_A2F1D0B6-E3B3-4E38-A391-EF950AFEAAE6");
        });
        endNode5.metaData("UniqueId", "_7DEE5B29-C7A6-4340-855D-27777B4239EC");
        endNode5.metaData("elementname", "Questions Aborted");
        endNode5.metaData("x", 1427);
        endNode5.metaData("width", 56);
        endNode5.metaData("y", 425);
        endNode5.metaData("height", 56);
        endNode5.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode6 = factory.actionNode(6);
        actionNode6.name("Save Data");
        actionNode6.action(kcontext -> {
            life.genny.kogito.common.models.S2SData data = (life.genny.kogito.common.models.S2SData) kcontext.getVariable("data");
            System.out.println("CallProcessQuestions:data=" + data);
            System.out.println("CallProcessQuestions:aborted=" + data.getAbortReason());
        });
        actionNode6.metaData("UniqueId", "_931E1007-10AB-4B65-B36E-B10883224FBE");
        actionNode6.metaData("elementname", "Save Data");
        actionNode6.metaData("NodeType", "ScriptTask");
        actionNode6.metaData("x", 999);
        actionNode6.metaData("width", 154);
        actionNode6.metaData("y", 126);
        actionNode6.metaData("height", 102);
        actionNode6.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode7 = factory.workItemNode(7);
        workItemNode7.name("Scope Init");
        workItemNode7.workName("life.genny.kogito.common.service.Service2Service_initialiseScope_7_Handler");
        workItemNode7.workParameter("NodeName", "Scope Init");
        workItemNode7.workParameter("Interface", "life.genny.kogito.common.service.Service2Service");
        workItemNode7.workParameter("Operation", "initialiseScope");
        workItemNode7.workParameter("interfaceImplementationRef", "life.genny.kogito.common.service.Service2Service");
        workItemNode7.workParameter("operationImplementationRef", "initialiseScope");
        workItemNode7.workParameter("implementation", "Java");
        workItemNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A2F1D0B6-E3B3-4E38-A391-EF950AFEAAE6_dataInputX", "data", "life.genny.kogito.common.models.S2SData", null), null, null));
        workItemNode7.done();
        workItemNode7.metaData("UniqueId", "_A2F1D0B6-E3B3-4E38-A391-EF950AFEAAE6");
        workItemNode7.metaData("Implementation", "Java");
        workItemNode7.metaData("elementname", "Scope Init");
        workItemNode7.metaData("Type", "Service Task");
        workItemNode7.metaData("OperationRef", "_A2F1D0B6-E3B3-4E38-A391-EF950AFEAAE6_ServiceOperation");
        workItemNode7.metaData("x", 1201);
        workItemNode7.metaData("width", 154);
        workItemNode7.metaData("y", 126);
        workItemNode7.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode8 = factory.workItemNode(8);
        workItemNode8.name("Add Token");
        workItemNode8.workName("life.genny.kogito.common.service.Service2Service_addToken_8_Handler");
        workItemNode8.workParameter("NodeName", "Add Token");
        workItemNode8.workParameter("Interface", "life.genny.kogito.common.service.Service2Service");
        workItemNode8.workParameter("Operation", "addToken");
        workItemNode8.workParameter("interfaceImplementationRef", "life.genny.kogito.common.service.Service2Service");
        workItemNode8.workParameter("operationImplementationRef", "addToken");
        workItemNode8.workParameter("implementation", "Java");
        workItemNode8.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7155A1B8-A898-4080-A64F-320F63B7A710_dataInputX", "data", "life.genny.kogito.common.models.S2SData", null), null, null));
        workItemNode8.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_7155A1B8-A898-4080-A64F-320F63B7A710_dataOutputX", "data", "life.genny.kogito.common.models.S2SData", null)), new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null), null, null));
        workItemNode8.done();
        workItemNode8.metaData("UniqueId", "_7155A1B8-A898-4080-A64F-320F63B7A710");
        workItemNode8.metaData("Implementation", "Java");
        workItemNode8.metaData("elementname", "Add Token");
        workItemNode8.metaData("Type", "Service Task");
        workItemNode8.metaData("OperationRef", "_7155A1B8-A898-4080-A64F-320F63B7A710_ServiceOperation");
        workItemNode8.metaData("x", 462);
        workItemNode8.metaData("width", 154);
        workItemNode8.metaData("y", 126);
        workItemNode8.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode9 = factory.actionNode(9);
        actionNode9.name("Setup Data");
        actionNode9.action(kcontext -> {
            java.lang.String questionCode = (java.lang.String) kcontext.getVariable("questionCode");
            java.lang.String sourceCode = (java.lang.String) kcontext.getVariable("sourceCode");
            java.lang.String targetCode = (java.lang.String) kcontext.getVariable("targetCode");
            java.lang.String pcmCode = (java.lang.String) kcontext.getVariable("pcmCode");
            life.genny.kogito.common.models.S2SData data = (life.genny.kogito.common.models.S2SData) kcontext.getVariable("data");
            java.lang.String buttonEvents = (java.lang.String) kcontext.getVariable("buttonEvents");
            life.genny.kogito.common.models.TimerData timerData = (life.genny.kogito.common.models.TimerData) kcontext.getVariable("timerData");
            System.out.println("Entering CallProcessQuestions");
            data = new life.genny.kogito.common.models.S2SData();
            data.setProductCode("obotron");
            data.setQuestionCode(questionCode);
            data.setSourceCode(sourceCode);
            data.setTargetCode(targetCode);
            data.setPcmCode(pcmCode);
            data.setButtonEvents(buttonEvents);
            kcontext.setVariable("data", data);
        });
        actionNode9.metaData("UniqueId", "_FDBD45D0-205C-4388-B81B-B41B37960521");
        actionNode9.metaData("elementname", "Setup Data");
        actionNode9.metaData("NodeType", "ScriptTask");
        actionNode9.metaData("x", 264);
        actionNode9.metaData("width", 154);
        actionNode9.metaData("y", 126);
        actionNode9.metaData("height", 102);
        actionNode9.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode10 = factory.actionNode(10);
        actionNode10.name("Script");
        actionNode10.action(new org.jbpm.process.instance.impl.actions.ProduceEventAction<life.genny.kogito.common.models.S2SData>("start_process_questions", "data", () -> producer_10));
        actionNode10.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7D8FEF11-05A0-48C9-A453-D23087AC2997_dataInputX", "data", "life.genny.kogito.common.models.S2SData", null), null, null));
        actionNode10.metaData("UniqueId", "_7D8FEF11-05A0-48C9-A453-D23087AC2997");
        actionNode10.metaData("TriggerType", "ProduceMessage");
        actionNode10.metaData("Variable", "data");
        actionNode10.metaData("EventType", "message");
        actionNode10.metaData("TriggerRef", "start_process_questions");
        actionNode10.metaData("MappingVariableInput", "data");
        actionNode10.metaData("x", 649);
        actionNode10.metaData("width", 56);
        actionNode10.metaData("y", 149);
        actionNode10.metaData("MappingVariable", "data");
        actionNode10.metaData("MessageType", "life.genny.kogito.common.models.S2SData");
        actionNode10.metaData("height", 56);
        actionNode10.done();
        org.jbpm.ruleflow.core.factory.EventNodeFactory<?> eventNode11 = factory.eventNode(11);
        eventNode11.name("Submitted");
        eventNode11.eventType("Message-end_process_questions");
        eventNode11.variableName("data");
        eventNode11.inputVariableName("event");
        eventNode11.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_C462D763-02CE-45D3-83B8-84A267693D7F_eventOutputX", "event", "life.genny.kogito.common.models.S2SData", null)), new org.jbpm.workflow.core.impl.DataDefinition("data", "data", "java.lang.Object", null), null, null));
        eventNode11.metaData("UniqueId", "_C462D763-02CE-45D3-83B8-84A267693D7F");
        eventNode11.metaData("TriggerType", "ConsumeMessage");
        eventNode11.metaData("EventType", "message");
        eventNode11.metaData("TriggerRef", "end_process_questions");
        eventNode11.metaData("elementname", "Submitted");
        eventNode11.metaData("x", 882);
        eventNode11.metaData("width", 56);
        eventNode11.metaData("y", 149);
        eventNode11.metaData("MappingVariable", "data");
        eventNode11.metaData("MessageType", "life.genny.kogito.common.models.S2SData");
        eventNode11.metaData("height", 56);
        eventNode11.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode12 = factory.endNode(12);
        endNode12.name("Data Submitted");
        endNode12.terminate(false);
        endNode12.metaData("UniqueId", "_313818B4-F36E-4F3C-8FF1-3298360B2695");
        endNode12.metaData("elementname", "Data Submitted");
        endNode12.metaData("x", 1535);
        endNode12.metaData("width", 56);
        endNode12.metaData("y", 149);
        endNode12.metaData("height", 56);
        endNode12.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode13 = factory.startNode(13);
        startNode13.name("Start");
        startNode13.interrupting(false);
        startNode13.metaData("UniqueId", "_B6CC7289-D9EA-4819-B088-83DE66FE946F");
        startNode13.metaData("elementname", "Start");
        startNode13.metaData("x", 144);
        startNode13.metaData("width", 56);
        startNode13.metaData("y", 149);
        startNode13.metaData("height", 56);
        startNode13.done();
        factory.connection(3, 1, "_31224600-CFCA-4A7C-A3AE-B93FB28F56BF");
        factory.connection(1, 2, "_39A2B453-071A-4728-9A37-A363D0E59EDC");
        factory.connection(4, 3, "_474BE691-6E72-4BB0-A85A-11805D9DE4A8");
        factory.connection(10, 4, "_E17F34DF-8FF8-4949-ACBB-E11DA87BAB4A");
        factory.connection(2, 5, "_809DBBF7-95AE-4A9A-BAEE-9D75BD3E02BE");
        factory.connection(11, 6, "_6328CD06-22F7-41AB-9509-852958417FCA");
        factory.connection(6, 7, "_DBD9EADC-3DD1-4354-B63B-1E3A557BEECB");
        factory.connection(9, 8, "_AE4EB538-6D62-4219-8898-CD6FBA092253");
        factory.connection(13, 9, "_2380C394-0F74-443C-B3BC-ED4F72C8D0DF");
        factory.connection(8, 10, "_23A925DA-FD88-4840-9DEB-F0F7C1ED99ED");
        factory.connection(4, 11, "_5B0A952F-FC09-4199-9B43-A803B42A2EA0");
        factory.connection(7, 12, "_4221C8A8-DF66-4C0C-B722-3EA5F52BE097");
        factory.validate();
        return factory.getProcess();
    }
}
