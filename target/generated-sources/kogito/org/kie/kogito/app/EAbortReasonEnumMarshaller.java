package org.kie.kogito.app;

import org.infinispan.protostream.EnumMarshaller;

public class EAbortReasonEnumMarshaller implements EnumMarshaller<life.genny.kogito.common.models.S2SData.EAbortReason> {

    public String getTypeName() {
        return "org.kie.kogito.app.EAbortReason";
    }

    public java.lang.Class<life.genny.kogito.common.models.S2SData.EAbortReason> getJavaClass() {
        return life.genny.kogito.common.models.S2SData.EAbortReason.class;
    }

    public int encode(life.genny.kogito.common.models.S2SData.EAbortReason state) {
        if (null == state)
            throw new java.lang.IllegalArgumentException("Invalid value provided to enum");
        return state.ordinal();
    }

    public life.genny.kogito.common.models.S2SData.EAbortReason decode(int value) {
        switch(value) {
            case 0:
                return life.genny.kogito.common.models.S2SData.EAbortReason.CANCEL;
            case 2:
                return life.genny.kogito.common.models.S2SData.EAbortReason.TIMEOUT;
            case 1:
                return life.genny.kogito.common.models.S2SData.EAbortReason.NONE;
            default:
                throw new java.lang.IllegalArgumentException("Invalid value provided to enum");
        }
    }
}
