// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the input for dtmf event.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1DtmfInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1DtmfInputArgs Empty = new GoogleCloudDialogflowCxV3beta1DtmfInputArgs();

    /**
     * The dtmf digits.
     * 
     */
    @Import(name="digits")
      private final @Nullable Output<String> digits;

    public Output<String> getDigits() {
        return this.digits == null ? Codegen.empty() : this.digits;
    }

    /**
     * The finish digit (if any).
     * 
     */
    @Import(name="finishDigit")
      private final @Nullable Output<String> finishDigit;

    public Output<String> getFinishDigit() {
        return this.finishDigit == null ? Codegen.empty() : this.finishDigit;
    }

    public GoogleCloudDialogflowCxV3beta1DtmfInputArgs(
        @Nullable Output<String> digits,
        @Nullable Output<String> finishDigit) {
        this.digits = digits;
        this.finishDigit = finishDigit;
    }

    private GoogleCloudDialogflowCxV3beta1DtmfInputArgs() {
        this.digits = Codegen.empty();
        this.finishDigit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1DtmfInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> digits;
        private @Nullable Output<String> finishDigit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1DtmfInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digits = defaults.digits;
    	      this.finishDigit = defaults.finishDigit;
        }

        public Builder digits(@Nullable Output<String> digits) {
            this.digits = digits;
            return this;
        }
        public Builder digits(@Nullable String digits) {
            this.digits = Codegen.ofNullable(digits);
            return this;
        }
        public Builder finishDigit(@Nullable Output<String> finishDigit) {
            this.finishDigit = finishDigit;
            return this;
        }
        public Builder finishDigit(@Nullable String finishDigit) {
            this.finishDigit = Codegen.ofNullable(finishDigit);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1DtmfInputArgs build() {
            return new GoogleCloudDialogflowCxV3beta1DtmfInputArgs(digits, finishDigit);
        }
    }
}
