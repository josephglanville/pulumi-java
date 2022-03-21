// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateCognitoConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateOidcConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleFixedResponseConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleForwardConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleRedirectConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionArgs Empty = new ListenerRuleActionArgs();

    @Import(name="authenticateCognitoConfig")
      private final @Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig;

    public Output<ListenerRuleAuthenticateCognitoConfigArgs> getAuthenticateCognitoConfig() {
        return this.authenticateCognitoConfig == null ? Output.empty() : this.authenticateCognitoConfig;
    }

    @Import(name="authenticateOidcConfig")
      private final @Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig;

    public Output<ListenerRuleAuthenticateOidcConfigArgs> getAuthenticateOidcConfig() {
        return this.authenticateOidcConfig == null ? Output.empty() : this.authenticateOidcConfig;
    }

    @Import(name="fixedResponseConfig")
      private final @Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig;

    public Output<ListenerRuleFixedResponseConfigArgs> getFixedResponseConfig() {
        return this.fixedResponseConfig == null ? Output.empty() : this.fixedResponseConfig;
    }

    @Import(name="forwardConfig")
      private final @Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig;

    public Output<ListenerRuleForwardConfigArgs> getForwardConfig() {
        return this.forwardConfig == null ? Output.empty() : this.forwardConfig;
    }

    @Import(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> getOrder() {
        return this.order == null ? Output.empty() : this.order;
    }

    @Import(name="redirectConfig")
      private final @Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig;

    public Output<ListenerRuleRedirectConfigArgs> getRedirectConfig() {
        return this.redirectConfig == null ? Output.empty() : this.redirectConfig;
    }

    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Output.empty() : this.targetGroupArn;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ListenerRuleActionArgs(
        @Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig,
        @Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig,
        @Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig,
        @Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig,
        @Nullable Output<Integer> order,
        @Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig,
        @Nullable Output<String> targetGroupArn,
        Output<String> type) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
        this.authenticateOidcConfig = authenticateOidcConfig;
        this.fixedResponseConfig = fixedResponseConfig;
        this.forwardConfig = forwardConfig;
        this.order = order;
        this.redirectConfig = redirectConfig;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerRuleActionArgs() {
        this.authenticateCognitoConfig = Output.empty();
        this.authenticateOidcConfig = Output.empty();
        this.fixedResponseConfig = Output.empty();
        this.forwardConfig = Output.empty();
        this.order = Output.empty();
        this.redirectConfig = Output.empty();
        this.targetGroupArn = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig;
        private @Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig;
        private @Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig;
        private @Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig;
        private @Nullable Output<Integer> order;
        private @Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig;
        private @Nullable Output<String> targetGroupArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognitoConfig = defaults.authenticateCognitoConfig;
    	      this.authenticateOidcConfig = defaults.authenticateOidcConfig;
    	      this.fixedResponseConfig = defaults.fixedResponseConfig;
    	      this.forwardConfig = defaults.forwardConfig;
    	      this.order = defaults.order;
    	      this.redirectConfig = defaults.redirectConfig;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognitoConfig(@Nullable Output<ListenerRuleAuthenticateCognitoConfigArgs> authenticateCognitoConfig) {
            this.authenticateCognitoConfig = authenticateCognitoConfig;
            return this;
        }
        public Builder authenticateCognitoConfig(@Nullable ListenerRuleAuthenticateCognitoConfigArgs authenticateCognitoConfig) {
            this.authenticateCognitoConfig = Output.ofNullable(authenticateCognitoConfig);
            return this;
        }
        public Builder authenticateOidcConfig(@Nullable Output<ListenerRuleAuthenticateOidcConfigArgs> authenticateOidcConfig) {
            this.authenticateOidcConfig = authenticateOidcConfig;
            return this;
        }
        public Builder authenticateOidcConfig(@Nullable ListenerRuleAuthenticateOidcConfigArgs authenticateOidcConfig) {
            this.authenticateOidcConfig = Output.ofNullable(authenticateOidcConfig);
            return this;
        }
        public Builder fixedResponseConfig(@Nullable Output<ListenerRuleFixedResponseConfigArgs> fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public Builder fixedResponseConfig(@Nullable ListenerRuleFixedResponseConfigArgs fixedResponseConfig) {
            this.fixedResponseConfig = Output.ofNullable(fixedResponseConfig);
            return this;
        }
        public Builder forwardConfig(@Nullable Output<ListenerRuleForwardConfigArgs> forwardConfig) {
            this.forwardConfig = forwardConfig;
            return this;
        }
        public Builder forwardConfig(@Nullable ListenerRuleForwardConfigArgs forwardConfig) {
            this.forwardConfig = Output.ofNullable(forwardConfig);
            return this;
        }
        public Builder order(@Nullable Output<Integer> order) {
            this.order = order;
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = Output.ofNullable(order);
            return this;
        }
        public Builder redirectConfig(@Nullable Output<ListenerRuleRedirectConfigArgs> redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public Builder redirectConfig(@Nullable ListenerRuleRedirectConfigArgs redirectConfig) {
            this.redirectConfig = Output.ofNullable(redirectConfig);
            return this;
        }
        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Output.ofNullable(targetGroupArn);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ListenerRuleActionArgs build() {
            return new ListenerRuleActionArgs(authenticateCognitoConfig, authenticateOidcConfig, fixedResponseConfig, forwardConfig, order, redirectConfig, targetGroupArn, type);
        }
    }
}
