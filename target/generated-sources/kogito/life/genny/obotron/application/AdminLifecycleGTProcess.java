package life.genny.obotron.application;

import life.genny.obotron.application.AdminLifecycleGTModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("adminLifecycleGT")
@io.quarkus.runtime.Startup()
public class AdminLifecycleGTProcess extends org.kie.kogito.process.impl.AbstractProcess<life.genny.obotron.application.AdminLifecycleGTModel> {

    @javax.inject.Inject()
    @javax.inject.Named("callProcessQuestionsGT")
    org.kie.kogito.process.Process<CallProcessQuestionsGTModel> processcallProcessQuestionsGT;

    public AdminLifecycleGTProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        this(app, correlations, factory, new org.kie.kogito.handlers.NavigationService_redirectByQuestionCode_1_Handler());
    }

    @javax.inject.Inject()
    public AdminLifecycleGTProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory, org.kie.kogito.handlers.NavigationService_redirectByQuestionCode_1_Handler navigationService_redirectByQuestionCode_1_Handler) {
        super(app, java.util.Arrays.asList(navigationService_redirectByQuestionCode_1_Handler), correlations, factory);
        activate();
    }

    public AdminLifecycleGTProcess() {
    }

    @Override()
    public life.genny.obotron.application.AdminLifecycleGTProcessInstance createInstance(life.genny.obotron.application.AdminLifecycleGTModel value) {
        return new life.genny.obotron.application.AdminLifecycleGTProcessInstance(this, value, this.createProcessRuntime());
    }

    public life.genny.obotron.application.AdminLifecycleGTProcessInstance createInstance(java.lang.String businessKey, life.genny.obotron.application.AdminLifecycleGTModel value) {
        return new life.genny.obotron.application.AdminLifecycleGTProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public life.genny.obotron.application.AdminLifecycleGTProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, life.genny.obotron.application.AdminLifecycleGTModel value) {
        return new life.genny.obotron.application.AdminLifecycleGTProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public life.genny.obotron.application.AdminLifecycleGTModel createModel() {
        return new life.genny.obotron.application.AdminLifecycleGTModel();
    }

    public life.genny.obotron.application.AdminLifecycleGTProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((life.genny.obotron.application.AdminLifecycleGTModel) value);
    }

    public life.genny.obotron.application.AdminLifecycleGTProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (life.genny.obotron.application.AdminLifecycleGTModel) value);
    }

    public life.genny.obotron.application.AdminLifecycleGTProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.obotron.application.AdminLifecycleGTProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public life.genny.obotron.application.AdminLifecycleGTProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.obotron.application.AdminLifecycleGTProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("adminLifecycleGT", true);
        factory.variable("entityCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", "input");
        factory.variable("questionCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("sourceCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("targetCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("pcmCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("data", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(life.genny.kogito.common.models.S2SData.class), null, "customTags", null);
        factory.variable("summary", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("userCode", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", "input");
        factory.variable("buttonEvents", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.name("AdminLifecyle");
        factory.packageName("life.genny.obotron.application");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode1 = factory.workItemNode(1);
        workItemNode1.name("Default Redirect");
        workItemNode1.workName("life.genny.kogito.common.service.NavigationService_redirectByQuestionCode_1_Handler");
        workItemNode1.workParameter("NodeName", "Default Redirect");
        workItemNode1.workParameter("Interface", "life.genny.kogito.common.service.NavigationService");
        workItemNode1.workParameter("Operation", "redirectByQuestionCode");
        workItemNode1.workParameter("interfaceImplementationRef", "life.genny.kogito.common.service.NavigationService");
        workItemNode1.workParameter("operationImplementationRef", "redirectByQuestionCode");
        workItemNode1.workParameter("implementation", "Java");
        workItemNode1.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("questionCode", "questionCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7D9AF4E4-B83C-47D7-8160-45BCCE346249_questionCodeInputX", "questionCode", "String", null), null, null));
        workItemNode1.done();
        workItemNode1.metaData("UniqueId", "_7D9AF4E4-B83C-47D7-8160-45BCCE346249");
        workItemNode1.metaData("Implementation", "Java");
        workItemNode1.metaData("elementname", "Default Redirect");
        workItemNode1.metaData("Type", "Service Task");
        workItemNode1.metaData("OperationRef", "_7D9AF4E4-B83C-47D7-8160-45BCCE346249_ServiceOperation");
        workItemNode1.metaData("x", 877);
        workItemNode1.metaData("width", 154);
        workItemNode1.metaData("y", 214);
        workItemNode1.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_BAD98C17-8A75-428C-8162-953DC87D7C5D");
        endNode2.metaData("x", 1142);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 236);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("Start");
        startNode3.interrupting(true);
        startNode3.metaData("UniqueId", "_1569AD97-DDBB-4909-8CA4-30C5F5DA2034");
        startNode3.metaData("x", 261);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 236);
        startNode3.metaData("height", 56);
        startNode3.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode4 = factory.actionNode(4);
        actionNode4.name("Setup");
        actionNode4.action(kcontext -> {
            System.out.println("Starting Admin lifecycle");
        });
        actionNode4.metaData("UniqueId", "_FC9E309B-A450-49FB-9CC0-57DF4A1BB983");
        actionNode4.metaData("elementname", "Setup");
        actionNode4.metaData("NodeType", "ScriptTask");
        actionNode4.metaData("x", 385);
        actionNode4.metaData("width", 154);
        actionNode4.metaData("y", 213);
        actionNode4.metaData("height", 102);
        actionNode4.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode5 = factory.subProcessNode(5);
        subProcessNode5.name("Admin Details");
        subProcessNode5.processId("callProcessQuestionsGT");
        subProcessNode5.processName("");
        subProcessNode5.waitForCompletion(true);
        subProcessNode5.independent(true);
        subProcessNode5.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<CallProcessQuestionsGTModel>() {

            public CallProcessQuestionsGTModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                life.genny.obotron.application.CallProcessQuestionsGTModel model = new life.genny.obotron.application.CallProcessQuestionsGTModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.setPcmCode((java.lang.String) (inputs.get("pcmCode")));
                model.setSourceCode((java.lang.String) (inputs.get("sourceCode")));
                model.setQuestionCode((java.lang.String) (inputs.get("questionCode")));
                model.setTargetCode((java.lang.String) (inputs.get("targetCode")));
                model.setButtonEvents((java.lang.String) (inputs.get("buttonEvents")));
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<CallProcessQuestionsGTModel> createInstance(CallProcessQuestionsGTModel model) {
                return processcallProcessQuestionsGT.createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, CallProcessQuestionsGTModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("userCode", "userCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_233E31A8-0F28-4942-B35A-10107E7D9557_sourceCodeInputX", "sourceCode", "String", null), null, null));
        subProcessNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("entityCode", "entityCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_233E31A8-0F28-4942-B35A-10107E7D9557_targetCodeInputX", "targetCode", "String", null), null, null));
        subProcessNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_233E31A8-0F28-4942-B35A-10107E7D9557_pcmCodeInputX", "pcmCode", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("e9e11bd6-4c91-4fdc-888e-640e8a85eec4", "EXPRESSION (PCM_FORM)", "java.lang.Object", "PCM_FORM"), new org.jbpm.workflow.core.impl.DataDefinition("_233E31A8-0F28-4942-B35A-10107E7D9557_pcmCodeInputX", "pcmCode", "String", null))), null));
        subProcessNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("questionCode", "questionCode", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_233E31A8-0F28-4942-B35A-10107E7D9557_questionCodeInputX", "questionCode", "String", null), null, null));
        subProcessNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_233E31A8-0F28-4942-B35A-10107E7D9557_buttonEventsInputX", "buttonEvents", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("688bf4fd-5ade-4464-a412-e8d8181a862d", "EXPRESSION (SUBMIT,CANCEL)", "java.lang.Object", "SUBMIT,CANCEL"), new org.jbpm.workflow.core.impl.DataDefinition("_233E31A8-0F28-4942-B35A-10107E7D9557_buttonEventsInputX", "buttonEvents", "String", null))), null));
        subProcessNode5.metaData("UniqueId", "_233E31A8-0F28-4942-B35A-10107E7D9557");
        subProcessNode5.metaData("elementname", "Admin Details");
        subProcessNode5.metaData("x", 613);
        subProcessNode5.metaData("width", 153);
        subProcessNode5.metaData("y", 214);
        subProcessNode5.metaData("height", 101);
        subProcessNode5.done();
        factory.connection(5, 1, "_D0508342-DAF2-4B76-A186-333A154A4272");
        factory.connection(1, 2, "_6DA58D1F-20F0-4EBB-85AF-4D918C6C442B");
        factory.connection(3, 4, "_FC135DEF-0B4C-44F3-996F-ABDBCB264FBF");
        factory.connection(4, 5, "_659D2B5F-F0F0-4D0A-BA32-47CB2CA2899C");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("callProcessQuestionsGT", completionEventListener);
    }
}
