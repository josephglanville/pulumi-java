// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ManagementPolicyBaseBlobArgs;
import io.pulumi.azurenative.storage.inputs.ManagementPolicySnapShotArgs;
import io.pulumi.azurenative.storage.inputs.ManagementPolicyVersionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Actions are applied to the filtered blobs when the execution condition is met.
 * 
 */
public final class ManagementPolicyActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyActionArgs Empty = new ManagementPolicyActionArgs();

    /**
     * The management policy action for base blob
     * 
     */
    @Import(name="baseBlob")
      private final @Nullable Output<ManagementPolicyBaseBlobArgs> baseBlob;

    public Output<ManagementPolicyBaseBlobArgs> getBaseBlob() {
        return this.baseBlob == null ? Output.empty() : this.baseBlob;
    }

    /**
     * The management policy action for snapshot
     * 
     */
    @Import(name="snapshot")
      private final @Nullable Output<ManagementPolicySnapShotArgs> snapshot;

    public Output<ManagementPolicySnapShotArgs> getSnapshot() {
        return this.snapshot == null ? Output.empty() : this.snapshot;
    }

    /**
     * The management policy action for version
     * 
     */
    @Import(name="version")
      private final @Nullable Output<ManagementPolicyVersionArgs> version;

    public Output<ManagementPolicyVersionArgs> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ManagementPolicyActionArgs(
        @Nullable Output<ManagementPolicyBaseBlobArgs> baseBlob,
        @Nullable Output<ManagementPolicySnapShotArgs> snapshot,
        @Nullable Output<ManagementPolicyVersionArgs> version) {
        this.baseBlob = baseBlob;
        this.snapshot = snapshot;
        this.version = version;
    }

    private ManagementPolicyActionArgs() {
        this.baseBlob = Output.empty();
        this.snapshot = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ManagementPolicyBaseBlobArgs> baseBlob;
        private @Nullable Output<ManagementPolicySnapShotArgs> snapshot;
        private @Nullable Output<ManagementPolicyVersionArgs> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseBlob = defaults.baseBlob;
    	      this.snapshot = defaults.snapshot;
    	      this.version = defaults.version;
        }

        public Builder baseBlob(@Nullable Output<ManagementPolicyBaseBlobArgs> baseBlob) {
            this.baseBlob = baseBlob;
            return this;
        }
        public Builder baseBlob(@Nullable ManagementPolicyBaseBlobArgs baseBlob) {
            this.baseBlob = Output.ofNullable(baseBlob);
            return this;
        }
        public Builder snapshot(@Nullable Output<ManagementPolicySnapShotArgs> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder snapshot(@Nullable ManagementPolicySnapShotArgs snapshot) {
            this.snapshot = Output.ofNullable(snapshot);
            return this;
        }
        public Builder version(@Nullable Output<ManagementPolicyVersionArgs> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable ManagementPolicyVersionArgs version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public ManagementPolicyActionArgs build() {
            return new ManagementPolicyActionArgs(baseBlob, snapshot, version);
        }
    }
}
