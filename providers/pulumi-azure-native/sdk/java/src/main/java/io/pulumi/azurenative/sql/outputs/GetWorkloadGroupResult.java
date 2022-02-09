// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadGroupResult {
    private final String id;
    private final @Nullable String importance;
    private final Integer maxResourcePercent;
    private final @Nullable Double maxResourcePercentPerRequest;
    private final Integer minResourcePercent;
    private final Double minResourcePercentPerRequest;
    private final String name;
    private final @Nullable Integer queryExecutionTimeout;
    private final String type;

    @OutputCustomType.Constructor({"id","importance","maxResourcePercent","maxResourcePercentPerRequest","minResourcePercent","minResourcePercentPerRequest","name","queryExecutionTimeout","type"})
    private GetWorkloadGroupResult(
        String id,
        @Nullable String importance,
        Integer maxResourcePercent,
        @Nullable Double maxResourcePercentPerRequest,
        Integer minResourcePercent,
        Double minResourcePercentPerRequest,
        String name,
        @Nullable Integer queryExecutionTimeout,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.importance = importance;
        this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent);
        this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
        this.minResourcePercent = Objects.requireNonNull(minResourcePercent);
        this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest);
        this.name = Objects.requireNonNull(name);
        this.queryExecutionTimeout = queryExecutionTimeout;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getImportance() {
        return Optional.ofNullable(this.importance);
    }
    public Integer getMaxResourcePercent() {
        return this.maxResourcePercent;
    }
    public Optional<Double> getMaxResourcePercentPerRequest() {
        return Optional.ofNullable(this.maxResourcePercentPerRequest);
    }
    public Integer getMinResourcePercent() {
        return this.minResourcePercent;
    }
    public Double getMinResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }
    public String getName() {
        return this.name;
    }
    public Optional<Integer> getQueryExecutionTimeout() {
        return Optional.ofNullable(this.queryExecutionTimeout);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String importance;
        private Integer maxResourcePercent;
        private @Nullable Double maxResourcePercentPerRequest;
        private Integer minResourcePercent;
        private Double minResourcePercentPerRequest;
        private String name;
        private @Nullable Integer queryExecutionTimeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.importance = defaults.importance;
    	      this.maxResourcePercent = defaults.maxResourcePercent;
    	      this.maxResourcePercentPerRequest = defaults.maxResourcePercentPerRequest;
    	      this.minResourcePercent = defaults.minResourcePercent;
    	      this.minResourcePercentPerRequest = defaults.minResourcePercentPerRequest;
    	      this.name = defaults.name;
    	      this.queryExecutionTimeout = defaults.queryExecutionTimeout;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImportance(@Nullable String importance) {
            this.importance = importance;
            return this;
        }

        public Builder setMaxResourcePercent(Integer maxResourcePercent) {
            this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent);
            return this;
        }

        public Builder setMaxResourcePercentPerRequest(@Nullable Double maxResourcePercentPerRequest) {
            this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
            return this;
        }

        public Builder setMinResourcePercent(Integer minResourcePercent) {
            this.minResourcePercent = Objects.requireNonNull(minResourcePercent);
            return this;
        }

        public Builder setMinResourcePercentPerRequest(Double minResourcePercentPerRequest) {
            this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQueryExecutionTimeout(@Nullable Integer queryExecutionTimeout) {
            this.queryExecutionTimeout = queryExecutionTimeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWorkloadGroupResult build() {
            return new GetWorkloadGroupResult(id, importance, maxResourcePercent, maxResourcePercentPerRequest, minResourcePercent, minResourcePercentPerRequest, name, queryExecutionTimeout, type);
        }
    }
}
