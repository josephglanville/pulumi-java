// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InMageAzureV2ManagedDiskDetailsResponse {
    /**
     * The disk id.
     * 
     */
    private final @Nullable String diskId;
    /**
     * The replica disk type.
     * 
     */
    private final @Nullable String replicaDiskType;
    /**
     * Seed managed disk Id.
     * 
     */
    private final @Nullable String seedManagedDiskId;

    @CustomType.Constructor
    private InMageAzureV2ManagedDiskDetailsResponse(
        @CustomType.Parameter("diskId") @Nullable String diskId,
        @CustomType.Parameter("replicaDiskType") @Nullable String replicaDiskType,
        @CustomType.Parameter("seedManagedDiskId") @Nullable String seedManagedDiskId) {
        this.diskId = diskId;
        this.replicaDiskType = replicaDiskType;
        this.seedManagedDiskId = seedManagedDiskId;
    }

    /**
     * The disk id.
     * 
    */
    public Optional<String> getDiskId() {
        return Optional.ofNullable(this.diskId);
    }
    /**
     * The replica disk type.
     * 
    */
    public Optional<String> getReplicaDiskType() {
        return Optional.ofNullable(this.replicaDiskType);
    }
    /**
     * Seed managed disk Id.
     * 
    */
    public Optional<String> getSeedManagedDiskId() {
        return Optional.ofNullable(this.seedManagedDiskId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAzureV2ManagedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskId;
        private @Nullable String replicaDiskType;
        private @Nullable String seedManagedDiskId;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageAzureV2ManagedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.replicaDiskType = defaults.replicaDiskType;
    	      this.seedManagedDiskId = defaults.seedManagedDiskId;
        }

        public Builder diskId(@Nullable String diskId) {
            this.diskId = diskId;
            return this;
        }
        public Builder replicaDiskType(@Nullable String replicaDiskType) {
            this.replicaDiskType = replicaDiskType;
            return this;
        }
        public Builder seedManagedDiskId(@Nullable String seedManagedDiskId) {
            this.seedManagedDiskId = seedManagedDiskId;
            return this;
        }        public InMageAzureV2ManagedDiskDetailsResponse build() {
            return new InMageAzureV2ManagedDiskDetailsResponse(diskId, replicaDiskType, seedManagedDiskId);
        }
    }
}
