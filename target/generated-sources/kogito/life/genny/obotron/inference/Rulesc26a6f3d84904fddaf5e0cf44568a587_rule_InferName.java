package life.genny.obotron.inference;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import life.genny.qwandaq.models.UserToken;
import life.genny.qwandaq.utils.KafkaUtils;
import life.genny.qwandaq.message.QDataAnswerMessage;
import life.genny.kogito.common.utils.KogitoUtils;
import static life.genny.obotron.inference.Rulesc26a6f3d84904fddaf5e0cf44568a587.*;

public class Rulesc26a6f3d84904fddaf5e0cf44568a587_rule_InferName {

    /**
     * Rule name: InferName
     */
    public static org.drools.model.Rule rule_InferName() {
        final org.drools.model.Variable<life.genny.qwandaq.message.QDataAnswerMessage> var_msg = D.declarationOf(life.genny.qwandaq.message.QDataAnswerMessage.class,
                                                                                                                 DomainClassesMetadatac26a6f3d84904fddaf5e0cf44568a587.life_genny_qwandaq_message_QDataAnswerMessage_Metadata_INSTANCE,
                                                                                                                 "msg");
        final org.drools.model.Variable<life.genny.qwandaq.models.UserToken> var_userToken = D.declarationOf(life.genny.qwandaq.models.UserToken.class,
                                                                                                             DomainClassesMetadatac26a6f3d84904fddaf5e0cf44568a587.life_genny_qwandaq_models_UserToken_Metadata_INSTANCE,
                                                                                                             "userToken");
        final org.drools.model.Variable<life.genny.kogito.common.utils.KogitoUtils> var_kogitoUtils = D.declarationOf(life.genny.kogito.common.utils.KogitoUtils.class,
                                                                                                                      DomainClassesMetadatac26a6f3d84904fddaf5e0cf44568a587.life_genny_kogito_common_utils_KogitoUtils_Metadata_INSTANCE,
                                                                                                                      "kogitoUtils");
        org.drools.model.Rule rule = D.rule("life.genny.obotron.inference",
                                            "InferName")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "Inference")
                                      .build(D.pattern(var_msg),
                                             D.pattern(var_userToken),
                                             D.pattern(var_kogitoUtils),
                                             D.on(var_msg).execute(life.genny.obotron.inference.PDA.LambdaConsequenceDAF655C33ACB81A1A951204416189970.INSTANCE));
        return rule;
    }
}
