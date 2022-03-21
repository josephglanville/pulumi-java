// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListAgentPoolQueueStatusResult {
    /**
     * The number of pending runs in the queue
     * 
     */
    private final @Nullable Integer count;

    @CustomType.Constructor
    private ListAgentPoolQueueStatusResult(@CustomType.Parameter("count") @Nullable Integer count) {
        this.count = count;
    }

    /**
     * The number of pending runs in the queue
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAgentPoolQueueStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAgentPoolQueueStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }        public ListAgentPoolQueueStatusResult build() {
            return new ListAgentPoolQueueStatusResult(count);
        }
    }
}
