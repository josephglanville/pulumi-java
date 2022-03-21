// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class TablePointInTimeRecovery {
    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private TablePointInTimeRecovery(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TablePointInTimeRecovery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(TablePointInTimeRecovery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public TablePointInTimeRecovery build() {
            return new TablePointInTimeRecovery(enabled);
        }
    }
}
