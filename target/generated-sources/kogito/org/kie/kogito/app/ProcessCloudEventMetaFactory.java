package org.kie.kogito.app;

import org.kie.kogito.event.cloudevents.CloudEventMeta;

public class ProcessCloudEventMetaFactory {

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_abort__process__questions() {
        return new CloudEventMeta("abort_process_questions", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_end__process__questions() {
        return new CloudEventMeta("end_process_questions", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_start__process__questions() {
        return new CloudEventMeta("process.callprocessquestionsgt.start_process_questions", "/process/callprocessquestionsgt", org.kie.kogito.event.EventKind.PRODUCED);
    }
}
