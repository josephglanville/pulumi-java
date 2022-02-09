// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListServerGatewayStatusResult {
    private final @Nullable Integer status;

    @OutputCustomType.Constructor({"status"})
    private ListServerGatewayStatusResult(@Nullable Integer status) {
        this.status = status;
    }

    public Optional<Integer> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListServerGatewayStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer status;

        public Builder() {
    	      // Empty
        }

        public Builder(ListServerGatewayStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(@Nullable Integer status) {
            this.status = status;
            return this;
        }

        public ListServerGatewayStatusResult build() {
            return new ListServerGatewayStatusResult(status);
        }
    }
}
