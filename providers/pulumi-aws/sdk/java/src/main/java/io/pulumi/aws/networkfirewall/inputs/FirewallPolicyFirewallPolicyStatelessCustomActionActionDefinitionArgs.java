// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs Empty = new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs();

    /**
     * A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
     * 
     */
    @Import(name="publishMetricAction", required=true)
      private final Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction;

    public Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> getPublishMetricAction() {
        return this.publishMetricAction;
    }

    public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs(Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction) {
        this.publishMetricAction = Objects.requireNonNull(publishMetricAction, "expected parameter 'publishMetricAction' to be non-null");
    }

    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs() {
        this.publishMetricAction = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder publishMetricAction(Output<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction) {
            this.publishMetricAction = Objects.requireNonNull(publishMetricAction);
            return this;
        }
        public Builder publishMetricAction(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionArgs publishMetricAction) {
            this.publishMetricAction = Output.of(Objects.requireNonNull(publishMetricAction));
            return this;
        }        public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs build() {
            return new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionArgs(publishMetricAction);
        }
    }
}
