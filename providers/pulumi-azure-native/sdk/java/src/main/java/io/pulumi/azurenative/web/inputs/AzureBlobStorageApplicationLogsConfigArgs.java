// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.LogLevel;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application logs azure blob storage configuration.
 * 
 */
public final class AzureBlobStorageApplicationLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobStorageApplicationLogsConfigArgs Empty = new AzureBlobStorageApplicationLogsConfigArgs();

    /**
     * Log level.
     * 
     */
    @InputImport(name="level")
      private final @Nullable Input<LogLevel> level;

    public Input<LogLevel> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    /**
     * Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     * 
     */
    @InputImport(name="retentionInDays")
      private final @Nullable Input<Integer> retentionInDays;

    public Input<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Input.empty() : this.retentionInDays;
    }

    /**
     * SAS url to a azure blob container with read/write/list/delete permissions.
     * 
     */
    @InputImport(name="sasUrl")
      private final @Nullable Input<String> sasUrl;

    public Input<String> getSasUrl() {
        return this.sasUrl == null ? Input.empty() : this.sasUrl;
    }

    public AzureBlobStorageApplicationLogsConfigArgs(
        @Nullable Input<LogLevel> level,
        @Nullable Input<Integer> retentionInDays,
        @Nullable Input<String> sasUrl) {
        this.level = level;
        this.retentionInDays = retentionInDays;
        this.sasUrl = sasUrl;
    }

    private AzureBlobStorageApplicationLogsConfigArgs() {
        this.level = Input.empty();
        this.retentionInDays = Input.empty();
        this.sasUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageApplicationLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LogLevel> level;
        private @Nullable Input<Integer> retentionInDays;
        private @Nullable Input<String> sasUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageApplicationLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.sasUrl = defaults.sasUrl;
        }

        public Builder setLevel(@Nullable Input<LogLevel> level) {
            this.level = level;
            return this;
        }

        public Builder setLevel(@Nullable LogLevel level) {
            this.level = Input.ofNullable(level);
            return this;
        }

        public Builder setRetentionInDays(@Nullable Input<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Input.ofNullable(retentionInDays);
            return this;
        }

        public Builder setSasUrl(@Nullable Input<String> sasUrl) {
            this.sasUrl = sasUrl;
            return this;
        }

        public Builder setSasUrl(@Nullable String sasUrl) {
            this.sasUrl = Input.ofNullable(sasUrl);
            return this;
        }
        public AzureBlobStorageApplicationLogsConfigArgs build() {
            return new AzureBlobStorageApplicationLogsConfigArgs(level, retentionInDays, sasUrl);
        }
    }
}
