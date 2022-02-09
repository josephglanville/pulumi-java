// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadClassifierResult {
    private final @Nullable String context;
    private final @Nullable String endTime;
    private final String id;
    private final @Nullable String importance;
    private final @Nullable String label;
    private final String memberName;
    private final String name;
    private final @Nullable String startTime;
    private final String type;

    @OutputCustomType.Constructor({"context","endTime","id","importance","label","memberName","name","startTime","type"})
    private GetWorkloadClassifierResult(
        @Nullable String context,
        @Nullable String endTime,
        String id,
        @Nullable String importance,
        @Nullable String label,
        String memberName,
        String name,
        @Nullable String startTime,
        String type) {
        this.context = context;
        this.endTime = endTime;
        this.id = Objects.requireNonNull(id);
        this.importance = importance;
        this.label = label;
        this.memberName = Objects.requireNonNull(memberName);
        this.name = Objects.requireNonNull(name);
        this.startTime = startTime;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getContext() {
        return Optional.ofNullable(this.context);
    }
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getImportance() {
        return Optional.ofNullable(this.importance);
    }
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    public String getMemberName() {
        return this.memberName;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadClassifierResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String context;
        private @Nullable String endTime;
        private String id;
        private @Nullable String importance;
        private @Nullable String label;
        private String memberName;
        private String name;
        private @Nullable String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadClassifierResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.importance = defaults.importance;
    	      this.label = defaults.label;
    	      this.memberName = defaults.memberName;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setContext(@Nullable String context) {
            this.context = context;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImportance(@Nullable String importance) {
            this.importance = importance;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setMemberName(String memberName) {
            this.memberName = Objects.requireNonNull(memberName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWorkloadClassifierResult build() {
            return new GetWorkloadClassifierResult(context, endTime, id, importance, label, memberName, name, startTime, type);
        }
    }
}
