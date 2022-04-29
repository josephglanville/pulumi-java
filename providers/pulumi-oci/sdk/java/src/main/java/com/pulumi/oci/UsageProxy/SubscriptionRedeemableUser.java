// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.UsageProxy;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.UsageProxy.SubscriptionRedeemableUserArgs;
import com.pulumi.oci.UsageProxy.inputs.SubscriptionRedeemableUserState;
import com.pulumi.oci.UsageProxy.outputs.SubscriptionRedeemableUserItem;
import com.pulumi.oci.Utilities;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource provides the Subscription Redeemable User resource in Oracle Cloud Infrastructure Usage Proxy service.
 * 
 * Adds the list of redeemable user email IDs for a subscription ID.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SubscriptionRedeemableUsers can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:UsageProxy/subscriptionRedeemableUser:SubscriptionRedeemableUser test_subscription_redeemable_user &#34;subscriptions/{subscriptionId}/redeemableUsers/tenancyId/{tenancyId}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:UsageProxy/subscriptionRedeemableUser:SubscriptionRedeemableUser")
public class SubscriptionRedeemableUser extends com.pulumi.resources.CustomResource {
    /**
     * The list of email IDs to be added to the list of users that can redeem rewards.
     * 
     */
    @Export(name="items", type=List.class, parameters={SubscriptionRedeemableUserItem.class})
    private Output<List<SubscriptionRedeemableUserItem>> items;

    /**
     * @return The list of email IDs to be added to the list of users that can redeem rewards.
     * 
     */
    public Output<List<SubscriptionRedeemableUserItem>> items() {
        return this.items;
    }
    /**
     * The subscription ID for which rewards information is requested for.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return The subscription ID for which rewards information is requested for.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * The OCID of the tenancy.
     * 
     */
    @Export(name="tenancyId", type=String.class, parameters={})
    private Output<String> tenancyId;

    /**
     * @return The OCID of the tenancy.
     * 
     */
    public Output<String> tenancyId() {
        return this.tenancyId;
    }
    /**
     * The user ID of the person to send a copy of an email.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return The user ID of the person to send a copy of an email.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubscriptionRedeemableUser(String name) {
        this(name, SubscriptionRedeemableUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubscriptionRedeemableUser(String name, SubscriptionRedeemableUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubscriptionRedeemableUser(String name, SubscriptionRedeemableUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:UsageProxy/subscriptionRedeemableUser:SubscriptionRedeemableUser", name, args == null ? SubscriptionRedeemableUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SubscriptionRedeemableUser(String name, Output<String> id, @Nullable SubscriptionRedeemableUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:UsageProxy/subscriptionRedeemableUser:SubscriptionRedeemableUser", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SubscriptionRedeemableUser get(String name, Output<String> id, @Nullable SubscriptionRedeemableUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SubscriptionRedeemableUser(name, id, state, options);
    }
}
