// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wafv2.RegexPatternSetArgs;
import io.pulumi.awsnative.wafv2.enums.RegexPatternSetScope;
import io.pulumi.awsnative.wafv2.outputs.RegexPatternSetTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains a list of Regular expressions based on the provided inputs. RegexPatternSet can be used with other WAF entities with RegexPatternSetReferenceStatement to perform other actions .
 * 
 */
@ResourceType(type="aws-native:wafv2:RegexPatternSet")
public class RegexPatternSet extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the WAF entity.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the WAF entity.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of the entity.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the entity.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the RegexPatternSet.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the RegexPatternSet.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @Export(name="regularExpressionList", type=List.class, parameters={String.class})
    private Output<List<String>> regularExpressionList;

    public Output<List<String>> getRegularExpressionList() {
        return this.regularExpressionList;
    }
    /**
     * Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    @Export(name="scope", type=RegexPatternSetScope.class, parameters={})
    private Output<RegexPatternSetScope> scope;

    /**
     * @return Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    public Output<RegexPatternSetScope> getScope() {
        return this.scope;
    }
    @Export(name="tags", type=List.class, parameters={RegexPatternSetTag.class})
    private Output</* @Nullable */ List<RegexPatternSetTag>> tags;

    public Output</* @Nullable */ List<RegexPatternSetTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegexPatternSet(String name) {
        this(name, RegexPatternSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegexPatternSet(String name, RegexPatternSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegexPatternSet(String name, RegexPatternSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:RegexPatternSet", name, args == null ? RegexPatternSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegexPatternSet(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:RegexPatternSet", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegexPatternSet get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegexPatternSet(name, id, options);
    }
}
