// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyRuleApplicationProtocolType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleApplicationProtocolArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleApplicationProtocolArgs Empty = new FirewallPolicyRuleApplicationProtocolArgs();

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="protocolType")
    private final @Nullable Input<Either<String,FirewallPolicyRuleApplicationProtocolType>> protocolType;

    public Input<Either<String,FirewallPolicyRuleApplicationProtocolType>> getProtocolType() {
        return this.protocolType == null ? Input.empty() : this.protocolType;
    }

    public FirewallPolicyRuleApplicationProtocolArgs(
        @Nullable Input<Integer> port,
        @Nullable Input<Either<String,FirewallPolicyRuleApplicationProtocolType>> protocolType) {
        this.port = port;
        this.protocolType = protocolType;
    }

    private FirewallPolicyRuleApplicationProtocolArgs() {
        this.port = Input.empty();
        this.protocolType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleApplicationProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> port;
        private @Nullable Input<Either<String,FirewallPolicyRuleApplicationProtocolType>> protocolType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleApplicationProtocolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocolType = defaults.protocolType;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocolType(@Nullable Input<Either<String,FirewallPolicyRuleApplicationProtocolType>> protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        public Builder setProtocolType(@Nullable Either<String,FirewallPolicyRuleApplicationProtocolType> protocolType) {
            this.protocolType = Input.ofNullable(protocolType);
            return this;
        }

        public FirewallPolicyRuleApplicationProtocolArgs build() {
            return new FirewallPolicyRuleApplicationProtocolArgs(port, protocolType);
        }
    }
}
