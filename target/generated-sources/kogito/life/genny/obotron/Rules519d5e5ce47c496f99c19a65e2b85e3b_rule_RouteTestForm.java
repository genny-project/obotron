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

public class Rules519d5e5ce47c496f99c19a65e2b85e3b_rule_RouteTestForm {

    /**
     * Rule name: RouteTestForm
     */
    public static org.drools.model.Rule rule_RouteTestForm() {
        final org.drools.model.Variable<life.genny.qwandaq.message.QEventMessage> var_msg = D.declarationOf(life.genny.qwandaq.message.QEventMessage.class,
                                                                                                            DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_qwandaq_message_QEventMessage_Metadata_INSTANCE,
                                                                                                            "msg");
        final org.drools.model.Variable<life.genny.qwandaq.models.UserToken> var_userToken = D.declarationOf(life.genny.qwandaq.models.UserToken.class,
                                                                                                             DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_qwandaq_models_UserToken_Metadata_INSTANCE,
                                                                                                             "userToken");
        final org.drools.model.Variable<life.genny.kogito.common.utils.KogitoUtils> var_kogitoUtils = D.declarationOf(life.genny.kogito.common.utils.KogitoUtils.class,
                                                                                                                      DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_kogito_common_utils_KogitoUtils_Metadata_INSTANCE,
                                                                                                                      "kogitoUtils");
        final org.drools.model.Variable<life.genny.qwandaq.utils.BaseEntityUtils> var_beUtils = D.declarationOf(life.genny.qwandaq.utils.BaseEntityUtils.class,
                                                                                                                DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_qwandaq_utils_BaseEntityUtils_Metadata_INSTANCE,
                                                                                                                "beUtils");
        final org.drools.model.Variable<life.genny.qwandaq.utils.DefUtils> var_defUtils = D.declarationOf(life.genny.qwandaq.utils.DefUtils.class,
                                                                                                          DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_qwandaq_utils_DefUtils_Metadata_INSTANCE,
                                                                                                          "defUtils");
        final org.drools.model.Variable<life.genny.qwandaq.utils.QwandaUtils> var_qwandaUtils = D.declarationOf(life.genny.qwandaq.utils.QwandaUtils.class,
                                                                                                                DomainClassesMetadata519d5e5ce47c496f99c19a65e2b85e3b.life_genny_qwandaq_utils_QwandaUtils_Metadata_INSTANCE,
                                                                                                                "qwandaUtils");
        org.drools.model.Rule rule = D.rule("life.genny.obotron",
                                            "RouteTestForm")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "EventRoutes")
                                      .build(D.pattern(var_msg).expr("GENERATED_B7A8BDE8E84E87DF2C1E97A11402742A",
                                                                     life.genny.obotron.P23.LambdaPredicate2344BF94E0DD174B941286FE01CE71AB.INSTANCE,
                                                                     D.reactOn("data")),
                                             D.pattern(var_userToken),
                                             D.pattern(var_kogitoUtils),
                                             D.pattern(var_beUtils),
                                             D.pattern(var_defUtils),
                                             D.pattern(var_qwandaUtils),
                                             D.on(var_msg,
                                                  var_userToken,
                                                  var_kogitoUtils,
                                                  var_beUtils,
                                                  var_qwandaUtils).execute(life.genny.obotron.P8B.LambdaConsequence8BF7F8CBC0C9B13C0D3C10ADE221497B.INSTANCE));
        return rule;
    }
}
