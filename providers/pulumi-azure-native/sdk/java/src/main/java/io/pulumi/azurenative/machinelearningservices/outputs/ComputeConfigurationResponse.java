// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeConfigurationResponse {
    private final @Nullable Integer instanceCount;
    private final @Nullable String instanceType;
    private final @Nullable Boolean isLocal;
    private final @Nullable String location;
    private final @Nullable Map<String,String> properties;
    private final @Nullable String target;

    @OutputCustomType.Constructor({"instanceCount","instanceType","isLocal","location","properties","target"})
    private ComputeConfigurationResponse(
        @Nullable Integer instanceCount,
        @Nullable String instanceType,
        @Nullable Boolean isLocal,
        @Nullable String location,
        @Nullable Map<String,String> properties,
        @Nullable String target) {
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.isLocal = isLocal;
        this.location = location;
        this.properties = properties;
        this.target = target;
    }

    public Optional<Integer> getInstanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    public Optional<String> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public Optional<Boolean> getIsLocal() {
        return Optional.ofNullable(this.isLocal);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceCount;
        private @Nullable String instanceType;
        private @Nullable Boolean isLocal;
        private @Nullable String location;
        private @Nullable Map<String,String> properties;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.isLocal = defaults.isLocal;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.target = defaults.target;
        }

        public Builder setInstanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setIsLocal(@Nullable Boolean isLocal) {
            this.isLocal = isLocal;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public ComputeConfigurationResponse build() {
            return new ComputeConfigurationResponse(instanceCount, instanceType, isLocal, location, properties, target);
        }
    }
}
