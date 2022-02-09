// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.DateAfterModificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementPolicyBaseBlobArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyBaseBlobArgs Empty = new ManagementPolicyBaseBlobArgs();

    @InputImport(name="delete")
    private final @Nullable Input<DateAfterModificationArgs> delete;

    public Input<DateAfterModificationArgs> getDelete() {
        return this.delete == null ? Input.empty() : this.delete;
    }

    @InputImport(name="enableAutoTierToHotFromCool")
    private final @Nullable Input<Boolean> enableAutoTierToHotFromCool;

    public Input<Boolean> getEnableAutoTierToHotFromCool() {
        return this.enableAutoTierToHotFromCool == null ? Input.empty() : this.enableAutoTierToHotFromCool;
    }

    @InputImport(name="tierToArchive")
    private final @Nullable Input<DateAfterModificationArgs> tierToArchive;

    public Input<DateAfterModificationArgs> getTierToArchive() {
        return this.tierToArchive == null ? Input.empty() : this.tierToArchive;
    }

    @InputImport(name="tierToCool")
    private final @Nullable Input<DateAfterModificationArgs> tierToCool;

    public Input<DateAfterModificationArgs> getTierToCool() {
        return this.tierToCool == null ? Input.empty() : this.tierToCool;
    }

    public ManagementPolicyBaseBlobArgs(
        @Nullable Input<DateAfterModificationArgs> delete,
        @Nullable Input<Boolean> enableAutoTierToHotFromCool,
        @Nullable Input<DateAfterModificationArgs> tierToArchive,
        @Nullable Input<DateAfterModificationArgs> tierToCool) {
        this.delete = delete;
        this.enableAutoTierToHotFromCool = enableAutoTierToHotFromCool;
        this.tierToArchive = tierToArchive;
        this.tierToCool = tierToCool;
    }

    private ManagementPolicyBaseBlobArgs() {
        this.delete = Input.empty();
        this.enableAutoTierToHotFromCool = Input.empty();
        this.tierToArchive = Input.empty();
        this.tierToCool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyBaseBlobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DateAfterModificationArgs> delete;
        private @Nullable Input<Boolean> enableAutoTierToHotFromCool;
        private @Nullable Input<DateAfterModificationArgs> tierToArchive;
        private @Nullable Input<DateAfterModificationArgs> tierToCool;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyBaseBlobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.enableAutoTierToHotFromCool = defaults.enableAutoTierToHotFromCool;
    	      this.tierToArchive = defaults.tierToArchive;
    	      this.tierToCool = defaults.tierToCool;
        }

        public Builder setDelete(@Nullable Input<DateAfterModificationArgs> delete) {
            this.delete = delete;
            return this;
        }

        public Builder setDelete(@Nullable DateAfterModificationArgs delete) {
            this.delete = Input.ofNullable(delete);
            return this;
        }

        public Builder setEnableAutoTierToHotFromCool(@Nullable Input<Boolean> enableAutoTierToHotFromCool) {
            this.enableAutoTierToHotFromCool = enableAutoTierToHotFromCool;
            return this;
        }

        public Builder setEnableAutoTierToHotFromCool(@Nullable Boolean enableAutoTierToHotFromCool) {
            this.enableAutoTierToHotFromCool = Input.ofNullable(enableAutoTierToHotFromCool);
            return this;
        }

        public Builder setTierToArchive(@Nullable Input<DateAfterModificationArgs> tierToArchive) {
            this.tierToArchive = tierToArchive;
            return this;
        }

        public Builder setTierToArchive(@Nullable DateAfterModificationArgs tierToArchive) {
            this.tierToArchive = Input.ofNullable(tierToArchive);
            return this;
        }

        public Builder setTierToCool(@Nullable Input<DateAfterModificationArgs> tierToCool) {
            this.tierToCool = tierToCool;
            return this;
        }

        public Builder setTierToCool(@Nullable DateAfterModificationArgs tierToCool) {
            this.tierToCool = Input.ofNullable(tierToCool);
            return this;
        }

        public ManagementPolicyBaseBlobArgs build() {
            return new ManagementPolicyBaseBlobArgs(delete, enableAutoTierToHotFromCool, tierToArchive, tierToCool);
        }
    }
}
