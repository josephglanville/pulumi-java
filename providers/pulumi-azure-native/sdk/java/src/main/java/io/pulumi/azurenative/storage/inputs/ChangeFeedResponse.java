// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The blob service properties for change feed events.
 * 
 */
public final class ChangeFeedResponse extends io.pulumi.resources.InvokeArgs {

    public static final ChangeFeedResponse Empty = new ChangeFeedResponse();

    /**
     * Indicates whether change feed event logging is enabled for the Blob service.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * Indicates the duration of changeFeed retention in days. Minimum value is 1 day and maximum value is 146000 days (400 years). A null value indicates an infinite retention of the change feed.
     * 
     */
    @Import(name="retentionInDays")
      private final @Nullable Integer retentionInDays;

    public Optional<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Optional.empty() : Optional.ofNullable(this.retentionInDays);
    }

    public ChangeFeedResponse(
        @Nullable Boolean enabled,
        @Nullable Integer retentionInDays) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
    }

    private ChangeFeedResponse() {
        this.enabled = null;
        this.retentionInDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChangeFeedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer retentionInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(ChangeFeedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }        public ChangeFeedResponse build() {
            return new ChangeFeedResponse(enabled, retentionInDays);
        }
    }
}
