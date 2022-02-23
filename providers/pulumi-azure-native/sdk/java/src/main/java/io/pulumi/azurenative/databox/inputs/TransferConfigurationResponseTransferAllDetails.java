// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.TransferAllDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
 * 
 */
public final class TransferConfigurationResponseTransferAllDetails extends io.pulumi.resources.InvokeArgs {

    public static final TransferConfigurationResponseTransferAllDetails Empty = new TransferConfigurationResponseTransferAllDetails();

    /**
     * Details to transfer all data.
     * 
     */
    @InputImport(name="include")
      private final @Nullable TransferAllDetailsResponse include;

    public Optional<TransferAllDetailsResponse> getInclude() {
        return this.include == null ? Optional.empty() : Optional.ofNullable(this.include);
    }

    public TransferConfigurationResponseTransferAllDetails(@Nullable TransferAllDetailsResponse include) {
        this.include = include;
    }

    private TransferConfigurationResponseTransferAllDetails() {
        this.include = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationResponseTransferAllDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferAllDetailsResponse include;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationResponseTransferAllDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
        }

        public Builder setInclude(@Nullable TransferAllDetailsResponse include) {
            this.include = include;
            return this;
        }
        public TransferConfigurationResponseTransferAllDetails build() {
            return new TransferConfigurationResponseTransferAllDetails(include);
        }
    }
}
