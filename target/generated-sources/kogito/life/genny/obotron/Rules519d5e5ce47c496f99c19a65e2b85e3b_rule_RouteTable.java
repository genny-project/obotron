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
import static life.genny.obotron.Rules519d5e5ce47c496f99c19a65e2b85e3b.*;

public class Rules519d5e5ce47c496f99c19a65e2b85e3b_rule_RouteTable {

    /**
     * Rule name: RouteTable
     */
    public static org.drools.model.Rule rule_RouteTable() {
        final org.drools.model.Variable<life.genny.qwandaq.message.QEventMessage> var_msg = D.declarationOf(life.genny.qwandaq.message.QEventMessage.class,
                                                                                                            DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_qwandaq_message_QEventMessage_Metadata_INSTANCE,
                                                                                                            "msg");
        final org.drools.model.Variable<life.genny.kogito.common.utils.KogitoUtils> var_kogitoUtils = D.declarationOf(life.genny.kogito.common.utils.KogitoUtils.class,
                                                                                                                      DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_kogito_common_utils_KogitoUtils_Metadata_INSTANCE,
                                                                                                                      "kogitoUtils");
        org.drools.model.Rule rule = D.rule("life.genny.obotron",
                                            "RouteTable")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "EventRoutes")
                                      .build(D.pattern(var_msg).expr("GENERATED_D5EFF03CFDAC51866F7B2735E126D8B1",
                                                                     life.genny.obotron.P91.LambdaPredicate91C339EE09A3D1188D1FF676D2CC905C.INSTANCE,
                                                                     D.reactOn("data")),
                                             D.pattern(var_kogitoUtils),
                                             D.on(var_msg,
                                                  var_kogitoUtils).execute(life.genny.obotron.PCB.LambdaConsequenceCB29F9FF3FE3777096896ECF8FFA5F63.INSTANCE));
        return rule;
    }
}
