// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateCognitoArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleActionAuthenticateOidcArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleActionFixedResponseArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleActionForwardArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleActionRedirectArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionArgs Empty = new ListenerRuleActionArgs();

    /**
     * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * 
     */
    @Import(name="authenticateCognito")
      private final @Nullable Output<ListenerRuleActionAuthenticateCognitoArgs> authenticateCognito;

    public Output<ListenerRuleActionAuthenticateCognitoArgs> getAuthenticateCognito() {
        return this.authenticateCognito == null ? Output.empty() : this.authenticateCognito;
    }

    /**
     * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * 
     */
    @Import(name="authenticateOidc")
      private final @Nullable Output<ListenerRuleActionAuthenticateOidcArgs> authenticateOidc;

    public Output<ListenerRuleActionAuthenticateOidcArgs> getAuthenticateOidc() {
        return this.authenticateOidc == null ? Output.empty() : this.authenticateOidc;
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @Import(name="fixedResponse")
      private final @Nullable Output<ListenerRuleActionFixedResponseArgs> fixedResponse;

    public Output<ListenerRuleActionFixedResponseArgs> getFixedResponse() {
        return this.fixedResponse == null ? Output.empty() : this.fixedResponse;
    }

    /**
     * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`.
     * 
     */
    @Import(name="forward")
      private final @Nullable Output<ListenerRuleActionForwardArgs> forward;

    public Output<ListenerRuleActionForwardArgs> getForward() {
        return this.forward == null ? Output.empty() : this.forward;
    }

    @Import(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> getOrder() {
        return this.order == null ? Output.empty() : this.order;
    }

    /**
     * Information for creating a redirect action. Required if `type` is `redirect`.
     * 
     */
    @Import(name="redirect")
      private final @Nullable Output<ListenerRuleActionRedirectArgs> redirect;

    public Output<ListenerRuleActionRedirectArgs> getRedirect() {
        return this.redirect == null ? Output.empty() : this.redirect;
    }

    /**
     * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Output.empty() : this.targetGroupArn;
    }

    /**
     * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ListenerRuleActionArgs(
        @Nullable Output<ListenerRuleActionAuthenticateCognitoArgs> authenticateCognito,
        @Nullable Output<ListenerRuleActionAuthenticateOidcArgs> authenticateOidc,
        @Nullable Output<ListenerRuleActionFixedResponseArgs> fixedResponse,
        @Nullable Output<ListenerRuleActionForwardArgs> forward,
        @Nullable Output<Integer> order,
        @Nullable Output<ListenerRuleActionRedirectArgs> redirect,
        @Nullable Output<String> targetGroupArn,
        Output<String> type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerRuleActionArgs() {
        this.authenticateCognito = Output.empty();
        this.authenticateOidc = Output.empty();
        this.fixedResponse = Output.empty();
        this.forward = Output.empty();
        this.order = Output.empty();
        this.redirect = Output.empty();
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
        private @Nullable Output<ListenerRuleActionAuthenticateCognitoArgs> authenticateCognito;
        private @Nullable Output<ListenerRuleActionAuthenticateOidcArgs> authenticateOidc;
        private @Nullable Output<ListenerRuleActionFixedResponseArgs> fixedResponse;
        private @Nullable Output<ListenerRuleActionForwardArgs> forward;
        private @Nullable Output<Integer> order;
        private @Nullable Output<ListenerRuleActionRedirectArgs> redirect;
        private @Nullable Output<String> targetGroupArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognito = defaults.authenticateCognito;
    	      this.authenticateOidc = defaults.authenticateOidc;
    	      this.fixedResponse = defaults.fixedResponse;
    	      this.forward = defaults.forward;
    	      this.order = defaults.order;
    	      this.redirect = defaults.redirect;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognito(@Nullable Output<ListenerRuleActionAuthenticateCognitoArgs> authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }
        public Builder authenticateCognito(@Nullable ListenerRuleActionAuthenticateCognitoArgs authenticateCognito) {
            this.authenticateCognito = Output.ofNullable(authenticateCognito);
            return this;
        }
        public Builder authenticateOidc(@Nullable Output<ListenerRuleActionAuthenticateOidcArgs> authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }
        public Builder authenticateOidc(@Nullable ListenerRuleActionAuthenticateOidcArgs authenticateOidc) {
            this.authenticateOidc = Output.ofNullable(authenticateOidc);
            return this;
        }
        public Builder fixedResponse(@Nullable Output<ListenerRuleActionFixedResponseArgs> fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public Builder fixedResponse(@Nullable ListenerRuleActionFixedResponseArgs fixedResponse) {
            this.fixedResponse = Output.ofNullable(fixedResponse);
            return this;
        }
        public Builder forward(@Nullable Output<ListenerRuleActionForwardArgs> forward) {
            this.forward = forward;
            return this;
        }
        public Builder forward(@Nullable ListenerRuleActionForwardArgs forward) {
            this.forward = Output.ofNullable(forward);
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
        public Builder redirect(@Nullable Output<ListenerRuleActionRedirectArgs> redirect) {
            this.redirect = redirect;
            return this;
        }
        public Builder redirect(@Nullable ListenerRuleActionRedirectArgs redirect) {
            this.redirect = Output.ofNullable(redirect);
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
            return new ListenerRuleActionArgs(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
