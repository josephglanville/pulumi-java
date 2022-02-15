// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTargetPoolResult {
    private final String backupPool;
    private final String creationTimestamp;
    private final String description;
    private final Double failoverRatio;
    private final List<String> healthChecks;
    private final List<String> instances;
    private final String kind;
    private final String name;
    private final String region;
    private final String selfLink;
    private final String sessionAffinity;

    @OutputCustomType.Constructor({"backupPool","creationTimestamp","description","failoverRatio","healthChecks","instances","kind","name","region","selfLink","sessionAffinity"})
    private GetTargetPoolResult(
        String backupPool,
        String creationTimestamp,
        String description,
        Double failoverRatio,
        List<String> healthChecks,
        List<String> instances,
        String kind,
        String name,
        String region,
        String selfLink,
        String sessionAffinity) {
        this.backupPool = Objects.requireNonNull(backupPool);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.failoverRatio = Objects.requireNonNull(failoverRatio);
        this.healthChecks = Objects.requireNonNull(healthChecks);
        this.instances = Objects.requireNonNull(instances);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
    }

    public String getBackupPool() {
        return this.backupPool;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public Double getFailoverRatio() {
        return this.failoverRatio;
    }
    public List<String> getHealthChecks() {
        return this.healthChecks;
    }
    public List<String> getInstances() {
        return this.instances;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getRegion() {
        return this.region;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPool;
        private String creationTimestamp;
        private String description;
        private Double failoverRatio;
        private List<String> healthChecks;
        private List<String> instances;
        private String kind;
        private String name;
        private String region;
        private String selfLink;
        private String sessionAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPool = defaults.backupPool;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.failoverRatio = defaults.failoverRatio;
    	      this.healthChecks = defaults.healthChecks;
    	      this.instances = defaults.instances;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.sessionAffinity = defaults.sessionAffinity;
        }

        public Builder setBackupPool(String backupPool) {
            this.backupPool = Objects.requireNonNull(backupPool);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFailoverRatio(Double failoverRatio) {
            this.failoverRatio = Objects.requireNonNull(failoverRatio);
            return this;
        }

        public Builder setHealthChecks(List<String> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }

        public Builder setInstances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSessionAffinity(String sessionAffinity) {
            this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
            return this;
        }

        public GetTargetPoolResult build() {
            return new GetTargetPoolResult(backupPool, creationTimestamp, description, failoverRatio, healthChecks, instances, kind, name, region, selfLink, sessionAffinity);
        }
    }
}