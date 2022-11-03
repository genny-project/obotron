package life.genny.obotron.P72;

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
public enum LambdaConsequence72E3B38919E652C02104C9BFF9EB6A44 implements org.drools.model.functions.Block6<org.drools.model.Drools, life.genny.qwandaq.message.QEventMessage, life.genny.qwandaq.models.UserToken, life.genny.kogito.common.utils.KogitoUtils, life.genny.qwandaq.utils.BaseEntityUtils, life.genny.qwandaq.utils.QwandaUtils>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F7695C5B97C9E60A3532F063D7949D3D";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.model.Drools drools, life.genny.qwandaq.message.QEventMessage msg, life.genny.qwandaq.models.UserToken userToken, life.genny.kogito.common.utils.KogitoUtils kogitoUtils, life.genny.qwandaq.utils.BaseEntityUtils beUtils, life.genny.qwandaq.utils.QwandaUtils qwandaUtils) throws java.lang.Exception {
        System.out.println("Displaying Test Question Group ..." + msg.getData().getCode() + " msg=" + msg);
        JsonObjectBuilder payloadBuilder = Json.createObjectBuilder().add("questionCode", msg.getData().getCode().substring("TESTQ_".length())).add("userCode", userToken.getUserCode()).add("sourceCode", userToken.getUserCode()).add("entityCode", msg.getData().getTargetCode()).add("targetCode", msg.getData().getTargetCode());
        String content = msg.getData().getContent();
        if (content != null) {
            payloadBuilder.add("content", content);
            System.out.println("Content = " + content);
            /* Load the LNK_DOT  */
            BaseEntity target = beUtils.getBaseEntityByCode(msg.getData().getTargetCode());
            Attribute lnkDot = qwandaUtils.getAttribute("LNK_DOT");
            target.addAnswer(new Answer(target, target, lnkDot, "[\"" + content + "\"]"));
            beUtils.updateBaseEntity(target);
        }
        JsonObject payload = payloadBuilder.build();
        System.out.println("Payload = " + payload.toString());
        kogitoUtils.triggerWorkflow(SELF, "testQuestionGT2", payload);
        drools.delete(msg);
    }
}
