// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ce;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ce.CostCategoryArgs;
import io.pulumi.awsnative.ce.enums.CostCategoryRuleVersion;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ce:CostCategory")
public class CostCategory extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="defaultValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultValue;

    public Output</* @Nullable */ String> getDefaultValue() {
        return this.defaultValue;
    }
    @OutputExport(name="effectiveStart", type=String.class, parameters={})
    private Output<String> effectiveStart;

    public Output<String> getEffectiveStart() {
        return this.effectiveStart;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="ruleVersion", type=CostCategoryRuleVersion.class, parameters={})
    private Output<CostCategoryRuleVersion> ruleVersion;

    public Output<CostCategoryRuleVersion> getRuleVersion() {
        return this.ruleVersion;
    }
    @OutputExport(name="rules", type=String.class, parameters={})
    private Output<String> rules;

    public Output<String> getRules() {
        return this.rules;
    }
    @OutputExport(name="splitChargeRules", type=String.class, parameters={})
    private Output</* @Nullable */ String> splitChargeRules;

    public Output</* @Nullable */ String> getSplitChargeRules() {
        return this.splitChargeRules;
    }

    public CostCategory(String name, CostCategoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ce:CostCategory", name, args == null ? CostCategoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CostCategory(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ce:CostCategory", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CostCategory get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CostCategory(name, id, options);
    }
}