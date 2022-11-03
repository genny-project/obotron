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

public class Rulesefa18191fe0d484193e437a7c2a59a26_rule_RetractEvent {

    /**
     * Rule name: RetractEvent
     */
    public static org.drools.model.Rule rule_RetractEvent() {
        final org.drools.model.Variable<life.genny.qwandaq.message.QEventMessage> var_msg = D.declarationOf(life.genny.qwandaq.message.QEventMessage.class,
                                                                                                            DomainClassesMetadataefa18191fe0d484193e437a7c2a59a26.life_genny_qwandaq_message_QEventMessage_Metadata_INSTANCE,
                                                                                                            "msg");
        org.drools.model.Rule rule = D.rule("life.genny.obotron",
                                            "RetractEvent")
                                      .attribute(org.drools.model.Rule.Attribute.SALIENCE,
                                                 0)
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "EventRoutes")
                                      .build(D.pattern(var_msg),
                                             D.on(var_msg).execute(life.genny.obotron.PBF.LambdaConsequenceBF5CACF0D3E945241990A9A844F5F02D.INSTANCE));
        return rule;
    }
}
