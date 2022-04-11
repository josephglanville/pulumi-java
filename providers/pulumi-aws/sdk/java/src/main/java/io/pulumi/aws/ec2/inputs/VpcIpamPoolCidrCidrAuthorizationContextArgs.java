// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamPoolCidrCidrAuthorizationContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamPoolCidrCidrAuthorizationContextArgs Empty = new VpcIpamPoolCidrCidrAuthorizationContextArgs();

    /**
     * The plain-text authorization message for the prefix and account.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    /**
     * The signed authorization message for the prefix and account.
     * 
     */
    @Import(name="signature")
      private final @Nullable Output<String> signature;

    public Output<String> getSignature() {
        return this.signature == null ? Codegen.empty() : this.signature;
    }

    public VpcIpamPoolCidrCidrAuthorizationContextArgs(
        @Nullable Output<String> message,
        @Nullable Output<String> signature) {
        this.message = message;
        this.signature = signature;
    }

    private VpcIpamPoolCidrCidrAuthorizationContextArgs() {
        this.message = Codegen.empty();
        this.signature = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamPoolCidrCidrAuthorizationContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> message;
        private @Nullable Output<String> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamPoolCidrCidrAuthorizationContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.signature = defaults.signature;
        }

        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }
        public Builder signature(@Nullable Output<String> signature) {
            this.signature = signature;
            return this;
        }
        public Builder signature(@Nullable String signature) {
            this.signature = Codegen.ofNullable(signature);
            return this;
        }        public VpcIpamPoolCidrCidrAuthorizationContextArgs build() {
            return new VpcIpamPoolCidrCidrAuthorizationContextArgs(message, signature);
        }
    }
}
