package life.genny.obotron.application;

import life.genny.obotron.application.TestQuestionGT2Model;

public class TestQuestionGT2ProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<TestQuestionGT2Model> {

    public TestQuestionGT2ProcessInstance(life.genny.obotron.application.TestQuestionGT2Process process, TestQuestionGT2Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public TestQuestionGT2ProcessInstance(life.genny.obotron.application.TestQuestionGT2Process process, TestQuestionGT2Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public TestQuestionGT2ProcessInstance(life.genny.obotron.application.TestQuestionGT2Process process, TestQuestionGT2Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public TestQuestionGT2ProcessInstance(life.genny.obotron.application.TestQuestionGT2Process process, TestQuestionGT2Model value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public TestQuestionGT2ProcessInstance(life.genny.obotron.application.TestQuestionGT2Process process, TestQuestionGT2Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(TestQuestionGT2Model variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(TestQuestionGT2Model variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
