package life.genny.obotron.P5E;

import static life.genny.obotron.Rules519d5e5ce47c496f99c19a65e2b85e3b.*;
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
public enum LambdaPredicate5EF3F9B09726E619E81ACF9C9BDF296A implements org.drools.model.functions.Predicate1<life.genny.qwandaq.message.QEventMessage>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "1EE37B35DC38469A3CCC4B1EEBEE08F1";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(life.genny.qwandaq.message.QEventMessage _this) throws java.lang.Exception {
        return (org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getData().getCode(), "QUE_BUCKET_VIEW") || org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getData().getCode(), "QUE_PROCESS"));
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("data.code==\"QUE_BUCKET_VIEW\" || data.code==\"QUE_PROCESS\"");
        info.addRuleNames("RouteBucket", "life/genny/gadatron/EventRoutes.drl");
        return info;
    }
}
