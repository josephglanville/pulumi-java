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
 * The service properties for soft delete.
 * 
 */
public final class DeleteRetentionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeleteRetentionPolicyResponse Empty = new DeleteRetentionPolicyResponse();

    /**
     * Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     * 
     */
    @Import(name="days")
      private final @Nullable Integer days;

    public Optional<Integer> getDays() {
        return this.days == null ? Optional.empty() : Optional.ofNullable(this.days);
    }

    /**
     * Indicates whether DeleteRetentionPolicy is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public DeleteRetentionPolicyResponse(
        @Nullable Integer days,
        @Nullable Boolean enabled) {
        this.days = days;
        this.enabled = enabled;
    }

    private DeleteRetentionPolicyResponse() {
        this.days = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeleteRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DeleteRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public DeleteRetentionPolicyResponse build() {
            return new DeleteRetentionPolicyResponse(days, enabled);
        }
    }
}
