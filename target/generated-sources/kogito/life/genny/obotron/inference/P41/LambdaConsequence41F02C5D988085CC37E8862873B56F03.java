package life.genny.obotron.inference.P41;

import static life.genny.obotron.inference.Rulese914ced8196f4715a8ae84e9e3a84b45.*;
import life.genny.qwandaq.models.UserToken;
import life.genny.qwandaq.utils.KafkaUtils;
import life.genny.qwandaq.message.QDataAnswerMessage;
import life.genny.kogito.common.utils.KogitoUtils;
import life.genny.obotron.inference.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence41F02C5D988085CC37E8862873B56F03 implements org.drools.model.functions.Block2<org.drools.model.Drools, life.genny.qwandaq.message.QDataAnswerMessage>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "20B89814A8174F41E976BEC1F1B310C3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.model.Drools drools, life.genny.qwandaq.message.QDataAnswerMessage msg) throws java.lang.Exception {
        /* do some inference stuff idk */
        System.out.println("Infering!");
        drools.delete(msg);
    }
}
