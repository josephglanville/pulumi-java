// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Http logs to azure blob storage configuration.
 * 
 */
public final class AzureBlobStorageHttpLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobStorageHttpLogsConfigArgs Empty = new AzureBlobStorageHttpLogsConfigArgs();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
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

    public AzureBlobStorageHttpLogsConfigArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> retentionInDays,
        @Nullable Input<String> sasUrl) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
        this.sasUrl = sasUrl;
    }

    private AzureBlobStorageHttpLogsConfigArgs() {
        this.enabled = Input.empty();
        this.retentionInDays = Input.empty();
        this.sasUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageHttpLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> retentionInDays;
        private @Nullable Input<String> sasUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageHttpLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.sasUrl = defaults.sasUrl;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
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
        public AzureBlobStorageHttpLogsConfigArgs build() {
            return new AzureBlobStorageHttpLogsConfigArgs(enabled, retentionInDays, sasUrl);
        }
    }
}
