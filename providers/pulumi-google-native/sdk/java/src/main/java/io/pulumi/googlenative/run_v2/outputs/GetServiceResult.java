// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2BinaryAuthorizationResponse;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2ConditionResponse;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2RevisionTemplateResponse;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2TrafficTargetResponse;
import io.pulumi.googlenative.run_v2.outputs.GoogleCloudRunOpV2TrafficTargetStatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetServiceResult {
    private final Map<String,String> annotations;
    private final GoogleCloudRunOpV2BinaryAuthorizationResponse binaryAuthorization;
    private final String client;
    private final String clientVersion;
    private final List<GoogleCloudRunOpV2ConditionResponse> conditions;
    private final String createTime;
    private final String creator;
    private final String deleteTime;
    private final String description;
    private final String etag;
    private final String expireTime;
    private final String generation;
    private final String ingress;
    private final Map<String,String> labels;
    private final String lastModifier;
    private final String latestCreatedRevision;
    private final String latestReadyRevision;
    private final String launchStage;
    private final String name;
    private final String observedGeneration;
    private final Boolean reconciling;
    private final GoogleCloudRunOpV2RevisionTemplateResponse template;
    private final GoogleCloudRunOpV2ConditionResponse terminalCondition;
    private final List<GoogleCloudRunOpV2TrafficTargetResponse> traffic;
    private final List<GoogleCloudRunOpV2TrafficTargetStatusResponse> trafficStatuses;
    private final String uid;
    private final String updateTime;
    private final String uri;

    @OutputCustomType.Constructor({"annotations","binaryAuthorization","client","clientVersion","conditions","createTime","creator","deleteTime","description","etag","expireTime","generation","ingress","labels","lastModifier","latestCreatedRevision","latestReadyRevision","launchStage","name","observedGeneration","reconciling","template","terminalCondition","traffic","trafficStatuses","uid","updateTime","uri"})
    private GetServiceResult(
        Map<String,String> annotations,
        GoogleCloudRunOpV2BinaryAuthorizationResponse binaryAuthorization,
        String client,
        String clientVersion,
        List<GoogleCloudRunOpV2ConditionResponse> conditions,
        String createTime,
        String creator,
        String deleteTime,
        String description,
        String etag,
        String expireTime,
        String generation,
        String ingress,
        Map<String,String> labels,
        String lastModifier,
        String latestCreatedRevision,
        String latestReadyRevision,
        String launchStage,
        String name,
        String observedGeneration,
        Boolean reconciling,
        GoogleCloudRunOpV2RevisionTemplateResponse template,
        GoogleCloudRunOpV2ConditionResponse terminalCondition,
        List<GoogleCloudRunOpV2TrafficTargetResponse> traffic,
        List<GoogleCloudRunOpV2TrafficTargetStatusResponse> trafficStatuses,
        String uid,
        String updateTime,
        String uri) {
        this.annotations = Objects.requireNonNull(annotations);
        this.binaryAuthorization = Objects.requireNonNull(binaryAuthorization);
        this.client = Objects.requireNonNull(client);
        this.clientVersion = Objects.requireNonNull(clientVersion);
        this.conditions = Objects.requireNonNull(conditions);
        this.createTime = Objects.requireNonNull(createTime);
        this.creator = Objects.requireNonNull(creator);
        this.deleteTime = Objects.requireNonNull(deleteTime);
        this.description = Objects.requireNonNull(description);
        this.etag = Objects.requireNonNull(etag);
        this.expireTime = Objects.requireNonNull(expireTime);
        this.generation = Objects.requireNonNull(generation);
        this.ingress = Objects.requireNonNull(ingress);
        this.labels = Objects.requireNonNull(labels);
        this.lastModifier = Objects.requireNonNull(lastModifier);
        this.latestCreatedRevision = Objects.requireNonNull(latestCreatedRevision);
        this.latestReadyRevision = Objects.requireNonNull(latestReadyRevision);
        this.launchStage = Objects.requireNonNull(launchStage);
        this.name = Objects.requireNonNull(name);
        this.observedGeneration = Objects.requireNonNull(observedGeneration);
        this.reconciling = Objects.requireNonNull(reconciling);
        this.template = Objects.requireNonNull(template);
        this.terminalCondition = Objects.requireNonNull(terminalCondition);
        this.traffic = Objects.requireNonNull(traffic);
        this.trafficStatuses = Objects.requireNonNull(trafficStatuses);
        this.uid = Objects.requireNonNull(uid);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.uri = Objects.requireNonNull(uri);
    }

    public Map<String,String> getAnnotations() {
        return this.annotations;
    }
    public GoogleCloudRunOpV2BinaryAuthorizationResponse getBinaryAuthorization() {
        return this.binaryAuthorization;
    }
    public String getClient() {
        return this.client;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }
    public List<GoogleCloudRunOpV2ConditionResponse> getConditions() {
        return this.conditions;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public String getCreator() {
        return this.creator;
    }
    public String getDeleteTime() {
        return this.deleteTime;
    }
    public String getDescription() {
        return this.description;
    }
    public String getEtag() {
        return this.etag;
    }
    public String getExpireTime() {
        return this.expireTime;
    }
    public String getGeneration() {
        return this.generation;
    }
    public String getIngress() {
        return this.ingress;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getLastModifier() {
        return this.lastModifier;
    }
    public String getLatestCreatedRevision() {
        return this.latestCreatedRevision;
    }
    public String getLatestReadyRevision() {
        return this.latestReadyRevision;
    }
    public String getLaunchStage() {
        return this.launchStage;
    }
    public String getName() {
        return this.name;
    }
    public String getObservedGeneration() {
        return this.observedGeneration;
    }
    public Boolean getReconciling() {
        return this.reconciling;
    }
    public GoogleCloudRunOpV2RevisionTemplateResponse getTemplate() {
        return this.template;
    }
    public GoogleCloudRunOpV2ConditionResponse getTerminalCondition() {
        return this.terminalCondition;
    }
    public List<GoogleCloudRunOpV2TrafficTargetResponse> getTraffic() {
        return this.traffic;
    }
    public List<GoogleCloudRunOpV2TrafficTargetStatusResponse> getTrafficStatuses() {
        return this.trafficStatuses;
    }
    public String getUid() {
        return this.uid;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private GoogleCloudRunOpV2BinaryAuthorizationResponse binaryAuthorization;
        private String client;
        private String clientVersion;
        private List<GoogleCloudRunOpV2ConditionResponse> conditions;
        private String createTime;
        private String creator;
        private String deleteTime;
        private String description;
        private String etag;
        private String expireTime;
        private String generation;
        private String ingress;
        private Map<String,String> labels;
        private String lastModifier;
        private String latestCreatedRevision;
        private String latestReadyRevision;
        private String launchStage;
        private String name;
        private String observedGeneration;
        private Boolean reconciling;
        private GoogleCloudRunOpV2RevisionTemplateResponse template;
        private GoogleCloudRunOpV2ConditionResponse terminalCondition;
        private List<GoogleCloudRunOpV2TrafficTargetResponse> traffic;
        private List<GoogleCloudRunOpV2TrafficTargetStatusResponse> trafficStatuses;
        private String uid;
        private String updateTime;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.binaryAuthorization = defaults.binaryAuthorization;
    	      this.client = defaults.client;
    	      this.clientVersion = defaults.clientVersion;
    	      this.conditions = defaults.conditions;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.deleteTime = defaults.deleteTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.expireTime = defaults.expireTime;
    	      this.generation = defaults.generation;
    	      this.ingress = defaults.ingress;
    	      this.labels = defaults.labels;
    	      this.lastModifier = defaults.lastModifier;
    	      this.latestCreatedRevision = defaults.latestCreatedRevision;
    	      this.latestReadyRevision = defaults.latestReadyRevision;
    	      this.launchStage = defaults.launchStage;
    	      this.name = defaults.name;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.reconciling = defaults.reconciling;
    	      this.template = defaults.template;
    	      this.terminalCondition = defaults.terminalCondition;
    	      this.traffic = defaults.traffic;
    	      this.trafficStatuses = defaults.trafficStatuses;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.uri = defaults.uri;
        }

        public Builder setAnnotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder setBinaryAuthorization(GoogleCloudRunOpV2BinaryAuthorizationResponse binaryAuthorization) {
            this.binaryAuthorization = Objects.requireNonNull(binaryAuthorization);
            return this;
        }

        public Builder setClient(String client) {
            this.client = Objects.requireNonNull(client);
            return this;
        }

        public Builder setClientVersion(String clientVersion) {
            this.clientVersion = Objects.requireNonNull(clientVersion);
            return this;
        }

        public Builder setConditions(List<GoogleCloudRunOpV2ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }

        public Builder setDeleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setGeneration(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }

        public Builder setIngress(String ingress) {
            this.ingress = Objects.requireNonNull(ingress);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLastModifier(String lastModifier) {
            this.lastModifier = Objects.requireNonNull(lastModifier);
            return this;
        }

        public Builder setLatestCreatedRevision(String latestCreatedRevision) {
            this.latestCreatedRevision = Objects.requireNonNull(latestCreatedRevision);
            return this;
        }

        public Builder setLatestReadyRevision(String latestReadyRevision) {
            this.latestReadyRevision = Objects.requireNonNull(latestReadyRevision);
            return this;
        }

        public Builder setLaunchStage(String launchStage) {
            this.launchStage = Objects.requireNonNull(launchStage);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setObservedGeneration(String observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }

        public Builder setReconciling(Boolean reconciling) {
            this.reconciling = Objects.requireNonNull(reconciling);
            return this;
        }

        public Builder setTemplate(GoogleCloudRunOpV2RevisionTemplateResponse template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTerminalCondition(GoogleCloudRunOpV2ConditionResponse terminalCondition) {
            this.terminalCondition = Objects.requireNonNull(terminalCondition);
            return this;
        }

        public Builder setTraffic(List<GoogleCloudRunOpV2TrafficTargetResponse> traffic) {
            this.traffic = Objects.requireNonNull(traffic);
            return this;
        }

        public Builder setTrafficStatuses(List<GoogleCloudRunOpV2TrafficTargetStatusResponse> trafficStatuses) {
            this.trafficStatuses = Objects.requireNonNull(trafficStatuses);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public GetServiceResult build() {
            return new GetServiceResult(annotations, binaryAuthorization, client, clientVersion, conditions, createTime, creator, deleteTime, description, etag, expireTime, generation, ingress, labels, lastModifier, latestCreatedRevision, latestReadyRevision, launchStage, name, observedGeneration, reconciling, template, terminalCondition, traffic, trafficStatuses, uid, updateTime, uri);
        }
    }
}