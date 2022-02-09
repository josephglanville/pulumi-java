// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ComputePolicyResponse {
    private final String id;
    private final Integer maxDegreeOfParallelismPerJob;
    private final Integer minPriorityPerJob;
    private final String name;
    private final String objectId;
    private final String objectType;
    private final String type;

    @OutputCustomType.Constructor({"id","maxDegreeOfParallelismPerJob","minPriorityPerJob","name","objectId","objectType","type"})
    private ComputePolicyResponse(
        String id,
        Integer maxDegreeOfParallelismPerJob,
        Integer minPriorityPerJob,
        String name,
        String objectId,
        String objectType,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.maxDegreeOfParallelismPerJob = Objects.requireNonNull(maxDegreeOfParallelismPerJob);
        this.minPriorityPerJob = Objects.requireNonNull(minPriorityPerJob);
        this.name = Objects.requireNonNull(name);
        this.objectId = Objects.requireNonNull(objectId);
        this.objectType = Objects.requireNonNull(objectType);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Integer getMaxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }
    public Integer getMinPriorityPerJob() {
        return this.minPriorityPerJob;
    }
    public String getName() {
        return this.name;
    }
    public String getObjectId() {
        return this.objectId;
    }
    public String getObjectType() {
        return this.objectType;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Integer maxDegreeOfParallelismPerJob;
        private Integer minPriorityPerJob;
        private String name;
        private String objectId;
        private String objectType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.maxDegreeOfParallelismPerJob = defaults.maxDegreeOfParallelismPerJob;
    	      this.minPriorityPerJob = defaults.minPriorityPerJob;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.objectType = defaults.objectType;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
            this.maxDegreeOfParallelismPerJob = Objects.requireNonNull(maxDegreeOfParallelismPerJob);
            return this;
        }

        public Builder setMinPriorityPerJob(Integer minPriorityPerJob) {
            this.minPriorityPerJob = Objects.requireNonNull(minPriorityPerJob);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ComputePolicyResponse build() {
            return new ComputePolicyResponse(id, maxDegreeOfParallelismPerJob, minPriorityPerJob, name, objectId, objectType, type);
        }
    }
}
