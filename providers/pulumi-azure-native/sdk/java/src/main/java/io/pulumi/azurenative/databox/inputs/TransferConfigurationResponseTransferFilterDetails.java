// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.TransferFilterDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransferConfigurationResponseTransferFilterDetails extends io.pulumi.resources.InvokeArgs {

    public static final TransferConfigurationResponseTransferFilterDetails Empty = new TransferConfigurationResponseTransferFilterDetails();

    @InputImport(name="include")
    private final @Nullable TransferFilterDetailsResponse include;

    public Optional<TransferFilterDetailsResponse> getInclude() {
        return this.include == null ? Optional.empty() : Optional.ofNullable(this.include);
    }

    public TransferConfigurationResponseTransferFilterDetails(@Nullable TransferFilterDetailsResponse include) {
        this.include = include;
    }

    private TransferConfigurationResponseTransferFilterDetails() {
        this.include = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationResponseTransferFilterDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferFilterDetailsResponse include;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationResponseTransferFilterDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
        }

        public Builder setInclude(@Nullable TransferFilterDetailsResponse include) {
            this.include = include;
            return this;
        }

        public TransferConfigurationResponseTransferFilterDetails build() {
            return new TransferConfigurationResponseTransferFilterDetails(include);
        }
    }
}
