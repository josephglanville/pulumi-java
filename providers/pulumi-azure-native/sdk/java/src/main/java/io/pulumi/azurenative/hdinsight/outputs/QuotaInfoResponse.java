// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QuotaInfoResponse {
    /**
     * The cores used by the cluster.
     * 
     */
    private final @Nullable Integer coresUsed;

    @CustomType.Constructor
    private QuotaInfoResponse(@CustomType.Parameter("coresUsed") @Nullable Integer coresUsed) {
        this.coresUsed = coresUsed;
    }

    /**
     * The cores used by the cluster.
     * 
    */
    public Optional<Integer> getCoresUsed() {
        return Optional.ofNullable(this.coresUsed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer coresUsed;

        public Builder() {
    	      // Empty
        }

        public Builder(QuotaInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coresUsed = defaults.coresUsed;
        }

        public Builder coresUsed(@Nullable Integer coresUsed) {
            this.coresUsed = coresUsed;
            return this;
        }        public QuotaInfoResponse build() {
            return new QuotaInfoResponse(coresUsed);
        }
    }
}
