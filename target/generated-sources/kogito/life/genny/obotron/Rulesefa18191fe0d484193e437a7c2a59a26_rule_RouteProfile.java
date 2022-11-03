package life.genny.obotron;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import life.genny.qwandaq.message.QDataBaseEntityMessage;
import javax.json.JsonObject;
import life.genny.qwandaq.utils.QwandaUtils;
import life.genny.qwandaq.entity.SearchEntity;
import life.genny.qwandaq.utils.KafkaUtils;
import life.genny.qwandaq.Answer;
import java.util.HashMap;
import life.genny.qwandaq.utils.BaseEntityUtils;
import life.genny.kogito.common.utils.KogitoUtils;
import life.genny.qwandaq.attribute.Attribute;
import life.genny.qwandaq.models.UserToken;
import life.genny.qwandaq.utils.DefUtils;
import life.genny.qwandaq.entity.BaseEntity;
import java.util.Map;
import life.genny.kogito.common.service.ImportGithubService;
import life.genny.qwandaq.utils.GraphQLUtils;
import life.genny.qwandaq.utils.CommonUtils;
import javax.json.Json;
import life.genny.qwandaq.utils.CacheUtils;
import life.genny.qwandaq.message.QEventMessage;
import javax.json.JsonObjectBuilder;
import life.genny.qwandaq.utils.SearchUtils;
import static life.genny.kogito.common.utils.KogitoUtils.UseService.*;
import static life.genny.obotron.Rulesefa18191fe0d484193e437a7c2a59a26.*;

public class Rulesefa18191fe0d484193e437a7c2a59a26_rule_RouteProfile {

    /**
     * Rule name: RouteProfile
     */
    public static org.drools.model.Rule rule_RouteProfile() {
        final org.drools.model.Variable<life.genny.qwandaq.message.QEventMessage> var_msg = D.declarationOf(life.genny.qwandaq.message.QEventMessage.class,
                                                                                                            DomainClassesMetadataefa18191fe0d484193e437a7c2a59a26.life_genny_qwandaq_message_QEventMessage_Metadata_INSTANCE,
                                                                                                            "msg");
        final org.drools.model.Variable<life.genny.kogito.common.utils.KogitoUtils> var_kogitoUtils = D.declarationOf(life.genny.kogito.common.utils.KogitoUtils.class,
                                                                                                                      DomainClassesMetadataefa18191fe0d484193e437a7c2a59a26.life_genny_kogito_common_utils_KogitoUtils_Metadata_INSTANCE,
                                                                                                                      "kogitoUtils");
        org.drools.model.Rule rule = D.rule("life.genny.obotron",
                                            "RouteProfile")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "EventRoutes")
                                      .build(D.pattern(var_msg).expr("GENERATED_53287D39AEFC062F1FA116813EE3E626",
                                                                     life.genny.obotron.PF1.LambdaPredicateF1A0D3577B74C774F18346F708E518B9.INSTANCE,
                                                                     D.reactOn("data")),
                                             D.pattern(var_kogitoUtils),
                                             D.on(var_msg).execute(life.genny.obotron.PA8.LambdaConsequenceA8CE2F9F6C226D83EF4E3BAAF466D5A1.INSTANCE));
        return rule;
    }
}
