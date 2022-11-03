package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class GennyService_abort_2_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    life.genny.obotron.setupBaseEntitys.GennyService service;

    public GennyService_abort_2_Handler() {
        this(new life.genny.obotron.setupBaseEntitys.GennyService());
    }

    @javax.inject.Inject()
    public GennyService_abort_2_Handler(life.genny.obotron.setupBaseEntitys.GennyService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.abort((java.lang.String) workItem.getParameter("code"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "life.genny.obotron.setupBaseEntitys.GennyService_abort_2_Handler";
    }
}
