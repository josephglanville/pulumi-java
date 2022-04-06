// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.ReceiptRuleArgs;
import io.pulumi.aws.ses.inputs.ReceiptRuleState;
import io.pulumi.aws.ses.outputs.ReceiptRuleAddHeaderAction;
import io.pulumi.aws.ses.outputs.ReceiptRuleBounceAction;
import io.pulumi.aws.ses.outputs.ReceiptRuleLambdaAction;
import io.pulumi.aws.ses.outputs.ReceiptRuleS3Action;
import io.pulumi.aws.ses.outputs.ReceiptRuleSnsAction;
import io.pulumi.aws.ses.outputs.ReceiptRuleStopAction;
import io.pulumi.aws.ses.outputs.ReceiptRuleWorkmailAction;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an SES receipt rule resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES receipt rules can be imported using the ruleset name and rule name separated by `:`.
 * 
 * ```sh
 *  $ pulumi import aws:ses/receiptRule:ReceiptRule my_rule my_rule_set:my_rule
 * ```
 * 
 */
@ResourceType(type="aws:ses/receiptRule:ReceiptRule")
public class ReceiptRule extends io.pulumi.resources.CustomResource {
    /**
     * A list of Add Header Action blocks. Documented below.
     * 
     */
    @Export(name="addHeaderActions", type=List.class, parameters={ReceiptRuleAddHeaderAction.class})
    private Output</* @Nullable */ List<ReceiptRuleAddHeaderAction>> addHeaderActions;

    /**
     * @return A list of Add Header Action blocks. Documented below.
     * 
     */
    public Output</* @Nullable */ List<ReceiptRuleAddHeaderAction>> getAddHeaderActions() {
        return this.addHeaderActions;
    }
    /**
     * The name of the rule to place this rule after
     * 
     */
    @Export(name="after", type=String.class, parameters={})
    private Output</* @Nullable */ String> after;

    /**
     * @return The name of the rule to place this rule after
     * 
     */
    public Output</* @Nullable */ String> getAfter() {
        return this.after;
    }
    /**
     * The SES receipt rule ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The SES receipt rule ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A list of Bounce Action blocks. Documented below.
     * 
     */
    @Export(name="bounceActions", type=List.class, parameters={ReceiptRuleBounceAction.class})
    private Output</* @Nullable */ List<ReceiptRuleBounceAction>> bounceActions;

    /**
     * @return A list of Bounce Action blocks. Documented below.
     * 
     */
    public Output</* @Nullable */ List<ReceiptRuleBounceAction>> getBounceActions() {
        return this.bounceActions;
    }
    /**
     * If true, the rule will be enabled
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If true, the rule will be enabled
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * A list of Lambda Action blocks. Documented below.
     * 
     */
    @Export(name="lambdaActions", type=List.class, parameters={ReceiptRuleLambdaAction.class})
    private Output</* @Nullable */ List<ReceiptRuleLambdaAction>> lambdaActions;

    /**
     * @return A list of Lambda Action blocks. Documented below.
     * 
     */
    public Output</* @Nullable */ List<ReceiptRuleLambdaAction>> getLambdaActions() {
        return this.lambdaActions;
    }
    /**
     * The name of the rule
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the rule
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of email addresses
     * 
     */
    @Export(name="recipients", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> recipients;

    /**
     * @return A list of email addresses
     * 
     */
    public Output</* @Nullable */ List<String>> getRecipients() {
        return this.recipients;
    }
    /**
     * The name of the rule set
     * 
     */
    @Export(name="ruleSetName", type=String.class, parameters={})
    private Output<String> ruleSetName;

    /**
     * @return The name of the rule set
     * 
     */
    public Output<String> getRuleSetName() {
        return this.ruleSetName;
    }
    /**
     * A list of S3 Action blocks. Documented below.
     * 
     */
    @Export(name="s3Actions", type=List.class, parameters={ReceiptRuleS3Action.class})
    private Output</* @Nullable */ List<ReceiptRuleS3Action>> s3Actions;

    /**
     * @return A list of S3 Action blocks. Documented below.
     * 
     */
    public Output</* @Nullable */ List<ReceiptRuleS3Action>> getS3Actions() {
        return this.s3Actions;
    }
    /**
     * If true, incoming emails will be scanned for spam and viruses
     * 
     */
    @Export(name="scanEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> scanEnabled;

    /**
     * @return If true, incoming emails will be scanned for spam and viruses
     * 
     */
    public Output</* @Nullable */ Boolean> getScanEnabled() {
        return this.scanEnabled;
    }
    /**
     * A list of SNS Action blocks. Documented below.
     * 
     */
    @Export(name="snsActions", type=List.class, parameters={ReceiptRuleSnsAction.class})
    private Output</* @Nullable */ List<ReceiptRuleSnsAction>> snsActions;

    /**
     * @return A list of SNS Action blocks. Documented below.
     * 
     */
    public Output</* @Nullable */ List<ReceiptRuleSnsAction>> getSnsActions() {
        return this.snsActions;
    }
    /**
     * A list of Stop Action blocks. Documented below.
     * 
     */
    @Export(name="stopActions", type=List.class, parameters={ReceiptRuleStopAction.class})
    private Output</* @Nullable */ List<ReceiptRuleStopAction>> stopActions;

    /**
     * @return A list of Stop Action blocks. Documented below.
     * 
     */
    public Output</* @Nullable */ List<ReceiptRuleStopAction>> getStopActions() {
        return this.stopActions;
    }
    /**
     * `Require` or `Optional`
     * 
     */
    @Export(name="tlsPolicy", type=String.class, parameters={})
    private Output<String> tlsPolicy;

    /**
     * @return `Require` or `Optional`
     * 
     */
    public Output<String> getTlsPolicy() {
        return this.tlsPolicy;
    }
    /**
     * A list of WorkMail Action blocks. Documented below.
     * 
     */
    @Export(name="workmailActions", type=List.class, parameters={ReceiptRuleWorkmailAction.class})
    private Output</* @Nullable */ List<ReceiptRuleWorkmailAction>> workmailActions;

    /**
     * @return A list of WorkMail Action blocks. Documented below.
     * 
     */
    public Output</* @Nullable */ List<ReceiptRuleWorkmailAction>> getWorkmailActions() {
        return this.workmailActions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReceiptRule(String name) {
        this(name, ReceiptRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReceiptRule(String name, ReceiptRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReceiptRule(String name, ReceiptRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRule:ReceiptRule", name, args == null ? ReceiptRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ReceiptRule(String name, Output<String> id, @Nullable ReceiptRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRule:ReceiptRule", name, state, makeResourceOptions(options, id));
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
    public static ReceiptRule get(String name, Output<String> id, @Nullable ReceiptRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReceiptRule(name, id, state, options);
    }
}