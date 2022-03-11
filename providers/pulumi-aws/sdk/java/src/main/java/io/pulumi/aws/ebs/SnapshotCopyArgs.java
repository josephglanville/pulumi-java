// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotCopyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotCopyArgs Empty = new SnapshotCopyArgs();

    /**
     * A description of what the snapshot is.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @InputImport(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @InputImport(name="permanentRestore")
      private final @Nullable Output<Boolean> permanentRestore;

    public Output<Boolean> getPermanentRestore() {
        return this.permanentRestore == null ? Output.empty() : this.permanentRestore;
    }

    /**
     * The region of the source snapshot.
     * 
     */
    @InputImport(name="sourceRegion", required=true)
      private final Output<String> sourceRegion;

    public Output<String> getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * The ARN for the snapshot to be copied.
     * 
     */
    @InputImport(name="sourceSnapshotId", required=true)
      private final Output<String> sourceSnapshotId;

    public Output<String> getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @InputImport(name="storageTier")
      private final @Nullable Output<String> storageTier;

    public Output<String> getStorageTier() {
        return this.storageTier == null ? Output.empty() : this.storageTier;
    }

    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @InputImport(name="temporaryRestoreDays")
      private final @Nullable Output<Integer> temporaryRestoreDays;

    public Output<Integer> getTemporaryRestoreDays() {
        return this.temporaryRestoreDays == null ? Output.empty() : this.temporaryRestoreDays;
    }

    public SnapshotCopyArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<Boolean> permanentRestore,
        Output<String> sourceRegion,
        Output<String> sourceSnapshotId,
        @Nullable Output<String> storageTier,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> temporaryRestoreDays) {
        this.description = description;
        this.encrypted = encrypted;
        this.kmsKeyId = kmsKeyId;
        this.permanentRestore = permanentRestore;
        this.sourceRegion = Objects.requireNonNull(sourceRegion, "expected parameter 'sourceRegion' to be non-null");
        this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId, "expected parameter 'sourceSnapshotId' to be non-null");
        this.storageTier = storageTier;
        this.tags = tags;
        this.temporaryRestoreDays = temporaryRestoreDays;
    }

    private SnapshotCopyArgs() {
        this.description = Output.empty();
        this.encrypted = Output.empty();
        this.kmsKeyId = Output.empty();
        this.permanentRestore = Output.empty();
        this.sourceRegion = Output.empty();
        this.sourceSnapshotId = Output.empty();
        this.storageTier = Output.empty();
        this.tags = Output.empty();
        this.temporaryRestoreDays = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<Boolean> permanentRestore;
        private Output<String> sourceRegion;
        private Output<String> sourceSnapshotId;
        private @Nullable Output<String> storageTier;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> temporaryRestoreDays;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotCopyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.permanentRestore = defaults.permanentRestore;
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.storageTier = defaults.storageTier;
    	      this.tags = defaults.tags;
    	      this.temporaryRestoreDays = defaults.temporaryRestoreDays;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Output.ofNullable(encrypted);
            return this;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }

        public Builder permanentRestore(@Nullable Output<Boolean> permanentRestore) {
            this.permanentRestore = permanentRestore;
            return this;
        }

        public Builder permanentRestore(@Nullable Boolean permanentRestore) {
            this.permanentRestore = Output.ofNullable(permanentRestore);
            return this;
        }

        public Builder sourceRegion(Output<String> sourceRegion) {
            this.sourceRegion = Objects.requireNonNull(sourceRegion);
            return this;
        }

        public Builder sourceRegion(String sourceRegion) {
            this.sourceRegion = Output.of(Objects.requireNonNull(sourceRegion));
            return this;
        }

        public Builder sourceSnapshotId(Output<String> sourceSnapshotId) {
            this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId);
            return this;
        }

        public Builder sourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = Output.of(Objects.requireNonNull(sourceSnapshotId));
            return this;
        }

        public Builder storageTier(@Nullable Output<String> storageTier) {
            this.storageTier = storageTier;
            return this;
        }

        public Builder storageTier(@Nullable String storageTier) {
            this.storageTier = Output.ofNullable(storageTier);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder temporaryRestoreDays(@Nullable Output<Integer> temporaryRestoreDays) {
            this.temporaryRestoreDays = temporaryRestoreDays;
            return this;
        }

        public Builder temporaryRestoreDays(@Nullable Integer temporaryRestoreDays) {
            this.temporaryRestoreDays = Output.ofNullable(temporaryRestoreDays);
            return this;
        }
        public SnapshotCopyArgs build() {
            return new SnapshotCopyArgs(description, encrypted, kmsKeyId, permanentRestore, sourceRegion, sourceSnapshotId, storageTier, tags, temporaryRestoreDays);
        }
    }
}
