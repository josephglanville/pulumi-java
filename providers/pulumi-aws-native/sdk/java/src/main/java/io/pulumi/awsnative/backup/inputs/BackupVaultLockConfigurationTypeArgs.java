// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupVaultLockConfigurationTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupVaultLockConfigurationTypeArgs Empty = new BackupVaultLockConfigurationTypeArgs();

    @Import(name="changeableForDays")
      private final @Nullable Output<Double> changeableForDays;

    public Output<Double> getChangeableForDays() {
        return this.changeableForDays == null ? Codegen.empty() : this.changeableForDays;
    }

    @Import(name="maxRetentionDays")
      private final @Nullable Output<Double> maxRetentionDays;

    public Output<Double> getMaxRetentionDays() {
        return this.maxRetentionDays == null ? Codegen.empty() : this.maxRetentionDays;
    }

    @Import(name="minRetentionDays", required=true)
      private final Output<Double> minRetentionDays;

    public Output<Double> getMinRetentionDays() {
        return this.minRetentionDays;
    }

    public BackupVaultLockConfigurationTypeArgs(
        @Nullable Output<Double> changeableForDays,
        @Nullable Output<Double> maxRetentionDays,
        Output<Double> minRetentionDays) {
        this.changeableForDays = changeableForDays;
        this.maxRetentionDays = maxRetentionDays;
        this.minRetentionDays = Objects.requireNonNull(minRetentionDays, "expected parameter 'minRetentionDays' to be non-null");
    }

    private BackupVaultLockConfigurationTypeArgs() {
        this.changeableForDays = Codegen.empty();
        this.maxRetentionDays = Codegen.empty();
        this.minRetentionDays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultLockConfigurationTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> changeableForDays;
        private @Nullable Output<Double> maxRetentionDays;
        private Output<Double> minRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultLockConfigurationTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeableForDays = defaults.changeableForDays;
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.minRetentionDays = defaults.minRetentionDays;
        }

        public Builder changeableForDays(@Nullable Output<Double> changeableForDays) {
            this.changeableForDays = changeableForDays;
            return this;
        }
        public Builder changeableForDays(@Nullable Double changeableForDays) {
            this.changeableForDays = Codegen.ofNullable(changeableForDays);
            return this;
        }
        public Builder maxRetentionDays(@Nullable Output<Double> maxRetentionDays) {
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }
        public Builder maxRetentionDays(@Nullable Double maxRetentionDays) {
            this.maxRetentionDays = Codegen.ofNullable(maxRetentionDays);
            return this;
        }
        public Builder minRetentionDays(Output<Double> minRetentionDays) {
            this.minRetentionDays = Objects.requireNonNull(minRetentionDays);
            return this;
        }
        public Builder minRetentionDays(Double minRetentionDays) {
            this.minRetentionDays = Output.of(Objects.requireNonNull(minRetentionDays));
            return this;
        }        public BackupVaultLockConfigurationTypeArgs build() {
            return new BackupVaultLockConfigurationTypeArgs(changeableForDays, maxRetentionDays, minRetentionDays);
        }
    }
}
