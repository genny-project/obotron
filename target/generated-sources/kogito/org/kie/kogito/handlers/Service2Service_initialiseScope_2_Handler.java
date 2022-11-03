package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class Service2Service_initialiseScope_2_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    life.genny.kogito.common.service.Service2Service service;

    public Service2Service_initialiseScope_2_Handler() {
        this(new life.genny.kogito.common.service.Service2Service());
    }

    @javax.inject.Inject()
    public Service2Service_initialiseScope_2_Handler(life.genny.kogito.common.service.Service2Service service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.initialiseScope((life.genny.kogito.common.models.S2SData) workItem.getParameter("data"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "life.genny.kogito.common.service.Service2Service_initialiseScope_2_Handler";
    }
}
