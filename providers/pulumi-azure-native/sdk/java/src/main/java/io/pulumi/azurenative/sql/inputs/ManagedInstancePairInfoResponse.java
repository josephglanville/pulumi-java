// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstancePairInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedInstancePairInfoResponse Empty = new ManagedInstancePairInfoResponse();

    @InputImport(name="partnerManagedInstanceId")
    private final @Nullable String partnerManagedInstanceId;

    public Optional<String> getPartnerManagedInstanceId() {
        return this.partnerManagedInstanceId == null ? Optional.empty() : Optional.ofNullable(this.partnerManagedInstanceId);
    }

    @InputImport(name="primaryManagedInstanceId")
    private final @Nullable String primaryManagedInstanceId;

    public Optional<String> getPrimaryManagedInstanceId() {
        return this.primaryManagedInstanceId == null ? Optional.empty() : Optional.ofNullable(this.primaryManagedInstanceId);
    }

    public ManagedInstancePairInfoResponse(
        @Nullable String partnerManagedInstanceId,
        @Nullable String primaryManagedInstanceId) {
        this.partnerManagedInstanceId = partnerManagedInstanceId;
        this.primaryManagedInstanceId = primaryManagedInstanceId;
    }

    private ManagedInstancePairInfoResponse() {
        this.partnerManagedInstanceId = null;
        this.primaryManagedInstanceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePairInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String partnerManagedInstanceId;
        private @Nullable String primaryManagedInstanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstancePairInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerManagedInstanceId = defaults.partnerManagedInstanceId;
    	      this.primaryManagedInstanceId = defaults.primaryManagedInstanceId;
        }

        public Builder setPartnerManagedInstanceId(@Nullable String partnerManagedInstanceId) {
            this.partnerManagedInstanceId = partnerManagedInstanceId;
            return this;
        }

        public Builder setPrimaryManagedInstanceId(@Nullable String primaryManagedInstanceId) {
            this.primaryManagedInstanceId = primaryManagedInstanceId;
            return this;
        }

        public ManagedInstancePairInfoResponse build() {
            return new ManagedInstancePairInfoResponse(partnerManagedInstanceId, primaryManagedInstanceId);
        }
    }
}
