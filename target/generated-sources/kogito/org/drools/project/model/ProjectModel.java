package org.drools.project.model;

import org.drools.model.Model;
import org.kie.api.builder.ReleaseId;
import org.kie.util.maven.support.ReleaseIdImpl;

public class ProjectModel implements org.drools.modelcompiler.CanonicalKieModuleModel {

    @Override
    public String getVersion() {
        return "8.29.0.Final";
    }

    @Override
    public java.util.List<Model> getModels() {
        return java.util.Arrays.asList(new life.genny.obotron.inference.Rulese914ced8196f4715a8ae84e9e3a84b45(),new life.genny.obotron.Rules519d5e5ce47c496f99c19a65e2b85e3b());
    }

    public java.util.List<Model> getModelsForKieBase(String kieBaseName) {
        switch (kieBaseName) {
            case "defaultKieBase": return java.util.Arrays.asList( new life.genny.obotron.inference.Rulese914ced8196f4715a8ae84e9e3a84b45(),new life.genny.obotron.Rules519d5e5ce47c496f99c19a65e2b85e3b() );
        }
        throw new IllegalArgumentException("Unknown KieBase: " + kieBaseName);
    }

    @Override
    public ReleaseId getReleaseId() {
        return new ReleaseIdImpl("dummy", "dummy", "0.0.0");
    }

@java.lang.Override()
public org.kie.api.builder.model.KieModuleModel getKieModuleModel() {
    org.kie.api.builder.model.KieModuleModel kModuleModel = org.kie.api.KieServices.get().newKieModuleModel();
    org.kie.api.builder.model.KieBaseModel kieBaseModel_defaultKieBase = kModuleModel.newKieBaseModel("defaultKieBase");
    kieBaseModel_defaultKieBase.setDefault(true);
    kieBaseModel_defaultKieBase.setEventProcessingMode(org.kie.api.conf.EventProcessingOption.CLOUD);
    kieBaseModel_defaultKieBase.addPackage("*");
    org.kie.api.builder.model.KieSessionModel kieSessionModel_defaultStatelessKieSession = kieBaseModel_defaultKieBase.newKieSessionModel("defaultStatelessKieSession");
    kieSessionModel_defaultStatelessKieSession.setDefault(true);
    kieSessionModel_defaultStatelessKieSession.setType(org.kie.api.builder.model.KieSessionModel.KieSessionType.STATELESS);
    kieSessionModel_defaultStatelessKieSession.setClockType(org.kie.api.runtime.conf.ClockTypeOption.get("realtime"));
    org.kie.api.builder.model.KieSessionModel kieSessionModel_defaultKieSession = kieBaseModel_defaultKieBase.newKieSessionModel("defaultKieSession");
    kieSessionModel_defaultKieSession.setDefault(true);
    kieSessionModel_defaultKieSession.setType(org.kie.api.builder.model.KieSessionModel.KieSessionType.STATEFUL);
    kieSessionModel_defaultKieSession.setClockType(org.kie.api.runtime.conf.ClockTypeOption.get("realtime"));
    return kModuleModel;
}
}