package life.genny.obotron.application;

import life.genny.obotron.application.CallProcessQuestionsGTModel;

public class CallProcessQuestionsGTProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<CallProcessQuestionsGTModel> {

    public CallProcessQuestionsGTProcessInstance(life.genny.obotron.application.CallProcessQuestionsGTProcess process, CallProcessQuestionsGTModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public CallProcessQuestionsGTProcessInstance(life.genny.obotron.application.CallProcessQuestionsGTProcess process, CallProcessQuestionsGTModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public CallProcessQuestionsGTProcessInstance(life.genny.obotron.application.CallProcessQuestionsGTProcess process, CallProcessQuestionsGTModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public CallProcessQuestionsGTProcessInstance(life.genny.obotron.application.CallProcessQuestionsGTProcess process, CallProcessQuestionsGTModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public CallProcessQuestionsGTProcessInstance(life.genny.obotron.application.CallProcessQuestionsGTProcess process, CallProcessQuestionsGTModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(CallProcessQuestionsGTModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(CallProcessQuestionsGTModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
