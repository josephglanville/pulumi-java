// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OspGateway.inputs.SubscriptionSubscriptionArgs;
import java.lang.String;
import java.util.Objects;


public final class SubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * (Updatable) User email
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return (Updatable) User email
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * (Updatable) The home region&#39;s public name of the logged in user.
     * 
     */
    @Import(name="ospHomeRegion", required=true)
    private Output<String> ospHomeRegion;

    /**
     * @return (Updatable) The home region&#39;s public name of the logged in user.
     * 
     */
    public Output<String> ospHomeRegion() {
        return this.ospHomeRegion;
    }

    /**
     * (Updatable) Subscription details object which extends the SubscriptionSummary
     * 
     */
    @Import(name="subscription", required=true)
    private Output<SubscriptionSubscriptionArgs> subscription;

    /**
     * @return (Updatable) Subscription details object which extends the SubscriptionSummary
     * 
     */
    public Output<SubscriptionSubscriptionArgs> subscription() {
        return this.subscription;
    }

    /**
     * Subscription id(OCID).
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Subscription id(OCID).
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private SubscriptionArgs() {}

    private SubscriptionArgs(SubscriptionArgs $) {
        this.compartmentId = $.compartmentId;
        this.email = $.email;
        this.ospHomeRegion = $.ospHomeRegion;
        this.subscription = $.subscription;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionArgs $;

        public Builder() {
            $ = new SubscriptionArgs();
        }

        public Builder(SubscriptionArgs defaults) {
            $ = new SubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param email (Updatable) User email
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email (Updatable) User email
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param ospHomeRegion (Updatable) The home region&#39;s public name of the logged in user.
         * 
         * @return builder
         * 
         */
        public Builder ospHomeRegion(Output<String> ospHomeRegion) {
            $.ospHomeRegion = ospHomeRegion;
            return this;
        }

        /**
         * @param ospHomeRegion (Updatable) The home region&#39;s public name of the logged in user.
         * 
         * @return builder
         * 
         */
        public Builder ospHomeRegion(String ospHomeRegion) {
            return ospHomeRegion(Output.of(ospHomeRegion));
        }

        /**
         * @param subscription (Updatable) Subscription details object which extends the SubscriptionSummary
         * 
         * @return builder
         * 
         */
        public Builder subscription(Output<SubscriptionSubscriptionArgs> subscription) {
            $.subscription = subscription;
            return this;
        }

        /**
         * @param subscription (Updatable) Subscription details object which extends the SubscriptionSummary
         * 
         * @return builder
         * 
         */
        public Builder subscription(SubscriptionSubscriptionArgs subscription) {
            return subscription(Output.of(subscription));
        }

        /**
         * @param subscriptionId Subscription id(OCID).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription id(OCID).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public SubscriptionArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.ospHomeRegion = Objects.requireNonNull($.ospHomeRegion, "expected parameter 'ospHomeRegion' to be non-null");
            $.subscription = Objects.requireNonNull($.subscription, "expected parameter 'subscription' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
