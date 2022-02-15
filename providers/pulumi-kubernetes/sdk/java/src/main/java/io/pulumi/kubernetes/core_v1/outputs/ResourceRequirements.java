// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceRequirements {
    private final @Nullable Map<String,String> limits;
    private final @Nullable Map<String,String> requests;

    @OutputCustomType.Constructor({"limits","requests"})
    private ResourceRequirements(
        @Nullable Map<String,String> limits,
        @Nullable Map<String,String> requests) {
        this.limits = limits;
        this.requests = requests;
    }

    public Map<String,String> getLimits() {
        return this.limits == null ? Map.of() : this.limits;
    }
    public Map<String,String> getRequests() {
        return this.requests == null ? Map.of() : this.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirements defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> limits;
        private @Nullable Map<String,String> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequirements defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder setLimits(@Nullable Map<String,String> limits) {
            this.limits = limits;
            return this;
        }

        public Builder setRequests(@Nullable Map<String,String> requests) {
            this.requests = requests;
            return this;
        }

        public ResourceRequirements build() {
            return new ResourceRequirements(limits, requests);
        }
    }
}