// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudfront.OriginRequestPolicyArgs;
import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyState;
import io.pulumi.aws.cloudfront.outputs.OriginRequestPolicyCookiesConfig;
import io.pulumi.aws.cloudfront.outputs.OriginRequestPolicyHeadersConfig;
import io.pulumi.aws.cloudfront.outputs.OriginRequestPolicyQueryStringsConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:cloudfront/originRequestPolicy:OriginRequestPolicy")
public class OriginRequestPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Comment to describe the origin request policy.
     * 
     */
    @OutputExport(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Comment to describe the origin request policy.
     * 
     */
    public Output</* @Nullable */ String> getComment() {
        return this.comment;
    }
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    @OutputExport(name="cookiesConfig", type=OriginRequestPolicyCookiesConfig.class, parameters={})
    private Output<OriginRequestPolicyCookiesConfig> cookiesConfig;

    /**
     * @return Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    public Output<OriginRequestPolicyCookiesConfig> getCookiesConfig() {
        return this.cookiesConfig;
    }
    /**
     * The current version of the origin request policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The current version of the origin request policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    @OutputExport(name="headersConfig", type=OriginRequestPolicyHeadersConfig.class, parameters={})
    private Output<OriginRequestPolicyHeadersConfig> headersConfig;

    /**
     * @return Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    public Output<OriginRequestPolicyHeadersConfig> getHeadersConfig() {
        return this.headersConfig;
    }
    /**
     * Unique name to identify the origin request policy.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name to identify the origin request policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    @OutputExport(name="queryStringsConfig", type=OriginRequestPolicyQueryStringsConfig.class, parameters={})
    private Output<OriginRequestPolicyQueryStringsConfig> queryStringsConfig;

    /**
     * @return Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    public Output<OriginRequestPolicyQueryStringsConfig> getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public interface BuilderApplicator {
        public void apply(OriginRequestPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.cloudfront.OriginRequestPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudfront.OriginRequestPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public OriginRequestPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OriginRequestPolicy(String name) {
        this(name, OriginRequestPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OriginRequestPolicy(String name, OriginRequestPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OriginRequestPolicy(String name, OriginRequestPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/originRequestPolicy:OriginRequestPolicy", name, args == null ? OriginRequestPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private OriginRequestPolicy(String name, Output<String> id, @Nullable OriginRequestPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/originRequestPolicy:OriginRequestPolicy", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OriginRequestPolicy get(String name, Output<String> id, @Nullable OriginRequestPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OriginRequestPolicy(name, id, state, options);
    }
}
