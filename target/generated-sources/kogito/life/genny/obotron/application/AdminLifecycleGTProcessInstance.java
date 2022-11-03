package life.genny.obotron.application;

import life.genny.obotron.application.AdminLifecycleGTModel;

public class AdminLifecycleGTProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<AdminLifecycleGTModel> {

    public AdminLifecycleGTProcessInstance(life.genny.obotron.application.AdminLifecycleGTProcess process, AdminLifecycleGTModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public AdminLifecycleGTProcessInstance(life.genny.obotron.application.AdminLifecycleGTProcess process, AdminLifecycleGTModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public AdminLifecycleGTProcessInstance(life.genny.obotron.application.AdminLifecycleGTProcess process, AdminLifecycleGTModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public AdminLifecycleGTProcessInstance(life.genny.obotron.application.AdminLifecycleGTProcess process, AdminLifecycleGTModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public AdminLifecycleGTProcessInstance(life.genny.obotron.application.AdminLifecycleGTProcess process, AdminLifecycleGTModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(AdminLifecycleGTModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(AdminLifecycleGTModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
