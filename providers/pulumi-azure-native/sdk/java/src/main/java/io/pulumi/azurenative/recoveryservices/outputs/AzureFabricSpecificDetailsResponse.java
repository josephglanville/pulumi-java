// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFabricSpecificDetailsResponse {
    private final @Nullable List<String> containerIds;
    private final String instanceType;
    private final @Nullable String location;

    @OutputCustomType.Constructor({"containerIds","instanceType","location"})
    private AzureFabricSpecificDetailsResponse(
        @Nullable List<String> containerIds,
        String instanceType,
        @Nullable String location) {
        this.containerIds = containerIds;
        this.instanceType = Objects.requireNonNull(instanceType);
        this.location = location;
    }

    public List<String> getContainerIds() {
        return this.containerIds == null ? List.of() : this.containerIds;
    }
    public String getInstanceType() {
        return this.instanceType;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFabricSpecificDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containerIds;
        private String instanceType;
        private @Nullable String location;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFabricSpecificDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerIds = defaults.containerIds;
    	      this.instanceType = defaults.instanceType;
    	      this.location = defaults.location;
        }

        public Builder setContainerIds(@Nullable List<String> containerIds) {
            this.containerIds = containerIds;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public AzureFabricSpecificDetailsResponse build() {
            return new AzureFabricSpecificDetailsResponse(containerIds, instanceType, location);
        }
    }
}
