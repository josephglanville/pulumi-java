// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.inputs.RestorePointSourceMetadataResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Restore Point details.
 * 
 */
public final class RestorePointResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestorePointResponse Empty = new RestorePointResponse();

    /**
     * Gets the consistency mode for the restore point. Please refer to https://aka.ms/RestorePoints for more details.
     * 
     */
    @InputImport(name="consistencyMode", required=true)
      private final String consistencyMode;

    public String getConsistencyMode() {
        return this.consistencyMode;
    }

    /**
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    @InputImport(name="excludeDisks")
      private final @Nullable List<ApiEntityReferenceResponse> excludeDisks;

    public List<ApiEntityReferenceResponse> getExcludeDisks() {
        return this.excludeDisks == null ? List.of() : this.excludeDisks;
    }

    /**
     * Resource Id
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Resource name
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Gets the provisioning state of the restore point.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Gets the details of the VM captured at the time of the restore point creation.
     * 
     */
    @InputImport(name="sourceMetadata", required=true)
      private final RestorePointSourceMetadataResponse sourceMetadata;

    public RestorePointSourceMetadataResponse getSourceMetadata() {
        return this.sourceMetadata;
    }

    /**
     * Gets the creation time of the restore point.
     * 
     */
    @InputImport(name="timeCreated")
      private final @Nullable String timeCreated;

    public Optional<String> getTimeCreated() {
        return this.timeCreated == null ? Optional.empty() : Optional.ofNullable(this.timeCreated);
    }

    /**
     * Resource type
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public RestorePointResponse(
        String consistencyMode,
        @Nullable List<ApiEntityReferenceResponse> excludeDisks,
        String id,
        String name,
        String provisioningState,
        RestorePointSourceMetadataResponse sourceMetadata,
        @Nullable String timeCreated,
        String type) {
        this.consistencyMode = Objects.requireNonNull(consistencyMode, "expected parameter 'consistencyMode' to be non-null");
        this.excludeDisks = excludeDisks;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.sourceMetadata = Objects.requireNonNull(sourceMetadata, "expected parameter 'sourceMetadata' to be non-null");
        this.timeCreated = timeCreated;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RestorePointResponse() {
        this.consistencyMode = null;
        this.excludeDisks = List.of();
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.sourceMetadata = null;
        this.timeCreated = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consistencyMode;
        private @Nullable List<ApiEntityReferenceResponse> excludeDisks;
        private String id;
        private String name;
        private String provisioningState;
        private RestorePointSourceMetadataResponse sourceMetadata;
        private @Nullable String timeCreated;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consistencyMode = defaults.consistencyMode;
    	      this.excludeDisks = defaults.excludeDisks;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceMetadata = defaults.sourceMetadata;
    	      this.timeCreated = defaults.timeCreated;
    	      this.type = defaults.type;
        }

        public Builder setConsistencyMode(String consistencyMode) {
            this.consistencyMode = Objects.requireNonNull(consistencyMode);
            return this;
        }

        public Builder setExcludeDisks(@Nullable List<ApiEntityReferenceResponse> excludeDisks) {
            this.excludeDisks = excludeDisks;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSourceMetadata(RestorePointSourceMetadataResponse sourceMetadata) {
            this.sourceMetadata = Objects.requireNonNull(sourceMetadata);
            return this;
        }

        public Builder setTimeCreated(@Nullable String timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RestorePointResponse build() {
            return new RestorePointResponse(consistencyMode, excludeDisks, id, name, provisioningState, sourceMetadata, timeCreated, type);
        }
    }
}
