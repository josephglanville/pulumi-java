// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.RuleArgs;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheExpirationActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheKeyQueryStringActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleCookiesConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleHttpVersionConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleIsDeviceConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRulePostArgsConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleQueryStringConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRemoteAddressConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestBodyConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestMethodConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestSchemeConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestUriConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleResponseHeaderActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileExtensionConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileNameConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlPathConditionResponse;
import io.pulumi.azurenative.cdn.outputs.OriginGroupOverrideActionResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.azurenative.cdn.outputs.UrlRedirectActionResponse;
import io.pulumi.azurenative.cdn.outputs.UrlRewriteActionResponse;
import io.pulumi.azurenative.cdn.outputs.UrlSigningActionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Friendly Rules name mapping to the any Rules or secret related information.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:Rule rule1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/ruleSets/ruleSet1/rules/rule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Rule")
public class Rule extends io.pulumi.resources.CustomResource {
    /**
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    @OutputExport(name="actions", type=List.class, parameters={Object.class})
    private Output<List<Object>> actions;

    /**
     * @return A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    public Output<List<Object>> getActions() {
        return this.actions;
    }
    /**
     * A list of conditions that must be matched for the actions to be executed
     * 
     */
    @OutputExport(name="conditions", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> conditions;

    /**
     * @return A list of conditions that must be matched for the actions to be executed
     * 
     */
    public Output</* @Nullable */ List<Object>> getConditions() {
        return this.conditions;
    }
    @OutputExport(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    @OutputExport(name="matchProcessingBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> matchProcessingBehavior;

    /**
     * @return If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    public Output</* @Nullable */ String> getMatchProcessingBehavior() {
        return this.matchProcessingBehavior;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    @OutputExport(name="order", type=Integer.class, parameters={})
    private Output<Integer> order;

    /**
     * @return The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    public Output<Integer> getOrder() {
        return this.order;
    }
    /**
     * Provisioning status
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Rule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Rule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:Rule").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:Rule").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Rule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, options);
    }
}
