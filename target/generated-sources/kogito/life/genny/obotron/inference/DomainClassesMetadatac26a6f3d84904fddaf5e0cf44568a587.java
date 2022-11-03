package life.genny.obotron.inference;
public class DomainClassesMetadatac26a6f3d84904fddaf5e0cf44568a587 {

    public static final org.drools.model.DomainClassMetadata life_genny_qwandaq_models_UserToken_Metadata_INSTANCE = new life_genny_qwandaq_models_UserToken_Metadata();
    private static class life_genny_qwandaq_models_UserToken_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return life.genny.qwandaq.models.UserToken.class;
        }

        @Override
        public int getPropertiesSize() {
            return 24;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "JTI": return 0;
                case "adecodedTokenMap": return 1;
                case "allowedProducts": return 2;
                case "authDateTime": return 3;
                case "clientCode": return 4;
                case "code": return 5;
                case "email": return 6;
                case "emailUserCode": return 7;
                case "expiryDateTime": return 8;
                case "expiryDateTimeInUTC": return 9;
                case "iatDateTime": return 10;
                case "keycloakRealm": return 11;
                case "keycloakUrl": return 12;
                case "productCode": return 13;
                case "realm": return 14;
                case "realmUserCode": return 15;
                case "secondsUntilExpiry": return 16;
                case "sessionCode": return 17;
                case "token": return 18;
                case "userCode": return 19;
                case "userRoles": return 20;
                case "userUUID": return 21;
                case "username": return 22;
                case "uuid": return 23;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class life.genny.qwandaq.models.UserToken");
        }
    }

    public static final org.drools.model.DomainClassMetadata life_genny_kogito_common_utils_KogitoUtils_Metadata_INSTANCE = new life_genny_kogito_common_utils_KogitoUtils_Metadata();
    private static class life_genny_kogito_common_utils_KogitoUtils_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return life.genny.kogito.common.utils.KogitoUtils.class;
        }

        @Override
        public int getPropertiesSize() {
            return 2;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "outstandingTaskProcessId": return 0;
                case "outstandingTasks": return 1;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class life.genny.kogito.common.utils.KogitoUtils");
        }
    }

    public static final org.drools.model.DomainClassMetadata life_genny_qwandaq_message_QDataAnswerMessage_Metadata_INSTANCE = new life_genny_qwandaq_message_QDataAnswerMessage_Metadata();
    private static class life_genny_qwandaq_message_QDataAnswerMessage_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return life.genny.qwandaq.message.QDataAnswerMessage.class;
        }

        @Override
        public int getPropertiesSize() {
            return 17;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "attributeCode": return 0;
                case "message": return 1;
                case "msg_type": return 2;
                case "questionCode": return 3;
                case "recipientCodeArray": return 4;
                case "serialversionuid": return 5;
                case "sourceCode": return 6;
                case "tag": return 7;
                case "targetCode": return 8;
                case "targetCodes": return 9;
                case "token": return 10;
                case "aliasCode": return 11;
                case "data_type": return 12;
                case "delete": return 13;
                case "replace": return 14;
                case "shouldDeleteLinkedBaseEntities": return 15;
                case "items": return 16;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class life.genny.qwandaq.message.QDataAnswerMessage");
        }
    }

}