package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class NavigationService_redirectByQuestionCode_6_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    life.genny.kogito.common.service.NavigationService service;

    public NavigationService_redirectByQuestionCode_6_Handler() {
        this(new life.genny.kogito.common.service.NavigationService());
    }

    @javax.inject.Inject()
    public NavigationService_redirectByQuestionCode_6_Handler(life.genny.kogito.common.service.NavigationService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.redirectByQuestionCode((java.lang.String) workItem.getParameter("questionCode"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "life.genny.kogito.common.service.NavigationService_redirectByQuestionCode_6_Handler";
    }
}
