// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.ReceiptRuleSetArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleSetState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SES receipt rule set resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES receipt rule sets can be imported using the rule set name.
 * 
 * ```sh
 *  $ pulumi import aws:ses/receiptRuleSet:ReceiptRuleSet my_rule_set my_rule_set_name
 * ```
 * 
 */
@ResourceType(type="aws:ses/receiptRuleSet:ReceiptRuleSet")
public class ReceiptRuleSet extends io.pulumi.resources.CustomResource {
    /**
     * SES receipt rule set ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return SES receipt rule set ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the rule set.
     * 
     */
    @Export(name="ruleSetName", type=String.class, parameters={})
    private Output<String> ruleSetName;

    /**
     * @return Name of the rule set.
     * 
     */
    public Output<String> getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReceiptRuleSet(String name) {
        this(name, ReceiptRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReceiptRuleSet(String name, ReceiptRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReceiptRuleSet(String name, ReceiptRuleSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRuleSet:ReceiptRuleSet", name, args == null ? ReceiptRuleSetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ReceiptRuleSet(String name, Output<String> id, @Nullable ReceiptRuleSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRuleSet:ReceiptRuleSet", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static ReceiptRuleSet get(String name, Output<String> id, @Nullable ReceiptRuleSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReceiptRuleSet(name, id, state, options);
    }
}