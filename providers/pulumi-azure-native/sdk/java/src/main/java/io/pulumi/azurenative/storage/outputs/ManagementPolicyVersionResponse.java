// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.DateAfterCreationResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementPolicyVersionResponse {
    /**
     * The function to delete the blob version
     * 
     */
    private final @Nullable DateAfterCreationResponse delete;
    /**
     * The function to tier blob version to archive storage. Support blob version currently at Hot or Cool tier
     * 
     */
    private final @Nullable DateAfterCreationResponse tierToArchive;
    /**
     * The function to tier blob version to cool storage. Support blob version currently at Hot tier
     * 
     */
    private final @Nullable DateAfterCreationResponse tierToCool;

    @CustomType.Constructor
    private ManagementPolicyVersionResponse(
        @CustomType.Parameter("delete") @Nullable DateAfterCreationResponse delete,
        @CustomType.Parameter("tierToArchive") @Nullable DateAfterCreationResponse tierToArchive,
        @CustomType.Parameter("tierToCool") @Nullable DateAfterCreationResponse tierToCool) {
        this.delete = delete;
        this.tierToArchive = tierToArchive;
        this.tierToCool = tierToCool;
    }

    /**
     * The function to delete the blob version
     * 
    */
    public Optional<DateAfterCreationResponse> getDelete() {
        return Optional.ofNullable(this.delete);
    }
    /**
     * The function to tier blob version to archive storage. Support blob version currently at Hot or Cool tier
     * 
    */
    public Optional<DateAfterCreationResponse> getTierToArchive() {
        return Optional.ofNullable(this.tierToArchive);
    }
    /**
     * The function to tier blob version to cool storage. Support blob version currently at Hot tier
     * 
    */
    public Optional<DateAfterCreationResponse> getTierToCool() {
        return Optional.ofNullable(this.tierToCool);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DateAfterCreationResponse delete;
        private @Nullable DateAfterCreationResponse tierToArchive;
        private @Nullable DateAfterCreationResponse tierToCool;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.tierToArchive = defaults.tierToArchive;
    	      this.tierToCool = defaults.tierToCool;
        }

        public Builder delete(@Nullable DateAfterCreationResponse delete) {
            this.delete = delete;
            return this;
        }
        public Builder tierToArchive(@Nullable DateAfterCreationResponse tierToArchive) {
            this.tierToArchive = tierToArchive;
            return this;
        }
        public Builder tierToCool(@Nullable DateAfterCreationResponse tierToCool) {
            this.tierToCool = tierToCool;
            return this;
        }        public ManagementPolicyVersionResponse build() {
            return new ManagementPolicyVersionResponse(delete, tierToArchive, tierToCool);
        }
    }
}
