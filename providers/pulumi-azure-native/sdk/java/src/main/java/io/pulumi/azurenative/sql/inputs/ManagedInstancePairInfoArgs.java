// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedInstancePairInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedInstancePairInfoArgs Empty = new ManagedInstancePairInfoArgs();

    @InputImport(name="partnerManagedInstanceId")
    private final @Nullable Input<String> partnerManagedInstanceId;

    public Input<String> getPartnerManagedInstanceId() {
        return this.partnerManagedInstanceId == null ? Input.empty() : this.partnerManagedInstanceId;
    }

    @InputImport(name="primaryManagedInstanceId")
    private final @Nullable Input<String> primaryManagedInstanceId;

    public Input<String> getPrimaryManagedInstanceId() {
        return this.primaryManagedInstanceId == null ? Input.empty() : this.primaryManagedInstanceId;
    }

    public ManagedInstancePairInfoArgs(
        @Nullable Input<String> partnerManagedInstanceId,
        @Nullable Input<String> primaryManagedInstanceId) {
        this.partnerManagedInstanceId = partnerManagedInstanceId;
        this.primaryManagedInstanceId = primaryManagedInstanceId;
    }

    private ManagedInstancePairInfoArgs() {
        this.partnerManagedInstanceId = Input.empty();
        this.primaryManagedInstanceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePairInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> partnerManagedInstanceId;
        private @Nullable Input<String> primaryManagedInstanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstancePairInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerManagedInstanceId = defaults.partnerManagedInstanceId;
    	      this.primaryManagedInstanceId = defaults.primaryManagedInstanceId;
        }

        public Builder setPartnerManagedInstanceId(@Nullable Input<String> partnerManagedInstanceId) {
            this.partnerManagedInstanceId = partnerManagedInstanceId;
            return this;
        }

        public Builder setPartnerManagedInstanceId(@Nullable String partnerManagedInstanceId) {
            this.partnerManagedInstanceId = Input.ofNullable(partnerManagedInstanceId);
            return this;
        }

        public Builder setPrimaryManagedInstanceId(@Nullable Input<String> primaryManagedInstanceId) {
            this.primaryManagedInstanceId = primaryManagedInstanceId;
            return this;
        }

        public Builder setPrimaryManagedInstanceId(@Nullable String primaryManagedInstanceId) {
            this.primaryManagedInstanceId = Input.ofNullable(primaryManagedInstanceId);
            return this;
        }

        public ManagedInstancePairInfoArgs build() {
            return new ManagedInstancePairInfoArgs(partnerManagedInstanceId, primaryManagedInstanceId);
        }
    }
}
