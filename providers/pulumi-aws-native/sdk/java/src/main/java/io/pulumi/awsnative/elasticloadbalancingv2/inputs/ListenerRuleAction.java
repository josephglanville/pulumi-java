// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateCognitoConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleAuthenticateOidcConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleFixedResponseConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleForwardConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleRedirectConfig;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleAction extends io.pulumi.resources.InvokeArgs {

    public static final ListenerRuleAction Empty = new ListenerRuleAction();

    @Import(name="authenticateCognitoConfig")
      private final @Nullable ListenerRuleAuthenticateCognitoConfig authenticateCognitoConfig;

    public Optional<ListenerRuleAuthenticateCognitoConfig> getAuthenticateCognitoConfig() {
        return this.authenticateCognitoConfig == null ? Optional.empty() : Optional.ofNullable(this.authenticateCognitoConfig);
    }

    @Import(name="authenticateOidcConfig")
      private final @Nullable ListenerRuleAuthenticateOidcConfig authenticateOidcConfig;

    public Optional<ListenerRuleAuthenticateOidcConfig> getAuthenticateOidcConfig() {
        return this.authenticateOidcConfig == null ? Optional.empty() : Optional.ofNullable(this.authenticateOidcConfig);
    }

    @Import(name="fixedResponseConfig")
      private final @Nullable ListenerRuleFixedResponseConfig fixedResponseConfig;

    public Optional<ListenerRuleFixedResponseConfig> getFixedResponseConfig() {
        return this.fixedResponseConfig == null ? Optional.empty() : Optional.ofNullable(this.fixedResponseConfig);
    }

    @Import(name="forwardConfig")
      private final @Nullable ListenerRuleForwardConfig forwardConfig;

    public Optional<ListenerRuleForwardConfig> getForwardConfig() {
        return this.forwardConfig == null ? Optional.empty() : Optional.ofNullable(this.forwardConfig);
    }

    @Import(name="order")
      private final @Nullable Integer order;

    public Optional<Integer> getOrder() {
        return this.order == null ? Optional.empty() : Optional.ofNullable(this.order);
    }

    @Import(name="redirectConfig")
      private final @Nullable ListenerRuleRedirectConfig redirectConfig;

    public Optional<ListenerRuleRedirectConfig> getRedirectConfig() {
        return this.redirectConfig == null ? Optional.empty() : Optional.ofNullable(this.redirectConfig);
    }

    @Import(name="targetGroupArn")
      private final @Nullable String targetGroupArn;

    public Optional<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Optional.empty() : Optional.ofNullable(this.targetGroupArn);
    }

    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ListenerRuleAction(
        @Nullable ListenerRuleAuthenticateCognitoConfig authenticateCognitoConfig,
        @Nullable ListenerRuleAuthenticateOidcConfig authenticateOidcConfig,
        @Nullable ListenerRuleFixedResponseConfig fixedResponseConfig,
        @Nullable ListenerRuleForwardConfig forwardConfig,
        @Nullable Integer order,
        @Nullable ListenerRuleRedirectConfig redirectConfig,
        @Nullable String targetGroupArn,
        String type) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
        this.authenticateOidcConfig = authenticateOidcConfig;
        this.fixedResponseConfig = fixedResponseConfig;
        this.forwardConfig = forwardConfig;
        this.order = order;
        this.redirectConfig = redirectConfig;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerRuleAction() {
        this.authenticateCognitoConfig = null;
        this.authenticateOidcConfig = null;
        this.fixedResponseConfig = null;
        this.forwardConfig = null;
        this.order = null;
        this.redirectConfig = null;
        this.targetGroupArn = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerRuleAuthenticateCognitoConfig authenticateCognitoConfig;
        private @Nullable ListenerRuleAuthenticateOidcConfig authenticateOidcConfig;
        private @Nullable ListenerRuleFixedResponseConfig fixedResponseConfig;
        private @Nullable ListenerRuleForwardConfig forwardConfig;
        private @Nullable Integer order;
        private @Nullable ListenerRuleRedirectConfig redirectConfig;
        private @Nullable String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleAction defaults) {
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

        public Builder authenticateCognitoConfig(@Nullable ListenerRuleAuthenticateCognitoConfig authenticateCognitoConfig) {
            this.authenticateCognitoConfig = authenticateCognitoConfig;
            return this;
        }
        public Builder authenticateOidcConfig(@Nullable ListenerRuleAuthenticateOidcConfig authenticateOidcConfig) {
            this.authenticateOidcConfig = authenticateOidcConfig;
            return this;
        }
        public Builder fixedResponseConfig(@Nullable ListenerRuleFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public Builder forwardConfig(@Nullable ListenerRuleForwardConfig forwardConfig) {
            this.forwardConfig = forwardConfig;
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        public Builder redirectConfig(@Nullable ListenerRuleRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListenerRuleAction build() {
            return new ListenerRuleAction(authenticateCognitoConfig, authenticateOidcConfig, fixedResponseConfig, forwardConfig, order, redirectConfig, targetGroupArn, type);
        }
    }
}
