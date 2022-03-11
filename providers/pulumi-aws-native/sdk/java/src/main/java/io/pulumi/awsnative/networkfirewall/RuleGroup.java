// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkfirewall.RuleGroupArgs;
import io.pulumi.awsnative.networkfirewall.enums.RuleGroupTypeEnum;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource type definition for AWS::NetworkFirewall::RuleGroup
 * 
 */
@ResourceType(type="aws-native:networkfirewall:RuleGroup")
public class RuleGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="ruleGroup", type=io.pulumi.awsnative.networkfirewall.outputs.RuleGroup.class, parameters={})
    private Output</* @Nullable */ io.pulumi.awsnative.networkfirewall.outputs.RuleGroup> ruleGroup;

    public Output</* @Nullable */ io.pulumi.awsnative.networkfirewall.outputs.RuleGroup> getRuleGroup() {
        return this.ruleGroup;
    }
    @OutputExport(name="ruleGroupArn", type=String.class, parameters={})
    private Output<String> ruleGroupArn;

    public Output<String> getRuleGroupArn() {
        return this.ruleGroupArn;
    }
    @OutputExport(name="ruleGroupId", type=String.class, parameters={})
    private Output<String> ruleGroupId;

    public Output<String> getRuleGroupId() {
        return this.ruleGroupId;
    }
    @OutputExport(name="ruleGroupName", type=String.class, parameters={})
    private Output<String> ruleGroupName;

    public Output<String> getRuleGroupName() {
        return this.ruleGroupName;
    }
    @OutputExport(name="tags", type=List.class, parameters={RuleGroupTag.class})
    private Output</* @Nullable */ List<RuleGroupTag>> tags;

    public Output</* @Nullable */ List<RuleGroupTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=RuleGroupTypeEnum.class, parameters={})
    private Output<RuleGroupTypeEnum> type;

    public Output<RuleGroupTypeEnum> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(RuleGroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.networkfirewall.RuleGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.networkfirewall.RuleGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RuleGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuleGroup(String name) {
        this(name, RuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleGroup(String name, RuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleGroup(String name, RuleGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:RuleGroup", name, args == null ? RuleGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RuleGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:RuleGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static RuleGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RuleGroup(name, id, options);
    }
}
