// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Fabric Specific Details.
 * 
 */
public final class AzureFabricSpecificDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFabricSpecificDetailsResponse Empty = new AzureFabricSpecificDetailsResponse();

    /**
     * The container Ids for the Azure fabric.
     * 
     */
    @InputImport(name="containerIds")
      private final @Nullable List<String> containerIds;

    public List<String> getContainerIds() {
        return this.containerIds == null ? List.of() : this.containerIds;
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'Azure'.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The Location for the Azure fabric.
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    public AzureFabricSpecificDetailsResponse(
        @Nullable List<String> containerIds,
        String instanceType,
        @Nullable String location) {
        this.containerIds = containerIds;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.location = location;
    }

    private AzureFabricSpecificDetailsResponse() {
        this.containerIds = List.of();
        this.instanceType = null;
        this.location = null;
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
