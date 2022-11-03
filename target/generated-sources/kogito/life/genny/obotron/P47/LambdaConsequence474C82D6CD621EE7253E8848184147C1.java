package life.genny.obotron.P47;

import static life.genny.obotron.Rulesefa18191fe0d484193e437a7c2a59a26.*;
import life.genny.qwandaq.message.QDataBaseEntityMessage;
import javax.json.JsonObject;
import life.genny.qwandaq.utils.QwandaUtils;
import life.genny.obotron.*;
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
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence474C82D6CD621EE7253E8848184147C1 implements org.drools.model.functions.Block3<org.drools.model.Drools, life.genny.qwandaq.message.QEventMessage, life.genny.kogito.common.utils.KogitoUtils>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6FC9F49F985EA35BB799FE5829E99C87";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.model.Drools drools, life.genny.qwandaq.message.QEventMessage msg, life.genny.kogito.common.utils.KogitoUtils kogitoUtils) throws java.lang.Exception {
        JsonObjectBuilder builder = Json.createObjectBuilder().add("code", "TAB_BUCKET_VIEW");
        if (msg.getData().getTargetCode() != null) {
            builder.add("targetCode", msg.getData().getTargetCode());
        }
        System.out.println("RouteTable: " + builder.build().toString());
        kogitoUtils.triggerWorkflow(GADAQ, "view", builder.build());
        drools.delete(msg);
    }
}
